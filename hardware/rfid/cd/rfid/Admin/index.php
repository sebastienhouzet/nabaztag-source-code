<?php
include("config.php");

if(isset($_GET['extall'])) {

	// Ouverture de base
	$db = mysql_connect(SQL_HOST, SQL_USER, SQL_PASS);
	if(!$db) die("<p>Impossible de se connecter!</p>");
	else
		if(!mysql_select_db("rfid",$db))
			die("<p>Impossible de s&eacute;l&eacute;ctionner la base.</p>");
			
	$sql = "SELECT * FROM rfid_fab";
	$req = mysql_query($sql) or die(mysql_error());
	
	$tabfab = array();
	
	while($data = mysql_fetch_array($req)) {
		$tabfab[$data['rfid_fab_id']] = $data['rfid_fab_name'];
	}

	$sql = "SELECT rfid_tag_color, rfid_tag_serial, rfid_tag_recolored, rfid_tag_fab FROM rfid_tag";
	$req = mysql_query($sql) or die(mysql_error());

	$lines = "Serial;Color;FabName\n";

	while($data = mysql_fetch_array($req)) {
		$color = $data['rfid_tag_recolored'];
		if($color == 0)
			$color = $data['rfid_tag_color'];
		$serial = $data['rfid_tag_serial'];
		$fab = $tabfab[$data['rfid_tag_fab']];
		$lines = $lines . "$serial;$color;$fab\n";
	}

	if (!empty($HTTP_SERVER_VARS['HTTP_USER_AGENT'])) {
	$HTTP_USER_AGENT = $HTTP_SERVER_VARS['HTTP_USER_AGENT'];
	} elseif (!empty($_SERVER['HTTP_USER_AGENT'])) {
	$HTTP_USER_AGENT = $_SERVER['HTTP_USER_AGENT'];
	}

	if (eregi('MSIE[[:space:]]+[0-9]+\.[0-9]+', $HTTP_USER_AGENT)) { //if browser is IE compatible
		header('Content-Type: application/octetstream');
		header('Content-Disposition: inline; filename="VioletTag' . time() . '.csv"');
		header('Expires: 0');
		header('Cache-Control: must-revalidate, post-check=0, pre-check=0');
		header('Pragma: public');
	} else { //if browser is not IE compatible
		header('Content-Type: application/octet-stream');
		header('Content-Disposition: attachment; filename="VioletTag' . time() . '.csv"');
		header('Expires: 0');
		header('Pragma: no-cache');
	}
	
	die($lines);
}







if(isset($_GET['dump'])) {

	// Ouverture de base
	$db = mysql_connect(SQL_HOST, SQL_USER, SQL_PASS);
	if(!$db) die("<p>Impossible de se connecter!</p>");
	else
		if(!mysql_select_db("rfid",$db))
			die("<p>Impossible de s&eacute;l&eacute;ctionner la base.</p>");
	
	$sql = "SELECT * FROM rfid_fab";
	$req = mysql_query($sql) or die(mysql_error());
	
	$lines = "rfid_fab_id;rfid_fab_name;rfid_fab_type;rfid_fab_creation;rfid_fab_last_use\n";
	
	while($data = mysql_fetch_array($req)) {
		$lines = $lines . $data['rfid_fab_id'] . ";" . $data['rfid_fab_name'] . ";" . $data['rfid_fab_type'] . ";" . $data['rfid_fab_creation'] . ";" . $data['rfid_fab_last_use'] . "\n";
	}

	$sql = "SELECT * FROM rfid_tag";
	$req = mysql_query($sql) or die(mysql_error());

	$lines = $lines . "\n\nrfid_tag_id;rfid_tag_serial;rfid_tag_creation_date;rfid_tag_color;rfid_tag_recolored;rfid_tag_mod_date;rfid_tag_mod_count;rfid_tag_fab\n";

	while($data = mysql_fetch_array($req)) {
		$lines = $lines . $data['rfid_tag_id'] . ";" . $data['rfid_tag_serial'] . ";" . $data['rfid_tag_creation_date'] . ";" . $data['rfid_tag_color'] . ";" . $data['rfid_tag_recolored'] .";" . $data['rfid_tag_mod_date'] . ";" . $data['rfid_tag_mod_count'] . ";" . $data['rfid_tag_fab'] . "\n";
	}

	if (!empty($HTTP_SERVER_VARS['HTTP_USER_AGENT'])) {
	$HTTP_USER_AGENT = $HTTP_SERVER_VARS['HTTP_USER_AGENT'];
	} elseif (!empty($_SERVER['HTTP_USER_AGENT'])) {
	$HTTP_USER_AGENT = $_SERVER['HTTP_USER_AGENT'];
	}

	if (eregi('MSIE[[:space:]]+[0-9]+\.[0-9]+', $HTTP_USER_AGENT)) { //if browser is IE compatible
		header('Content-Type: application/octetstream');
		header('Content-Disposition: inline; filename="VioletTag' . time() . '.csv"');
		header('Expires: 0');
		header('Cache-Control: must-revalidate, post-check=0, pre-check=0');
		header('Pragma: public');
	} else { //if browser is not IE compatible
		header('Content-Type: application/octet-stream');
		header('Content-Disposition: attachment; filename="VioletTag' . time() . '.csv"');
		header('Expires: 0');
		header('Pragma: no-cache');
	}
	
	die($lines);
}










if(isset($_POST['extractfab'])) {

	// Ouverture de base
	$db = mysql_connect(SQL_HOST, SQL_USER, SQL_PASS);
	if(!$db) die("<p>Impossible de se connecter!</p>");
	else
		if(!mysql_select_db("rfid",$db))
			die("<p>Impossible de s&eacute;l&eacute;ctionner la base.</p>");

	$sql = "SELECT rfid_tag_color, rfid_tag_serial, rfid_tag_recolored FROM rfid_tag WHERE rfid_tag_fab = '" . $_POST['extractfab'] . "'";
	$req = mysql_query($sql) or die(mysql_error());

	$lines = "Serial;Color\n";

	while($data = mysql_fetch_array($req)) {
		$color = $data['rfid_tag_recolored'];
		if($color == 0)
			$color = $data['rfid_tag_color'];
		$serial = $data['rfid_tag_serial'];
		$lines = $lines . "$serial;$color\n";
	}

	if (!empty($HTTP_SERVER_VARS['HTTP_USER_AGENT'])) {
	$HTTP_USER_AGENT = $HTTP_SERVER_VARS['HTTP_USER_AGENT'];
	} elseif (!empty($_SERVER['HTTP_USER_AGENT'])) {
	$HTTP_USER_AGENT = $_SERVER['HTTP_USER_AGENT'];
	}

	if (eregi('MSIE[[:space:]]+[0-9]+\.[0-9]+', $HTTP_USER_AGENT)) { //if browser is IE compatible
		header('Content-Type: application/octetstream');
		header('Content-Disposition: inline; filename="VioletTag' . time() . '.csv"');
		header('Expires: 0');
		header('Cache-Control: must-revalidate, post-check=0, pre-check=0');
		header('Pragma: public');
	} else { //if browser is not IE compatible
		header('Content-Type: application/octet-stream');
		header('Content-Disposition: attachment; filename="VioletTag' . time() . '.csv"');
		header('Expires: 0');
		header('Pragma: no-cache');
	}
	
	die($lines);
}















?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">

<head>
<?php include("../head.php"); ?>
</head>
	
<body>
<?php include("../menu.php"); ?>

<h2>Hardware</h2>
<p><strong>Port in use : COM<?php echo $defaultCOM; ?></strong></p>
<?php if(!isset($_GET['step'])) { ?><div><p><a href="Admin/index.php?step=1">Click here to change port</a></p></div><?php } else {
		if($_GET['step'] == 1) { ?><div><p>Select a port COM :
			<form method="post" action="Admin/index.php?step=2" enctype="multipart/form-data">
				<select name="portCOM">
					<?php

					// On lance le compilateur
					$output = array();
					$retour = 0;
					exec ("$exe_getport", $output, $retour);
					$lines = array();
					// On nettoi les lignes
					foreach($output as $key => $value) {
						if(strlen(trim($value)))
							array_push($lines,trim($value));
					}
					
					foreach($lines as $value)
						echo '<option value="' . $value . '">' . $value . '</option>' . "\n ";
					?>
				</select><input type="submit" value="OK" />
			</form>
			<br />
		</p>
	</div>
		<?php }
		
		if($_GET['step'] == 2) {
			
			// Définition du portCOM
			if(isset($_POST['portCOM'])) {
				file_put_contents("../port.txt", $_POST['portCOM']);
				$defaultCOM = $_POST['portCOM'];
			}
			
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
				if($lines[0] == "OK") echo "<p>System Ready</p>";
				else echo "Error";
			}else
				echo "Error";
		}
		
		} ?>
<hr />

<h2>Select FAB</h2>

<?php
	// Vérification de la connexion SQL
	$db = mysql_connect(SQL_HOST, SQL_USER, SQL_PASS);
	if(!$db) die("Can't connect");
	else
		if(!mysql_select_db("rfid",$db)) die("Can't select base");
	
	if(isset($_POST['setfab'])) {
		$id = $_POST['setfab'];
		$sql = "UPDATE rfid_fab SET rfid_fab_last_use = NOW() WHERE rfid_fab_id = '$id'";
		$req = mysql_query($sql) or die(mysql_error());
	}
	
	if(isset($_POST['newtype'], $_POST['newname'])) {
		$type = htmlentities($_POST['newtype']);
		$name = htmlentities($_POST['newname']);
		$sql = "INSERT INTO rfid_fab (`rfid_fab_name`,`rfid_fab_type`, `rfid_fab_creation`, `rfid_fab_last_use`) VALUES ('$name', '$type', NOW(), '0000-00-00 00:00:00')";
		$req = mysql_query($sql) or die(mysql_error());
	}
	
	$sql = "SELECT * FROM rfid_fab ORDER BY rfid_fab_last_use DESC";
	$req = mysql_query($sql) or die(mysql_error());
	
	if(!isset($_GET['step2'])) {
		if(mysql_num_rows($req) != 0)
		{
			$data = mysql_fetch_array($req);
			if(isset($data['rfid_fab_id'])) {
?>
			<div id="Fab">
				<p><strong>Name : <span id="name"><?php echo $data['rfid_fab_name']; ?></span><br />
				Type : <span id="type"><?php echo $data['rfid_fab_type']; ?></span><br />
				Creation : <span id="creation"><?php echo $data['rfid_fab_creation']; ?></span></strong></p>
				<p><a href="Admin/index.php?step2=select">Select a FAB</a></p>
			</div>
<?php
				$id = $data['rfid_fab_id'];
			}
		}
		echo '<p><a href="Admin/index.php?step2=create">Create a New FAB</a></p>';
	}else {
		if($_GET['step2'] == "select") {
	?>
		<form method="post" action="Admin/index.php" enctype="multipart/form-data">
			<select name="setfab">
				<?php
				while($data = mysql_fetch_array($req)) {
					echo '<option value="' . $data['rfid_fab_id'] . '">' . $data['rfid_fab_name'] . ', ' . $data['rfid_fab_type'] . ', ' . $data['rfid_fab_creation'] . '</option>' . "\n ";
				}
				?>
			</select><input type="submit" value="OK" />
		</form>
		<br />
	<?php
		}
		
		if($_GET['step2'] == "create") {
	?>
		<form method="post" action="Admin/index.php" enctype="multipart/form-data">
			<p>Name : <input type="text" name="newname" /></p>
			<p>Type : <select name="newtype">
				<?php foreach($RfidTypes as $value) { echo '<option value="' . $value . '">' . $value . '</option>'; } ?>
			</select></p>
			<p><input type="submit" value="Create" /> - <a href="Admin/index.php">Back</a></p>
		</form>
	<?php
		}
	}
	?>
	<hr />
	<h2>Extract</h2>
	<?php
	// Vérification de la connexion SQL
	$db = mysql_connect(SQL_HOST, SQL_USER, SQL_PASS);
	if(!$db) die("Can't connect");
	else
		if(!mysql_select_db("rfid",$db)) die("Can't select base");
	
	$sql = "SELECT rfid_fab_id,rfid_fab_name FROM rfid_fab ORDER BY rfid_fab_name";
	$req = mysql_query($sql) or die(mysql_error());
	
	?>
		<p>Select the FAB to extract</p>
		<form method="post" action="Admin/index.php" enctype="multipart/form-data">
			<select name="extractfab">
				<?php
				while($data = mysql_fetch_array($req)) {
					echo '<option value="' . $data['rfid_fab_id'] . '">' . $data['rfid_fab_name'] . '</option>' . "\n ";
				}
				?>
			</select><input type="submit" value="OK" />
		</form>
		<p>Or <a href="Admin/index.php?extall">Extract All</a></p>
		<p>Or <a href="Admin/index.php?dump">Dump</a></p>

</body>
</html>