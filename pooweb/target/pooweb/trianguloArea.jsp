<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Triangulo</title>
    <link rel="stylesheet" href="css.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Mali:wght@200&display=swap" rel="stylesheet">
</head>
<body>

<div id="title">
    <h1>Ingrese los datos del Triangulo</h1>
</div>
<form id="datos" method="post" action="servlet">
    <input type="text" placeholder="Base" name="base" id="base">
    <input type="text" name="altura2" id="altura" placeholder="Altura">
    <button type="submit" name="accion" value="areatri">Calcular</button>
</form>
    
</body>
</html>