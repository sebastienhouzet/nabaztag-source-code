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
	
<body onload="setTimeout('ReFresh()', 2000);">
<?php include("../menu.php"); ?>
	<p><img src="design/exist_part1.jpg" alt="Tags already exist" /><br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<?php
	foreach($tag as $key => $value) {
		if($value[1])
			echo '&nbsp;&nbsp;&nbsp;<img src="design/exist_no.jpg" alt="TAG_NO" />';
		else
			echo '&nbsp;&nbsp;&nbsp;<img src="design/exist_ok.jpg" alt="TAG_OK" />';
	} ?>
</body>

</html>