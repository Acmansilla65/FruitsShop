<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script src="Assets/js/App.js"></script>
    <link rel="stylesheet" href="Assets/css/Style.css" type="text/css">
</head>
<body>
    <div id="cuerpo">
        <div id="titulo">
            <h1>
                Compra de Frutas
            </h1>
        </div>
        <div id="frutasInfo">
            <div id="papaya" class="frutas">
                <div>
                    <img src="Assets/img/papaya.jpg" id="papa0">
                </div>

                <div id="papa1">
                    La papaya es una fruta muy apreciada por sus propiedades nutricionales y su sabor. 
                    Con más Vitamina C que una naranja, la papaya es un ingrediente perfecto para incluir en tus recetas y en tu dieta por ser además saciante y poco calórica.
                </div>

                <div>
                    Cantidad: <input type="number" name="cantPapa" id="cantPapa">
                </div>

                <div>
                    Tiene un precio de 4€/kg, ¿Añadir al carro?: <input type="checkbox" name="papa2" id="papa2">
                </div>
            </div>
            <div id="melocoton" class="frutas">
                <div>
                    <img src="Assets/img/melocoton.jpg" id="melo0">
                </div>

                <div id="melo1">
                    El melocotón es una deliciosa fruta redonda de color aterciopelado y jugoso. Su carne es de un color entre amarillento y blanquecino con un agradable aroma. 
                    Esta fruta es versátil, se puede consumir e ingerir fresca o enlatados como también se puede utilizar como ingredientes en platos para guarnecer carnes, se puede utilizar también en postres, como pasteles, tortas, mermeladas, compotas, jaleas, helados, entre otros.
                </div>

                <div>
                    Cantidad: <input type="number" name="cantMelo" id="cantMelo">
                </div>

                <div>
                    Tiene un precio de 2€/kg, ¿Añadir al carro?: <input type="checkbox" name="melo2" id="melo2">
                </div>
            </div>
            <div id="mango" class="frutas">
                <div>
                    <img src="Assets/img/mango.jpg" id="man0">
                </div>

                <div id="man1">
                    El mango se trata de una fruta carnosa con un sabor dulce delicioso que hidrata y nutre el organismo. Los mangos poseen propiedades y beneficios muy interesantes que merece la pena conocer para poder incorporar esta fruta a la dieta y contribuir a cuidar nuestra salud.
                    El mango nos aportan vitaminas del grupo B, caroteno (vitamina A), vitamina C y diferentes tipos de minerales como el fósforo, el calcio el magnesio o el selenio.
                </div>

                <div>
                    Cantidad: <input type="number" name="cantMen" id="cantMan">
                </div>

                <div>
                    Tiene un precio de 3€/kg, ¿Añadir al carro?: <input type="checkbox" name="man2" id="man2">
                </div>
            </div>
        </div>
        <div id="envio">
            <div>
                Envio a Península: <input type="radio" name="envios" id="env1" checked>
            </div>
            <div>
                Envio a Canarias: <input type="radio" name="envios" id="env2">
            </div>
            <div>
                Envio Internacional: <input type="radio" name="envios" id="env3">
            </div>
        </div>
        <div id="boton0">
            <div id="boton1">
                <input type="button" name="b1" id="b1" value="Comprar">
            </div>
        </div>
        <div id="r1">
            
        </div>
        <div id="r2">

        </div>
        <div id="r3">

        </div>
    </div>
</body>
</html>
