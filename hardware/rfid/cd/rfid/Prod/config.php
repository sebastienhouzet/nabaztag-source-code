<?php

session_start();

include("../config.php");

$htmlinclude = "html/";

$defaultCOM = "1";
if(file_exists("../port.txt"))
	$defaultCOM = file_get_contents("../port.txt");

?>