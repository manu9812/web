<%-- 
    Document   : resultado
    Created on : 2/10/2018, 02:54:27 PM
    Author     : Michael Stiven Pulido Reyes
 esta ágina recibe la pagina Datos.jsp 
--%>


<%@page import="Informacion.Guardar"%>
<%@page import="Informacion.conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pagina de resultados Compras</title>
    </head>
    <body>
        <h2 aling="center"> Cierre de compra</h2>
        <% 
            Guardar guardar = new Guardar();
            conexion conected = new conexion();
            guardar.leer();
            String producto = request.getParameter("selectProduc");
            int cantidad = Integer.parseInt(request.getParameter("cantidad"));
            String telefono = request.getParameter("telefono");
            String nombreCliente=request.getParameter("cliente");
            String direccion = request.getParameter("direccion");
            int valorUnitario = conected.buscarPrecioArticulo(producto);
            int total = cantidad* valorUnitario;
            conected.guardarFactura(producto, cantidad, valorUnitario ,nombreCliente, telefono, direccion);
         %>
         <p>producto:</p><%=producto%><br><br>
        <p>cantidad:</p><%=cantidad%><br><br>
        
        <p>Total:</p> <%=total%><br><br>
        <p> Nombre Cliente:</p> <%=nombreCliente%><br><br>
        
        <a href="Datos.jsp"></a>
        <a href="./index.html" title=" Ir a la pagina principal">Volver</a>
    </body>
</html>
