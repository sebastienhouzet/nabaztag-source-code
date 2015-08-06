<?php include("config.php");
include("../types.php"); ?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">

<head>
<?php include("../head.php"); ?>
</head>
	
<body>
<?php include("../menu.php"); ?>

<?php

if(!isset($_GET['t1'], $_GET['t2'], $_GET['t3'])) die("No Arg");

// Vérification de la connexion SQL
$db = mysql_connect(SQL_HOST, SQL_USER, SQL_PASS);
if(!$db) $do = false;
else
	if(!mysql_select_db("rfid",$db))
		$do = false;

$displaytags[0] = array();
$eject = false;

/* TAG 1 */
$tag_id = $_GET['t1'];
$sql = "SELECT rfid_tag_color, rfid_tag_recolored, rfid_tag_id FROM rfid_tag WHERE rfid_tag_serial = '$tag_id'";
$req = mysql_query($sql) or die(mysql_error());

$displaytags[0] = array();
if(mysql_num_rows($req) > 0)
	while($data = mysql_fetch_array($req)) {
		$idt1 = $data['rfid_tag_id'];
		if($data['rfid_tag_recolored'] == 0)
			array_push($displaytags[0], substr("000", strlen($data['rfid_tag_color'])).$data['rfid_tag_color']);
		else
			array_push($displaytags[0], substr("000", strlen($data['rfid_tag_recolored'])).$data['rfid_tag_recolored']);
	}
else $eject = true;

/* TAG 2 */
$tag_id = $_GET['t2'];
$sql = "SELECT rfid_tag_color, rfid_tag_recolored, rfid_tag_id FROM rfid_tag WHERE rfid_tag_serial = '$tag_id'";
$req = mysql_query($sql) or die(mysql_error());

$displaytags[1] = array();
if(mysql_num_rows($req) > 0)
	while($data = mysql_fetch_array($req)) {
		$idt2 = $data['rfid_tag_id'];
		if($data['rfid_tag_recolored'] == 0)
			array_push($displaytags[1], substr("000", strlen($data['rfid_tag_color'])).$data['rfid_tag_color']);
		else
			array_push($displaytags[1], substr("000", strlen($data['rfid_tag_recolored'])).$data['rfid_tag_recolored']);
	}
else $eject = true;

/* TAG 3 */
$tag_id = $_GET['t3'];
$sql = "SELECT rfid_tag_color, rfid_tag_recolored, rfid_tag_id FROM rfid_tag WHERE rfid_tag_serial = '$tag_id'";
$req = mysql_query($sql) or die(mysql_error());

$displaytags[2] = array();
if(mysql_num_rows($req) > 0)
	while($data = mysql_fetch_array($req)) {
		$idt3 = $data['rfid_tag_id'];
		if($data['rfid_tag_recolored'] == 0)
			array_push($displaytags[2], substr("000", strlen($data['rfid_tag_color'])).$data['rfid_tag_color']);
		else
			array_push($displaytags[2], substr("000", strlen($data['rfid_tag_recolored'])).$data['rfid_tag_recolored']);
	}
else $eject = true;
?>


	<p><?php foreach($displaytags as $value){
		if(is_array($value)) {
			if(count($value) == 1)
				echo '<img src="Stamps/' . $value[0] . '.jpg" alt="' . $value[0] . '" />' . "\n";
			if(count($value) == 0)
				echo '<img src="design/TagUnknown.jpg" alt="Tag Unknown" />' . "\n";
			if(count($value) >= 2) {
				echo '<br />DUPLICATE SERIAL : ';
				foreach($value as $imgs)
					echo '<img src="Stamps/' . $imgs . '.jpg" alt="' . $imgs . '" /> -' . "\n";
			}
		}
	}?></p>
	
	<p><?php echo GetTypeRfid($_GET['t1']); ?>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<?php echo GetTypeRfid($_GET['t2']); ?>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<?php echo GetTypeRfid($_GET['t3']); ?></p>
	
	<hr />
	
	<p>
		<?php if(!$eject) { ?><a href="Exam/recolor.php?t1=<?php echo $_GET['t1']; ?>&amp;t2=<?php echo $_GET['t2']; ?>&amp;t3=<?php echo $_GET['t3']; ?>&amp;id1=<?php echo $idt1; ?>&amp;id2=<?php echo $idt2; ?>&amp;id3=<?php echo $idt3; ?>">
			<img src="design/Recolor.jpg" alt="Recolor" />
		</a><?php }else{ ?><img src="design/EjectTag.jpg" alt="Eject" /><?php } ?>&nbsp;&nbsp;&nbsp;
		<a href="Exam/check.php">
			<img src="design/Next.jpg" alt="Next" />
		</a>
		<?php unset($_SESSION['CHECK']); ?>
	</p>
	
</body>

</html>