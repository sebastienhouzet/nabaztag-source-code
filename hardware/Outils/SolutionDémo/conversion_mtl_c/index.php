<?php

$dossier=".";
$ouverture=opendir($dossier);
$fichier=readdir($ouverture);
$sendto = "";
$i=0;
$max = 0;
while ($fichier=readdir($ouverture)) {
	if($fichier != ".." && $fichier != "." && $fichier != "index.php" && $fichier != "export.txt") {
		
		$txt = file_get_contents($fichier);
		echo "\n\n<hr />$fichier<br />\n";
		$txt = str_replace("\r", "", $txt);
		$txt = str_replace("\\\\", "\\", $txt);
		$txt = str_replace("\\$", ",0x", $txt);
		$txt = substr($txt, 1);
		$tab = explode("0x", $txt);
		if($max < count($tab))
			$max = count($tab)+1;
		$sendto = $sendto . '{' . $txt . ',0x00,0xee},' . "\r";
		//echo $txt;
		$i++;
		
	}
}
closedir($ouverture);

$sendto = "const unsigned char chores[$i][$max]= {\r" . $sendto;
$sendto[strlen($sendto)-2] = '}';
$sendto[strlen($sendto)-1] = ';';
echo $sendto;

file_put_contents("export.txt", $sendto);

?>