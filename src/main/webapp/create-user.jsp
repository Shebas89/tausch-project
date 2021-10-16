<%-- 
    Document   : login
    Created on : 7/10/2021, 02:28:31 PM
    Author     : svelandia
--%>
<%@page import="logica.Usuario"%>
<%@page import="logica.LogicaUsuarios"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creacion de usuario</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>  
    <body>
        <h2 style="text-align:center">REGISTRO DE NUEVO USUARIO</h2>
        <div class="container">
            <div class="abs-center">
                <form action="#" class="border p-3 form">
                    <%
                        String name = request.getParameter("nombre");
                        String last_n = request.getParameter("apellido");
                        String email = request.getParameter("email");
                        String usuario = request.getParameter("usuario");
                        String tdoc = request.getParameter("tdoc");
                        String fnac = request.getParameter("fnac");
                        String password = request.getParameter("password");
                        boolean validacion = false;
                        if (name != null && last_n != null && email != null && usuario != null && tdoc != null &&
                        password != null && fnac !=null) {
                            int telefono = Integer.parseInt(request.getParameter("telefono"));
                            int nd = Integer.parseInt(request.getParameter("nd"));
                            LogicaUsuarios lu = new LogicaUsuarios();
                            validacion = lu.usuarioRegistro(name, last_n, usuario, tdoc, nd, email, telefono, fnac, password);
                            if (validacion)
                                response.sendRedirect("index.html");
                        }
                    %>
                    <div class="row">
                        <div class="col-xs-12 col-sm-12">
                            <div class="form-group mb-2">
                                <label for="nombre">Nombre</label>
                                <input type="text" name="nombre" id="nombre" class="form-control" required="true">
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-12">
                             <div class="form-group mb-2">
                                <label for="apellido">Apellido</label>
                                <input type="text" name="apellido" id="apellido" class="form-control" required="true">
                             </div>
                        </div>
                        <div class="col-xs-12 col-sm-6">
                             <div class="form-group mb-2">
                                <label for="usuario">Usuario</label>
                                <input type="text" name="usuario" id="usuario" class="form-control" required="true">
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6">
                            <div class="form-group mb-2">
                                <label for="password">Contraseña</label>
                                <input type="password" name="password" id="password" class="form-control" required="true" placeholder="Password">
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-3">
                            <div class="form-group mb-2">
                                <label for="tdoc">Tipo de documento</label>
                                <input type="text" name="tdoc" id="tdoc" class="form-control" required="true">
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-9">
                            <div class="form-group mb-2">
                                <label for="nd">Numero de Docuemento</label>
                                <input type="number" name="nd" id="nd" class="form-control" required="true">
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-12">
                            <div class="form-group mb-2">
                                <label for="email">Email</label>
                                <input type="email" name="email" id="email" class="form-control" placeholder="name@example.com" required="true">
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6">
                            <div class="form-group mb-2">
                                <label for="telefono">Telefono</label>
                                <input type="number" name="telefono" id="telefono" class="form-control" required="true">
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6">
                            <div class="form-group mb-3">
                                <label for="fnac">Fecha de nacimiento</label>
                                <input type="date" name="fnac" id="fnac" class="form-control" required="true">
                            </div>
                        </div>
                        <%
                            if (usuario != null && password != null){
                                if (!validacion)
                                    out.println("El usuario ya se encuentra registrado");
                            }
                        %>
                        <div class="col-xs-12 col-sm-3">
                            <button type="submit" class="btn btn-outline-primary" style="float: right;">Registrar</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <p style="text-align:center">Al registrarte, aceptas nuestras Condiciones de uso y Política de privacidad.
    
    </body>
</html>
