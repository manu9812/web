<%-- 
    Document   : Datos
    Created on : 2/10/2018, 02:51:28 PM
    Author     : BOG-A408-E-003
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compras por hacer</title>
    </head>
    <body>
        <div>
        <h1 aling="center "> formulario de datos de compra </h1>
        </div>
        <div aling="center">
        <form action="resultado.jsp" method="post">
            <p>Producto</p><select name ="selectProduc" id="selectProduc">
                <option value="Tanga">Tanga</option>
                <option value="Cucos">Cucos</option>
                <option value="Encaje">Encaje</option>
            </select><br>
            
            <p>Cantidad: </p><input type="text" name="cantidad" id="cantidad"> <br>
            <p>Ciente: </p><input type="text" name="cliente" id="cliente"><br>
            <p>Telefono: </p><input type="text" name="telefono" id="telefono"><br>
            <p>Direccion: </p><input trype="text" name="direccion" id="direccion"><br>
            <input type="submit" name="enviarCompra" id="enviarCompra" value="Enviar Compra">
            
        </form>
        </div>
    </body>
</html>
