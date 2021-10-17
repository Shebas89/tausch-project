<%--
  Created by IntelliJ IDEA.
  User: svelandia
  Date: 16/10/21
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="logica.LogicaUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperar contraseña</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <h2 style="text-align:center">OLVIDO DE CONTRASEÑA</h2>
        <div  class="container">
            <div class="abs-center">
                <form action="#" class="border p-3 form">
                    <div class="row">
                        <%
                            String user = request.getParameter("txtuser");
                            String pw = request.getParameter("txtemail");
                            LogicaUsuarios lu = new LogicaUsuarios();
                            boolean validacion = false;
                            if (user != null && pw != null){
                                validacion = lu.resertPassword(user, pw);
                                if (validacion)
                                    response.sendRedirect("index.html");
                                else
                                    out.println("No se pudo recuperar contraseña");
                            }
                        %>
                        <div class="col-xs-12 col-sm-12">
                            <div class="form-floating mb-2">
                                <input type="text" class="form-control" name="txtuser" id="txtuser" placeholder="Nombre de usuario" required>
                                <label for="txtuser">Nombre de Usuario</label>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-12">
                            <div class="form-floating mb-2">
                                <input type="email" class="form-control" name="txtemail" id="txtemail" placeholder="email" required>
                                <label for="txtemail">Email</label>
                            </div>
                        </div>
                        <div class="col-md-12 text-center">
                            <button type="submit" name="btbSubmit" class="btn btn-secondary">Recuperar</button>
                            <a href="login.jsp"><button type="button" name="btnCancel" id="btbCancel" value="cancel" class="btn-secondary">Cancelar</button></a>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
