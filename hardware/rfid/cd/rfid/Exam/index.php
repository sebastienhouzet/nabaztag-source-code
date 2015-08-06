<?php
include("config.php");

// De cette page :
// > $_SESSION['Fab']['id']
// > $_SESSION['Fab']['type']
// > $_SESSION['LastPage']
// > $_SESSION['Planche']

unset($_SESSION['Planche']);
unset($_SESSION['CHECK']);

$_SESSION['LastPage'] = "index.php";

?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">

<head>
<?php include("../head.php"); ?>
	<script language="javascript">
	function ReFresh() {
		location.href = "Exam/check.php"
	}
	</script>
</head>
	
<body>

<?php
$menu['Prod'] = false;
$menu['Exam'] = false;
include("../menu.php"); ?>

	<div id="point">
		<div id="Start">
			<?php
				
				$done = true;
				
				// On lance programme
				$output = array();
				$retour = 0;
				exec ("$exe_checkconfig $defaultCOM", $output, $retour);

				$lines = array();

				// On nettoi les lignes
				foreach($output as $key => $value) {
					if(strlen(trim($value)))
						array_push($lines,trim($value));
				}
				
				if(isset($lines[0])) {
					if($lines[0] == "OK") echo '<img class="ligne1" src="design/ProdStartL1OK.jpg" alt="OK" /><br />';
					else {
						echo '<img class="ligne1" src="design/ProdStartL1NO.jpg" alt="NO" /><br />';
						$done = false;
					}
				} else {
					echo '<img class="ligne1" src="design/ProdStartL1NO.jpg" alt="NO" /><br />';
					$done = false;
				}
				
				
				
				
				$do = true;
				// Vérification de la connexion SQL
				$db = mysql_connect(SQL_HOST, SQL_USER, SQL_PASS);
				if(!$db) $do = false;
				else
					if(!mysql_select_db("rfid",$db))
						$do = false;
				
				if($do)
					echo '<img class="ligne2" src="design/ProdStartL2OK.jpg" alt="OK" /><br />';
				else {
					echo '<img class="ligne2" src="design/ProdStartL2NO.jpg" alt="NO" /><br />';
					echo '<img class="ligne3" src="design/ProdStartL3NO.jpg" alt="NO" /><br />';
					echo '<div></div></body></html>';
					die();
				}
				
				
				
				
				$sql = "SELECT * FROM rfid_fab ORDER BY rfid_fab_last_use DESC";
				$req = mysql_query($sql) or die(mysql_error());
				
				if(mysql_num_rows($req) != 0)
				{
					$data = mysql_fetch_array($req);
					if(isset($data['rfid_fab_id'])) {
						$_SESSION['Fab']['id'] = $data['rfid_fab_id'];
						$_SESSION['Fab']['type'] = $data['rfid_fab_type'];
						$id = $data['rfid_fab_id'];
						$sql2 = "UPDATE rfid_fab SET rfid_fab_last_use = NOW() WHERE rfid_fab_id = '$id'";
						$req2 = mysql_query($sql2) or die(mysql_error());
						if($req2)
							echo '<img class="ligne3" src="design/ProdStartL3OK.jpg" alt="OK" />';
						else {
							echo '<img class="ligne3" src="design/ProdStartL3NO.jpg" alt="NO" /><div class="popup">Error : can not update rfid_fab_last_use</div>';
							$done = false;
						}
					}else {
						echo '<img class="ligne3" src="design/ProdStartL3NO.jpg" alt="NO" /><div class="popup">No field rfid_tag_id</div>';					
						$done = false;
					}
				} else {
					echo '<img class="ligne3" src="design/ProdStartL3NO.jpg" alt="NO" /><div class="popup">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Fab not created</div>';
					$done = false;
				}
				
				
				
				
				if(file_exists(FICHIER_PLANCHE)) {
					$Planche = file_get_contents(FICHIER_PLANCHE);
					$lignes = explode("\n", $Planche);
					foreach($lignes as $key => $value)
						$tab[$key] = explode(",", $value);
					foreach($tab as $key => $soustab) {
						foreach($soustab as $souskey => $value)
							if(strlen(trim($value)) == 0)
								unset($tab[$key][$souskey]);
					}
					$_SESSION['Planche'] = $tab;
				}
				
				
				if($done) {
					?>
			<script language="javascript">
				setTimeout('ReFresh()', 2000);
			</script>
					<?php
				}
			?>
		</div>
	</div>
</body>

</html>