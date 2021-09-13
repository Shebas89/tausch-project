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
        public ArrayList<Producto> consultarJuguetes() {
        ArrayList<Producto> lista = new ArrayList<>();
        ConexionBD con = new ConexionBD();
        ResultSet rs = con.ejecutarQuery("SELECT id, nombre, tipo, fechacompra, estado, disponibilidad FROM juguetes ");
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String tipo = rs.getString("tipo");
                String fechaCompra = rs.getString("fechacompra");
                String estado = rs.getString("estado");
                String disponibilidad = rs.getString("disponibilidad");
                Producto j = new Producto();
                lista.add(j);
            }
        } catch (SQLException ex) {
            return null;
        }
        return lista;
    }
}
