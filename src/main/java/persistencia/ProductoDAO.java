/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import logica.Producto;

/**
 *
 * @author svelandia
 */
public class ProductoDAO {
        public ArrayList<Producto> consultarProductos() {
        ArrayList<Producto> lista = new ArrayList<>();
        ConexionBD con = new ConexionBD();
        ResultSet rs = con.ejecutarQuery("SELECT id, disponible, nombre, categoria, cantidad, medida," +
                                         " direccion, ciudad, id_usuario, fecha-publicacion, fecha-disponible, " +
                                         "descripcion, estado, imagen FROM tausch-productos ");
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                int disponible = rs.getInt("disponible");
                String nombre = rs.getString("nombre");
                int categoria = rs.getInt("categoria");
                int cantidad = rs.getInt("cantidad");
                int medida = rs.getInt("medida");
                String direccion = rs.getString("fechacompra");
                String ciudad = rs.getString("ciudad");
                int id_usuario = rs.getInt("id_usuario");
                String fecha_publicacion = rs.getString("fecha-publicacion");
                String fecha_disponible = rs.getString("fecha-disponible");
                String descripcion = rs.getString("descripcion");
                String estado = rs.getString("estado");
                Producto j = new Producto();
                lista.add(j);
            }
        } catch (SQLException ex) {
            con.desconectar();
            return null;
        }
        con.desconectar();
        return lista;
    }
}
