<?php

include("config.php");

if(!isset($_GET['t1'], $_GET['t2'], $_GET['t3'])) die("No Args!");
if(!isset($_GET['id1'], $_GET['id2'], $_GET['id3'])) die("No Args!");

			
$db = mysql_connect(SQL_HOST, SQL_USER, SQL_PASS);
if(!$db) die("<p>Impossible de se connecter!</p>");
else
	if(!mysql_select_db("rfid",$db))
		die("<p>Impossible de s&eacute;l&eacute;ctionner la base.</p>");

$i=0;

while(isset($_GET['c'.$i]))
{
	$id = $_GET['id'.($i+1)];
	$sql = "SELECT rfid_tag_creation_date, rfid_tag_mod_count FROM rfid_tag WHERE rfid_tag_id = '$id'";
	$req = mysql_query($sql) or die(mysql_error());
	
	if(mysql_num_rows($req) == 1) {
		$data = mysql_fetch_array($req);
		$nb = $data['rfid_tag_mod_count'] + 1;
		$sql = "UPDATE rfid_tag SET `rfid_tag_creation_date` = '" . $data['rfid_tag_creation_date'] . "', `rfid_tag_recolored` = '".$_GET['c'.$i]."', `rfid_tag_mod_date` = NOW(), `rfid_tag_mod_count` = '$nb' WHERE rfid_tag_id = '$id'";
		$req = mysql_query($sql) or die(mysql_error());
	}
	$i++;
}

mysql_close($db);

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
	
<body onload="setTimeout('ReFresh()', 1000);">
<?php include("../menu.php"); ?>
	OK, Next...
</body>

</html>