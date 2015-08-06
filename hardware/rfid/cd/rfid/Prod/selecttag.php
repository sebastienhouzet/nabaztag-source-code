<?php
include("config.php");

if(!isset($_GET['t1'], $_GET['t2'], $_GET['t3'])) die("No Args!");

if($_SESSION['LastPage'] == "check.php")
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>

<head>
<?php include("../head.php"); ?>
	<script language="javascript">
	
	function TagConfig(Url) {
		this.URL = Url;
	}
	
	addtags = "t1=<?php echo $_GET['t1']; ?>&t2=<?php echo $_GET['t2']; ?>&t3=<?php echo $_GET['t3']; ?>";
	
	var Config = new Array();
	<?php
		foreach($_SESSION['Planche'] as $conf_id => $tab) {
			$line = 'Config["'. ($conf_id+1) .'"] = new TagConfig("Prod/validtag.php?';
			foreach($tab as $key => $value)
				$line = $line . "c$key=$value&";
			$line =  $line . '" + addtags);' . "\n";
			echo $line;
		}
	?>
	
	function func_KeyPress(event){
		TouchKeyPress = window.event ? event.keyCode : event.which;
		Touche = String.fromCharCode(TouchKeyPress)
		if(Config[Touche])
			location.href = Config[Touche].URL;
	}
	function func_Click(Touche){
		if(Config[Touche])
			location.href = Config[Touche].URL;
	}
	</script>
</head>
	
<body onkeypress="func_KeyPress(event)">
<?php include("../menu.php"); ?>
	<div class="centrer">
	<?php
		foreach($_SESSION['Planche'] as $conf_id => $tab) {
		?><div>
		<a href="javascript:func_Click('<?php echo ($conf_id+1); ?>');">
		<img src="Keys/key<?php echo ($conf_id+1); ?>.jpg" alt="<?php echo ($conf_id+1); ?>" />
			<?php
			foreach($tab as $key => $value)
				echo '<img src="Stamps/' . $value . '.jpg" alt="' . $value . '" />' . "\n";
			echo '</a></div>';
			if($conf_id != count($_SESSION['Planche'])-1) echo '<hr />';
		}
	?>
	</div>
</body>

</html>