<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cono</title>
    <link rel="stylesheet" href="css.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Mali:wght@200&display=swap" rel="stylesheet">
</head>
<body>

<div id="title">
    <h1>Ingrese los datos del Trapecio</h1>
</div>
<form id="datos" method="post" action="servlet">
    <input type="text" name="altura3" id="altura" placeholder="Altura">
    <input type="text" name="baseMayor" id="baseMayor" placeholder="Base Mayor">
    <input type="text" name="baseMenor" id="baseMenor" placeholder="Base Menor">
    <button type="submit" name="accion" value="areatra">Enviar</button>

</form>
    
</body>
</html>