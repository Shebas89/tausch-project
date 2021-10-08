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
        String query = "SELECT id, disponible, nombre, categoria, cantidad, medida, " +
                       "direccion, ciudad, id_usuario, fecha_publicacion, fecha_disponible, " +
                       "descripcion, estado, imagen FROM \"tausch-productos\"";
        ResultSet rs = con.ejecutarQuery(query);
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                int disponible = rs.getInt("disponible");
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                int cantidad = rs.getInt("cantidad");
                String medida = rs.getString("medida");
                String direccion = rs.getString("fechacompra");
                String ciudad = rs.getString("ciudad");
                int id_usuario = rs.getInt("id_usuario");
                String fecha_publicacion = rs.getString("fecha_publicacion");
                String fecha_disponible = rs.getString("fecha_disponible");
                String descripcion = rs.getString("descripcion");
                String estado = rs.getString("estado");
                String imagen = rs.getString("imagen");
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
        
    public Producto consultarProducto(int idAConsultar) {
        Producto p = null;
        ConexionBD con = new ConexionBD();
        String sql = "SELECT id, disponible, nombre, categoria, cantidad, medida, " +
                     "direccion, ciudad, id_usuario, fecha_publicacion, fecha_disponible, " +
                     "descripcion, estado FROM \"tausch-productos\" "+
                     "WHERE id = " + idAConsultar + ";";
        ResultSet rs = con.ejecutarQuery(sql);
        try {
            if (rs.next()) {
                int id = rs.getInt("id");
                int disponible = rs.getInt("disponible");
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                int cantidad = rs.getInt("cantidad");
                String medida = rs.getString("medida");
                String direccion = rs.getString("fechacompra");
                String ciudad = rs.getString("ciudad");
                int id_usuario = rs.getInt("id_usuario");
                String fecha_publicacion = rs.getString("fecha_publicacion");
                String fecha_disponible = rs.getString("fecha_disponible");
                String descripcion = rs.getString("descripcion");
                String estado = rs.getString("estado");
                String imagen = rs.getString("imagen");
                p = new Producto(id, disponible, categoria, cantidad, medida, direccion, ciudad, id_usuario, fecha_publicacion, fecha_disponible, descripcion, estado, imagen);
            }
        } catch (SQLException ex) {
            con.desconectar();
            return p;
        }
        con.desconectar();
        return p;
    }
    
    public ArrayList<Producto> consultarProductoPorFiltro(String filtro) {
        ArrayList<Producto> lista = new ArrayList<>();
        ConexionBD con = new ConexionBD();
        String sql = "SELECT j.id, j.nombre, j.tipojuguete_id, t.tipo, j.fechacompra, j.estadojuguete_id, e.estado, j.disponibilidad " +
                     "FROM \"tausch-productos\" tp " +
                     "JOIN \"tausch-productos\"-categoria tpc ON j.tipojuguete_id = t.id " +
                     "JOIN \"tausch-productos\"-estado tpe ON (j.estadojuguete_id = e.id) " +
                     "WHERE j.nombre LIKE '%" + filtro + "%' " +
                     "OR t.tipo LIKE '%" + filtro + "%' " +
                     "OR e.estado LIKE '%" + filtro + "%' " +
                     "OR j.disponibilidad LIKE '%" + filtro + "%' ";
        ResultSet rs = con.ejecutarQuery(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                int disponible = rs.getInt("disponible");
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                int cantidad = rs.getInt("cantidad");
                String medida = rs.getString("medida");
                String direccion = rs.getString("fechacompra");
                String ciudad = rs.getString("ciudad");
                int id_usuario = rs.getInt("id_usuario");
                String fecha_publicacion = rs.getString("fecha_publicacion");
                String fecha_disponible = rs.getString("fecha_disponible");
                String descripcion = rs.getString("descripcion");
                String estado = rs.getString("estado");
                String imagen = rs.getString("imagen");
                Producto j = new Producto(id, disponible, categoria, cantidad, medida, direccion, ciudad, id_usuario, fecha_publicacion, fecha_disponible, descripcion, estado, imagen);
                lista.add(j);
            }
        } catch (SQLException ex) {
            con.desconectar();
            return null;
        }
        con.desconectar();
        return lista;
    }
    
    public int guardarNuevoProducto(Producto p) {
        ConexionBD con = new ConexionBD();
        int disponible = p.getDisponible();
        String nombre = p.getNombre();
        String categoria = p.getCategoria();
        int cantidad = p.getCantidad();
        String medida = p.getMedida();
        String direccion = p.getDireccion();
        String ciudad = p.getCiudad();
        int id_usuario = p.getId_usuario();
        String fecha_publicacion = p.getFecha_publicacion();
        String fecha_disponible = p.getFecha_disponible();
        String descripcion = p.getDescripcion();
        String estado = p.getEstado();
        String imagen = p.getFoto();
        
        String sql = "INSERT INTO \"tausch-productos\" (disponible, nombre, categoria, cantidad, medida, direccion, ciudad, " +
                     "id_usuario, fecha_publicacion, fecha_disponible, descripcion, estado, imagen) "+
                     "VALUES ("+ disponible +",'"+nombre+"', '"+categoria+"', "+cantidad+", '"+medida+"', '"+direccion+
                     "', '"+ciudad+"', "+id_usuario+", '"+fecha_publicacion+"', '"+fecha_disponible+"', '"+descripcion+"', '"+estado+"', '"+imagen+"') ";
        ResultSet rs = con.ejecutarInsert(sql);
        System.out.println(rs);
        int id = 0;
        try {
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            con.desconectar();
            return 0; 
        }
        con.desconectar();
        return id;
    }
        
    public int guardarProductoExistente(Producto p) {
        ConexionBD con = new ConexionBD();
        int id = p.getId();
        int disponible = p.getDisponible();
        String nombre = p.getNombre();
        String categoria = p.getCategoria();
        int cantidad = p.getCantidad();
        String medida = p.getMedida();
        String direccion = p.getDireccion();
        String ciudad = p.getCiudad();
        int id_usuario = p.getId_usuario();
        String fecha_publicacion = p.getFecha_publicacion();
        String fecha_disponible = p.getFecha_disponible();
        String descripcion = p.getDescripcion();
        String estado = p.getEstado();
        String imagen = p.getFoto();
        
        String sql = "UPDATE \"tausch-productos\" "+
                     "SET disponible = "+disponible+", nombre = '" + nombre + "' , categoria = '" + categoria + "' , cantidad = " + cantidad + ", medida = '" + medida + "', direccion = '" + direccion + "' " + 
                     ", ciudad = '" +ciudad+ "', id_usuario = '"+id_usuario+"', fecha_publicacion = '"+fecha_publicacion+"', fecha_disponible = '"+fecha_disponible+"', descripcion = '"+descripcion+"', estado = '"+ estado+"', imagen = '"+imagen+"'"+
                     "WHERE id = " + id + " ";
        int filas = con.ejecutarUpdate(sql);
        con.desconectar();
        return filas;
    }
}
