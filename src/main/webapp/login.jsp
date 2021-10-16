<%-- 
    Document   : newjsptest
    Created on : 8/10/2021, 08:51:11 AM
    Author     : svelandia
--%>

<%@page import="logica.LogicaUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <h2 style="text-align:center">INICIO DE SESION</h2>
        <div class="container">
            <div class="abs-center">
                <form action="#" class="border p-3 form">

                    <%
                        String usuario = request.getParameter("txtuser");
                        String password = request.getParameter("txtpassword");
                        String error_msg = "El usuario o la contraseña son incorrectos";
                        boolean validacion = false;
                        if (usuario != null && password != null) {
                            LogicaUsuarios lu = new LogicaUsuarios();
                            validacion = lu.usuarioExiste(usuario, password);
                            if (validacion)
                                response.sendRedirect("index.html");
                        }
                    %>

                    <div class="form-group">
                        <label class="form-label mt-4">Ingrese sus credenciales</label>
                        <div class="form-floating mb-2">
                            <input type="text" class="form-control" name="txtuser" id="txtuser" required>
                            <label for="txtuser">Nombre de usuario</label>
                        </div>
                        <div class="form-floating mb-2">
                            <input type="password" class="form-control" name="txtpassword" id="txtpassword" placeholder="Password" required>
                            <label for="txtpassword">Contraseña</label>
                        </div>
                    </div>

                    <button type="submit" name="btnSubmit" id="btnSubmit" class="btn btn-primary">Ingresar</button>
                    <%
                    if (usuario != null && password != null){
                        if (!validacion){
                    %>
                    <p class="text-warning">
                    <%
                            out.println(error_msg);
                        }
                    }
                    %>
                    </p>
                    <p>Al registrarte, aceptas nuestras Condiciones de uso y Política de privacidad.</p>
                    <p>¿No tienes una cuenta? <a class="link" href="create-user.jsp">Registrate </a></p>

                </form>
            </div>
        </div>
    </body>
</html>
