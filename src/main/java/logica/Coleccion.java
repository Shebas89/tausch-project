/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import persistencia.ProductoDAO;
import persistencia.UsuarioDAO;

/**
 *
 * @author svelandia
 */
public class Coleccion {
    private ArrayList<Producto> lista_prod;
    private ArrayList<Usuario> lista_usuario;
    
    public ArrayList<Producto> getLista_prod() {
        return lista_prod;
    }
    
    public ArrayList<Usuario> getLista_usuario() {
        return lista_usuario;
    }
    
    public boolean cargarProducctos() {
        ProductoDAO dao_p = new ProductoDAO();
        lista_prod = dao_p.consultarProductos();
        if (lista_prod.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean cargarUsuario() {
        UsuarioDAO dao_u = new UsuarioDAO();
        lista_usuario = dao_u.consultarUsuarios();
        if (lista_usuario.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    } 
}
