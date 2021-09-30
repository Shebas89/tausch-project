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
import java.sql.Date;  
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
    public void verificarInsercionProducto() throws ParseException {
        ProductoDAO dao = new ProductoDAO();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date sqlDate1 = new java.sql.Date(df.parse("02-04-2020").getTime());
        Date sqlDate2 = new java.sql.Date(df.parse("02-28-2020").getTime());
        Producto p = new Producto(1,"Producto de prueba","Categoria prueba", 1, "kg","direccion test", "Ciudad test", 1, sqlDate1, sqlDate2,"descripcion test","estado test","imagen test");
        int id = dao.guardarNuevoProducto(p);
        Assert.assertTrue(id > 0, "No se guardó dato de un producto. ");
        String sql = "DELETE FROM `tausch-productos` WHERE id = " + id;
        ConexionBD con = new ConexionBD();
        int cant = con.ejecutarUpdate(sql);
        Assert.assertTrue(cant == 1, "No se logró hacer limpieza del dato de prueba de un producto ingresado. ");
        con.desconectar();
    }
    
    @Test
    public void verificarInsercionUsuario() throws ParseException {
        UsuarioDAO dao = new UsuarioDAO();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date sqlDate = new java.sql.Date(df.parse("24-08-1993").getTime());
        Usuario u = new Usuario("User","Test","Utest","cc",12389,"user@test.com",32067,sqlDate,"test-password");
        int id = dao.guardarNuevoUsuario(u);
        Assert.assertTrue(id > 0, "No se guardó dato de un usuario. ");
        String sql = "DELETE FROM `tausch-usuarios` WHERE id = " + id;
        ConexionBD con = new ConexionBD();
        int cant = con.ejecutarUpdate(sql);
        Assert.assertTrue(cant == 1, "No se logró hacer limpieza del dato de prueba de un usuario ingresado. ");
        con.desconectar();
    }
}
