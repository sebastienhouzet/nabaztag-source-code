<?php

// UID ex : d00218bd6e5693fc
// 0 > d0
// 1 > 02
// 2 > 18
// 3 > bd ...

$RfidTypes[0] = "SRI512";
$RfidTypes[1] = "SRIX4K";
$RfidTypes[2] = "SRIX512";
$RfidTypes[3] = "SR176";

function GetTypeRfid($UID) {

	if(trim(substr($UID,0,4)) == "d002") {
		$hex = hexdec(substr($UID,4,2));
		switch(floor($hex/4)) {
			case 2 : $retour = "SR176"; 	break;
			case 3 : $retour = "SRIX4K"; 	break;
			case 4 : $retour = "SRIX512"; 	break;
			case 6 : $retour = "SRI512"; 	break;
			default: $retour = "Unknow"; 	break;
		}
	}
	
	return $retour;
}

?>