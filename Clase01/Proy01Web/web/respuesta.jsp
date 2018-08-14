<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Respuesta Pedida</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <table border="0">
            <thead>
                <tr>
                    <th>Dato : </th>
                    <th>Valor : </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Número 1 :</td>
                    <td><%= request.getAttribute("n1") %></td>
                </tr>
                <tr>
                    <td>Número 2 :</td>
                    <td><%= request.getAttribute("n2") %></td>
                </tr>
                <tr>
                    <td>Resultado:</td>
                    <td><%= request.getAttribute("resultado") %></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
