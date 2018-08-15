<%-- 
    Document   : index
    Created on : 14/08/2018, 06:43:08 PM
    Author     : Samir Harry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VENTAS</title>
    </head>
    <body>
        <h1>VENTA ON LINE</h1>
        
        <form>
            <fieldset>
                <legend>Datos de la venta</legend>
                <div>
                    <label>Cantidad</label>
                    <input type="text" name="cantidad"/>
                </div>
                <div>
                    <label>Precio</label>
                    <input type="text" name="precio"/>
                </div>
                <div>
                    <input type="submit" value="Procesar Venta"/>
                </div>
                
            </fieldset>
        </form>
        <div>
            Total:  <%= dto.getT %>
            
        </div>
    </body>
</html>
