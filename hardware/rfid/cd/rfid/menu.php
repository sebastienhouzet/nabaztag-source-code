	<?php
	$MenuProd = false;
	if(isset($menu['Prod'])) if($menu['Prod'] == false) $MenuProd = "Gris";
	$MenuExam = false;
	if(isset($menu['Exam'])) if($menu['Exam'] == false) $MenuExam = "Gris";
	$MenuAdmin = false;
	if(isset($menu['Admin'])) if($menu['Admin'] == false) $MenuAdmin = "Gris";
	
	
	
	
	?><div id="MenuBar">
		<?php if(!$MenuProd) echo '<a href="Prod/">' ?><img src="design/Prod<?php if($MenuProd) echo $MenuProd; ?>.jpg" alt="Prod" /><?php if(!$MenuProd) echo '</a>' ?>&nbsp;&nbsp;&nbsp;
		<?php if(!$MenuExam) echo '<a href="Exam/">' ?><img src="design/Exam<?php if($MenuExam) echo $MenuExam; ?>.jpg" alt="Exam" /><?php if(!$MenuExam) echo '</a>' ?>&nbsp;&nbsp;&nbsp;
		<?php if(!$MenuAdmin) echo '<a href="Admin/">' ?><img src="design/Admin<?php if($MenuAdmin) echo $MenuAdmin; ?>.jpg" alt="Admin" /><?php if(!$MenuAdmin) echo '</a>' ?>
	</div>
	<hr />
