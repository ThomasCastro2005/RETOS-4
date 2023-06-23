<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Figuras</title>
    <link rel="stylesheet" href="css.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Mali:wght@200&display=swap" rel="stylesheet">
</head>
<body>
<div id="title">
<h1> ¿Que figura desea calcular?</h1>
</div>

<div id="figuras">

    <div>
        <a href="servlet?accion=aroPerCil"><img src="img/cilindro.png" alt="cilindro"> Cilindro </a>
    </div>
    <div>
        <a href="servlet?accion=aroPerRom"><img src="img/rombo.png" alt="rombo"> Rombo</a>
    </div>    
    <div> 
        <a href="servlet?accion=aroPerTra"> <img src="img/trapecio.png" alt="trapecio"> Trapecio</a>
    </div>   
    <div> 
        <a href="servlet?accion=aroPerTri"><img src="img/triangulo.png" alt="triangulo">  Triangulo</a>
    </div>   
    
</div>    
</body>
</html>

