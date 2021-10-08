<%-- 
    Document   : newjsptest
    Created on : 8/10/2021, 08:51:11 AM
    Author     : santy
--%>

<%@page import="logica.Usuario"%>
<%@page import="logica.LogicaUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <form class="formulario" method="POST">
    
            <h1>INICIO DE SECCION</h1>
             <div class="contenedor">

                 <%
                    String usuario = request.getParameter("txtuser");
                    String password = request.getParameter("txtpassword");
                    String error_msg = "El usuario o la contraseña son incorrectos";
                    boolean validacion = false;
                    if (usuario != null && password != null){             
                        LogicaUsuarios lu = new LogicaUsuarios();
                        validacion = lu.usuarioExiste(usuario, password);
                        if (validacion)
                            response.sendRedirect("index.html");
                    }
                 %>

                 <div class="input-contenedor">
                 <i class="fas fa-envelope icon"></i>
                 <input type="text" name="txtuser"placeholder="Usuario">

                 </div>

                 <div class="input-contenedor">
                <i class="fas fa-key icon"></i>
                 <input type="password" name="txtpassword"placeholder="Contraseña">

                 </div>
                 
                 <button type="submit" name="btnSubmit" id="btnSubmit" class="btn btn-primary">Ingresar</button>
                 <%
                    if (usuario != null && password != null){             
                           if (!validacion)
                               out.println(error_msg);
                       }
                 %>
                 <p>Al registrarte, aceptas nuestras Condiciones de uso y Política de privacidad.</p>
                 <p>¿No tienes una cuenta? <a class="link" href="create-user.jsp">Registrate </a></p>
             </div>
            </form>

    </body>
</html>
