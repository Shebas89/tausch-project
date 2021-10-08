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
        <link rel="stylesheet" href="estilo_1.css">
    </head>  
    <body>
        <h2 style="text-align:center">REGISTRO DE NUEVO USARIO</h2> 
     <div class="container">
        <div class="abs-center">
            <form action="#" class="border p-3 form">
                <%
                    String name = request.getParameter("nombre");
                    String last_n = request.getParameter("apellido");
                    String email = request.getParameter("email");
                    String usuario = request.getParameter("usuario");
                    String tdoc = request.getParameter("tdoc");
                    int nd = Integer.parseInt(request.getParameter("nd"));
                    int telefono = Integer.parseInt(request.getParameter("telefono"));
                    String fnac = request.getParameter("fnacimiento");
                    String password = request.getParameter("password");
                    
                    Usuario user = new Usuario(name,last_n,usuario,tdoc,nd,email,telefono,fnac,password);
                    
                %>
                <div class="form-group">
                    <label for="nombre">Nombre</label>
                    <input type="text" name="nombre" id="email" class="form-control" required="true">
                </div>
                 <div class="form-group">
                    <label for="apellido">Apellido</label>
                    <input type="text" name="apellido" id="email" class="form-control" required="true">
                </div>
                 <div class="form-group">
                    <label for="usuario">Usuario</label>
                    <input type="text" name="usario" id="email" class="form-control" required="true">
                </div>
                <div class="form-group">
                    <label for="tdoc">Tipo de documento</label>
                    <input type="text" name="tdoc" id="email" class="form-control" required="true">
                </div>

                <div class="form-group">
                    <label for="nd">Numero de Docuemnto</label>
                    <input type="text" name="nd" id="email" class="form-control" required="true">
                </div> 
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" name="email" id="email" class="form-control" required="true">
                </div>

                <div class="form-group">
                    <label for="telefono">Telefono</label>
                    <input type="text" name="telefono" id="email" class="form-control" required="true">
                </div>
                <div class="form-group">
                <div class="form-group">
                    <label for="fnacimiento">Fecha de nacimiento</label>
                    <input type="date" name="fnacimiento" id="email" class="form-control" required="true">
                </div>
                    <label for="password">Contraseña</label>
                    <input type="password" name="password" id="password" class="form-control" required="true">
                </div>
                <button type="submit" class="btn btn-primary">Registrar</button>
            </form>
        </div>
    </div>
     <p style="text-align:center">Al registrarte, aceptas nuestras Condiciones de uso y Política de privacidad.
    
  </body>
</html>
