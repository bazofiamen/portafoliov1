<?php 
require_once("../DAO/DAOEnvio.php");

$elim=$_POST["chk_envio"];
$cantidad=count($elim);
$lista="";
$url="";
$datos=DAOEnvio::sqlSelectTodas();
foreach($datos as $fila){
	$fecha=$fila[0];
	$idsedeo=$fila[1];
	$idseded=$fila[2];
	$cod=$fila[3];
	for($x=0;$x<$cantidad;$x++){
		if($elim[$x]==$cod){
			$lista.="<tr><td>$fecha</td><td>$idsedeo</td><td>$idseded</td><td>$cod</td></tr>";
			if($x>=1){
            $url.="&lista[]=".$cod;}			
		}
		
	}
	
}

?>
<html>
<head>
<title>Eliminacion</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="css/estilos.css">
<body>
<header>
<div class="container"><h1>Listado de Info. Para Eliminar</h1></div>
</header>
<br/>
<div class="container">
<div class="panel panel-info">
<div class="panel-heading">Esta Seguro que desea Eliminar los sgtes Datos?:</div>
<div class="panel-body">

<table class="table">
<?php echo $lista;?>
</table>
<a href="../MVC/MVCEnvio.php?lista[]=<?php echo $elim[0].$url?>" class="btn btn-danger">Eliminar</a>

</div>
</div>
</div>
</body>
</html>