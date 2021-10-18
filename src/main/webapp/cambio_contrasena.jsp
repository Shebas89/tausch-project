<%--
  Created by IntelliJ IDEA.
  User: svelandia
  Date: 16/10/21
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="logica.Usuario"%>
<%@page import="logica.LogicaUsuarios"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Cambio de contraseña</title>
</head>
    <body>
        <h2 style="text-align: center">Cambio de Contraseña</h2>
        <div class="container">
            <div class="abs-center">
                <form action="#" class="border p-3 form">
                    <%
                        String user = request.getParameter("txtuser");
                        String pw = request.getParameter("txtpassword");
                        String pwc = request.getParameter("txtpasswordconf");
                        boolean validacion = false;
                        if (user != null && pw != null && pw.equals(pwc)){
                            LogicaUsuarios lu = new LogicaUsuarios();
                            validacion = lu.actualizarContraseña(user,pw);
                            if (validacion){
                    %>
                    <script language="JavaScript">

                    </script>
                    <%
                                response.sendRedirect("index.html");
                            }
                            else
                                out.println("No se pudo actualizar la contraseña");
                        }
                    %>
                    <div class="form-group">
                        <div class="form-floating mb-2">
                            <input type="txt" class="form-control" name="txtuser" id="txtuser" placeholder="Usuario" required>
                            <label for="txtuser">Usuario</label>
                        </div>
                        <div class="form-floating mb-2">
                            <input type="password" class="form-control" name="txtpassword" id="txtpassword" placeholder="Nueva Contraseña" required>
                            <label for="txtpassword">Nueva Contraseña</label>
                        </div>
                        <div class="form-floating mb-2">
                            <input type="password" class="form-control" name="txtpasswordconf" id="txtpasswordconf" placeholder="Confirme Nueva Contraseña" required>
                            <label for="txtpasswordconf">Confirme Nueva Contraseña</label>
                        </div>
                        <div class="col-md-12 text-center">
                            <button type="submit" name="btnSubmit" id="btnSubmit" value="Submit" class="btn btn-primary">Guardar</button>
                            <a href="index.html"><button name="btnCancel" id="btnCancel" value="cancel" class="btn btn-secondary">Cancelar</button></a>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
