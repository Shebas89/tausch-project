/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import logica.Producto;
import logica.Usuario;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import persistencia.ConexionBD;
import persistencia.ProductoDAO;
import persistencia.UsuarioDAO;
import java.text.ParseException;

/**
 *
 * @author svelandia
 */
public class TestGeneral {
    
    @Test
    public void verificarConexion() {
        ConexionBD con = new ConexionBD();
        Assert.assertTrue(con.isConectado(), "No hay conexión creada. ");
        con.desconectar();
        Assert.assertFalse(con.isConectado(), "No se cerró conexión. ");
    }
    
    @Ignore
    public void verificarCargaProductos() {
        ProductoDAO dao = new ProductoDAO();
        Assert.assertTrue(dao.consultarProductos().size() > 0, "No se cargaron datos de productos. ");
    }
    
    @Test
    public void verificarCargaUsuarios() {
        UsuarioDAO dao = new UsuarioDAO();
        Assert.assertTrue(dao.consultarUsuarios().size() > 0, "No se cargaron datos de productos. ");
    }
    
    @Test
    public void verificarUsuario() {
        UsuarioDAO dao = new UsuarioDAO();
        Assert.assertTrue(dao.consultarUsuario("admin").getUsername().contentEquals("admin"), "No se cargaron datos de productos. ");
    }
    
    @Test
    public void verificarInsercionProducto() {
        ProductoDAO dao = new ProductoDAO();
        Producto p = new Producto(1,"Producto-de-prueba","Categoria-prueba", 1, "kg","direccion-test", "Ciudad test", 1, "2020-04-02", "2020-04-28","descripcion-test","estado-test");
        int id = dao.guardarNuevoProducto(p);
        Assert.assertTrue(id > 0, "No se guardó dato de un producto. ");
        String sql = "DELETE FROM `tausch-productos` WHERE nombre = 'Producto-de-prueba'";
        ConexionBD con = new ConexionBD();
        int cant = con.ejecutarUpdate(sql);
        Assert.assertEquals(cant, 1, "No se logró hacer limpieza del dato de prueba de un producto ingresado. ");
        con.desconectar();
    }
    
    @Test
    public void verificarInsercionUsuario() {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = new Usuario("User","Test","Utest","cc",12389,"user@test.com",32067,"1989-10-17","test-password");
        int id = dao.guardarNuevoUsuario(u);
        Assert.assertTrue(id > 0, "No se guardó dato de un usuario. ");
        String sql = "DELETE FROM `tausch-usuarios` WHERE id = " + id;
        ConexionBD con = new ConexionBD();
        int cant = con.ejecutarUpdate(sql);
        Assert.assertEquals(cant, 1, "No se logró hacer limpieza del dato de prueba de un usuario ingresado. ");
        con.desconectar();
    }

    @Test
    public void verificarActualizacionUsuario() {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = new Usuario("User","Test","Utest","cc",12389,"user@test.com",32067,"1989-10-17","test-password");
        int id = dao.guardarNuevoUsuario(u);
        Assert.assertTrue(id > 0, "No se guardó dato de un usuario. ");
        Usuario u1 = dao.consultarUsuario("Utest");
        u1.setContrasena_recuperacion(1);
        u1.setContrasena("password-test");
        int id_update = dao.actualizarUsuario(u1);
        Assert.assertTrue(id_update > 0, "No se actualizo la informacion del usuario");
        String sql = "DELETE FROM `tausch-usuarios` WHERE id = " + u1.getId();
        ConexionBD con = new ConexionBD();
        int cant = con.ejecutarUpdate(sql);
        Assert.assertEquals(cant, 1, "No se logró hacer limpieza del dato de prueba de un usuario ingresado. ");
        con.desconectar();
    }
}
