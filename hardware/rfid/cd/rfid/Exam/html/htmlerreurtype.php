<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">

<head>
<?php include("../head.php"); ?>
</head>
	
<body>
<?php include("../menu.php"); ?>
	<p><img src="design/TypeError.jpg" alt="Wrong Type" /><br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<?php
	if($_SESSION['Fab']['type'] != GetTypeRfid($tag[0][0]))
		echo '&nbsp;&nbsp;&nbsp;<img src="design/WrongType.jpg" alt="WrongType" />';
	else
		echo '&nbsp;&nbsp;&nbsp;<img src="design/GoodType.jpg" alt="GoodType" />';
	
	if($_SESSION['Fab']['type'] != GetTypeRfid($tag[1][0]))
		echo '&nbsp;&nbsp;&nbsp;<img src="design/WrongType.jpg" alt="WrongType" />';
	else
		echo '&nbsp;&nbsp;&nbsp;<img src="design/GoodType.jpg" alt="GoodType" />';
	
	if($_SESSION['Fab']['type'] != GetTypeRfid($tag[2][0]))
		echo '&nbsp;&nbsp;&nbsp;<img src="design/WrongType.jpg" alt="WrongType" />';
	else
		echo '&nbsp;&nbsp;&nbsp;<img src="design/GoodType.jpg" alt="GoodType" />';
	?>
</body>

</html>