<%-- 
    Document   : editar-usuario
    Created on : 09/11/2023, 22:02:59
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String idUsuario = request.getParameter("id");
            out.println(idUsuario);
            
        %>
        <h1></h1>
    </body>
</html>
