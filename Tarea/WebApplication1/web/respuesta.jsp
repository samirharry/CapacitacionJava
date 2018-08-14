
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Precio</title>
    </head>
    <body>
        <h1>Precio Total</h1>
        <table border="0">
            <thead>
                <tr>
                    <th>Monto total</th>
                    <th>Valor</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Precio 1:</td>
                    <td><%= request.getAttribute("precio1") %></td>
                </tr>
                <tr>
                    <td>Precio 2:</td>
                    <td><%= request.getAttribute("precio2") %></td>
                </tr>
                <tr>
                    <td>Precio 3:</td>
                    <td><%= request.getAttribute("precio3") %></td>
                </tr>
                <tr>
                    <td>Monto</td>
                    <td><%= request.getAttribute("resultado") %></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
