<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado</title>
    <link rel="stylesheet" href="css.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Mali:wght@200&display=swap" rel="stylesheet">
</head>
<body>

<div id="title">
    <h1>Este es el Resultado</h1>
</div>
<div id="datos">
    <h1>Resultado del cálculo del Perimetro</h1>
    <% String perimetro = request.getAttribute("accion").toString(); %>
    <p>El perimetro de la figura es: <%= perimetro %></p>
</div>
    
</body>
</html>