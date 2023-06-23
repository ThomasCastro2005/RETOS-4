<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cilindro</title>
    <link rel="stylesheet" href="css.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Mali:wght@200&display=swap" rel="stylesheet">
</head>
<body>

<div id="title">
    <h1>Ingrese los datos del Trapecio</h1>
</div>

<form id="datos" action="servlet" method="post">
    <input type="text" name="Lado1" id="radio" placeholder="Lado1">
    <input type="text" name="Lado2" id="radio" placeholder="Lado2">
    <input type="text" name="Lado3" id="radio" placeholder="Lado3">
    <input type="text" name="Lado4" id="radio" placeholder="Lado4">
    <button type="submit" name="accion" value="perimetroTra">Calcular</button>
</form>
    
</body>
</html>