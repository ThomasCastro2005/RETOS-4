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
    <h1>Ingrese los datos del cilindro</h1>
</div>

<form id="datos" action="servlet" method="post">
    <input type="text" name="Altura" id="altura" placeholder="Altura">
    <input type="text" name="Radio" id="radio" placeholder="Radio">
    <button type="submit" name="accion" value="areacilin">Calcular</button>
</form>
    
</body>
</html>