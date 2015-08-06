<?php

session_start();

include("../types.php");
include("../config.php");

$defaultCOM = "1";
if(file_exists("../port.txt"))
	$defaultCOM = file_get_contents("../port.txt");

?>