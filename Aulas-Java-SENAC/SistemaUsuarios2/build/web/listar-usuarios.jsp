                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   <%-- 
Document   : listar-usuarios
Created on : 26 de out. de 2023, 21:50:02
Author     : guilherme.walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="listar-usuarios.jsp">Lista de Usuários</a>

                <!--                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>-->
                <div>
                    <span>
                        <%
                            String nomeUsuario = (String) session.getAttribute("nomeUsuario");
                            if (nomeUsuario == null) {
                                response.sendRedirect("index.jsp");
                            } else {
                                out.println("Bem vindo " + nomeUsuario);
                            }
                        %>
                    </span>
                    <a href="logout.jsp">Sair</a>
                </div>
            </div>
        </nav>
    </body>
</html>