<%--
  Created by IntelliJ IDEA.
  User: svelandia
  Date: 17/10/21
  Time: 12:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="logica.LogicaProductos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Nuevo Producto</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <h2 style="text-align:center">REGISTRO DE NUEVO PRODUCTO</h2>
        <div class="container">
            <div class="abs-center">
                <form action="#" class="border p-3 form">
                    <div class="form-group">
                        <div class="form-group mb-2">
                            <label for="txtPname">Nombre del Producto</label>
                            <input type="text" name="txtPname" id="txtPname" class="form-control" placeholder="Nombre del Producto" required>
                        </div>

                        <div class="form-group mb-2">
                            <label for="txtcategoria">Categoria</label>
                            <input type="text" name="txtcategoria" id="txtcategoria" placeholder="Categoria" required>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
