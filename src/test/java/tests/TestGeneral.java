/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import logica.Producto;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import persistencia.ConexionBD;
import persistencia.ProductoDAO;

/**
 *
 * @author svelandia
 */
public class TestGeneral {
    
    @Ignore
    public void verificarConexion() {
        ConexionBD con = new ConexionBD();
        Assert.assertTrue(con.isConectado(), "No hay conexión creada. ");
        con.desconectar();
        Assert.assertFalse(con.isConectado(), "No se cerró conexión. ");
    }
    
    @Ignore
    public void verificarCargaProductos() {
        ProductoDAO dao = new ProductoDAO();
        Assert.assertTrue(dao.consultarProductos().size() > 0, "No se cargaron datos de juguetes. ");
    }
    
    @Test
    public void verificarInsercionProducto() {
        ProductoDAO dao = new ProductoDAO();
        Producto p = new Producto(1,"Producto de prueba","Categoria prueba", 1, "kg","calle 123 5 6", "Bogota", 1, "feb-12-2021","feb-28-2021","Test","test","");
        int id = dao.guardarNuevoProducto(p);
        Assert.assertTrue(id > 0, "No se guardó dato de un juguete. ");
        String sql = "DELETE FROM `tausch-productos` WHERE id = " + id;
        ConexionBD con = new ConexionBD();
        int cant = con.ejecutarUpdate(sql);
        Assert.assertTrue(cant == 1, "No se logró hacer limpieza del dato de prueba de un juguete ingresado. ");
        con.desconectar();
    }
}
