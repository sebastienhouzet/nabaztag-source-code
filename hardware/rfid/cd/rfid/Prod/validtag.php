<?php

include("config.php");

if(!isset($_GET['t1'], $_GET['t2'], $_GET['t3'])) die("No Args!");

			
$db = mysql_connect(SQL_HOST, SQL_USER, SQL_PASS);
if(!$db) die("<p>Impossible de se connecter!</p>");
else
	if(!mysql_select_db("rfid",$db))
		die("<p>Impossible de s&eacute;l&eacute;ctionner la base.</p>");

$i=0;

while(isset($_GET['c'.$i]))
{
	$sql = "INSERT INTO rfid_tag (`rfid_tag_serial`, `rfid_tag_creation_date`, `rfid_tag_color`, `rfid_tag_fab`) VALUES ('".$_GET['t'.($i+1)]."', NOW(), '".$_GET['c'.$i]."', '" . $_SESSION['Fab']['id'] . "')";
	$req = mysql_query($sql) or die(mysql_error());
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
		location.href = "Prod/check.php"
	}
	</script>
</head>
	
<body onload="setTimeout('ReFresh()', 1000);">
<?php include("../menu.php"); ?>
	OK, Next...
</body>

</html>