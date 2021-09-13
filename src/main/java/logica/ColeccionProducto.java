/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import persistencia.ProductoDAO;

/**
 *
 * @author svelandia
 */
public class ColeccionProducto {
    private ArrayList<Producto> lista;
    
    public ArrayList<Producto> getLista() {
        return lista;
    }
    
    public boolean cargarJuguetes() {
        ProductoDAO dao = new ProductoDAO();
        lista = dao.consultarJuguetes();
        if (lista.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    } 
}
