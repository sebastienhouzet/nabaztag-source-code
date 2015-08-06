<?php
include("config.php");
include("../types.php");
session_start();

$DisplayCheck = true;			// On affiche le HTML
$DisplayTagExist = false;		// On affiche la page "Ces Tags on déjà été passé

// On détermine si on est déjà passé sur la page (sinon on affiche le html)
if(isset($_SESSION['CHECK'])) {
	if($_SESSION['CHECK'])
		$DisplayCheck = false;
}

// On affiche la page
if($DisplayCheck) {
	$_SESSION['CHECK'] = true;
	include($htmlinclude."htmlcheck.php");
	exit();
}

// On lance le programme de liaison
$output = array();
$retour = 0;
exec ("$exe_liaison $defaultCOM", $output, $retour);

// Le tableau de retour
$lines = array();

// On nettoi les lignes
foreach($output as $key => $value) {
	if(strlen(trim($value)))
		array_push($lines,trim($value));
}

// Le Nombre de lignes
$i = count($lines);


switch($i) {
	case 1 :
		// Si le programme attent depuis trop longtemps
		// On relance la recherche
		if($lines[0] == "TIMEOUT") {
			$_SESSION['CHECK'] = true;
			header("Location: check.php");
			exit();
		}
		// Si on n'arrive pas à ouvrir le port COM
		if($lines[0] == "CAN T OPEN PORT")
			include($htmlinclude."htmlcantopen.php");
		// Si on n'arrive pas à configurer le port COM
		if($lines[0] == "CAN T CONFIG PORT")
			include($htmlinclude."htmlcantconfig.php");
		// Si il manque l'argument dans le exec (l'argument est le numéro du port
		if($lines[0] == "ERROR NO PORT")
			include($htmlinclude."htmlerrorconfig.php");
		break;
	case 3 :
		// On vérifie que les trois lignes retournées sont correctes
		if(substr($lines[0],0,3) == "L1:" && substr($lines[1],0,3) == "L2:" && substr($lines[2],0,3) == "L3:")
		{
			// Les ids
			$tag[0][0] = substr($lines[0],3);
			$tag[1][0] = substr($lines[1],3);
			$tag[2][0] = substr($lines[2],3);
			
			// Si le type de tag est incorrect on bloque
			if(	$_SESSION['Fab']['type'] != GetTypeRfid($tag[0][0]) ||
				$_SESSION['Fab']['type'] != GetTypeRfid($tag[1][0]) ||
				$_SESSION['Fab']['type'] != GetTypeRfid($tag[2][0])) {
				include("html/htmlerreurtype.php");
				exit();
			}
			
			// Si il existe
			$tag[0][1] = false;
			$tag[1][1] = false;
			$tag[2][1] = false;
			
			// Ouverture de base
			$db = mysql_connect(SQL_HOST, SQL_USER, SQL_PASS);
			if(!$db) die("<p>Impossible de se connecter!</p>");
			else
				if(!mysql_select_db("rfid",$db))
					die("<p>Impossible de s&eacute;l&eacute;ctionner la base.</p>");
			
			// On vérifie si le tag exist
			foreach($tag as $key => $val) {
				$tag_id = $val[0];
				
				$sql = "SELECT * FROM rfid_tag WHERE rfid_tag_serial = '$tag_id'";
				$req = mysql_query($sql) or die(mysql_error());
				
				if(mysql_num_rows($req) != 0) {
					$DisplayTagExist = true;
					$tag[$key][1] = true;
				}
			}
			
			// On lance l'action en fonction des évènements précédents
			if($DisplayTagExist) {
				$_SESSION['CHECK'] = false;
				include($htmlinclude."htmlsametag.php");
			} else {
				$_SESSION['CHECK'] = false;
				$_SESSION['LastPage'] = "check.php";
				header("Location: selecttag.php?t1=" . $tag[0][0] . "&t2=" . $tag[1][0] . "&t3=" . $tag[2][0] . "");
			}
			
		}
		break;
	default:
		echo "Oups...";
		print_r($lines);
		break;
}

?>