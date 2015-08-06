<?php

define(SQL_HOST, "localhost");
define(SQL_USER, "root");
define(SQL_PASS, "123");
define(FICHIER_PLANCHE, "../planche.txt");

define(SITERFID, "rfid");
$site = SITERFID;

$exe_getport = $_SERVER['DOCUMENT_ROOT']."/$site/Exe/getports.exe";
$exe_checkconfig = $_SERVER['DOCUMENT_ROOT']."/$site/Exe/checkconfig.exe";
$exe_liaison = $_SERVER['DOCUMENT_ROOT']."/$site/Exe/com.exe";

?>