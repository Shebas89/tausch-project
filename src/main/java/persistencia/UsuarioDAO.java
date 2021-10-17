/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import logica.Usuario;
/**
 *
 * @author svelandia
 */
public class UsuarioDAO {
    public int guardarNuevoUsuario(Usuario u) {
        ConexionBD con = new ConexionBD();
        int eliminado = u.getEliminado();
        String nombre = u.getNombre();
        String apellido = u.getApellido();
        String username = u.getUsername();
        String tipo_documento = u.getTipo_documento();
        long documento_identidad = u.getDocumento_identidad();
        String email = u.getEmail();
        long telefono = u.getTelefono();
        String fecha_nacimiento = u.getFecha_nacimiento();
        String contrasena = u.getContrasena();
        int contrasena_recuperacion = u.getContrasena_recuperacion();
        
        String sql = "INSERT INTO `dbtausch`.`tausch-usuarios` (eliminado, nombre, apellido, username, tipo_documento, documento_identidad, email, telefono, fecha_nacimiento, contrasena, contrasena_recuperacion) "+
                     "VALUES ("+eliminado+",'"+nombre+"', '"+apellido+"', '"+username+"', '"+tipo_documento+"', "+documento_identidad+", '"+email+"', "+telefono+", '"+fecha_nacimiento+"', '"+contrasena+"', "+contrasena_recuperacion+");";
        ResultSet rs = con.ejecutarInsert(sql);
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
    
    public ArrayList<Usuario> consultarUsuarios() {
        ArrayList<Usuario> lista = new ArrayList<>();
        ConexionBD con = new ConexionBD();
        String query = "SELECT id, eliminado, nombre, apellido, username, tipo_documento, documento_identidad, email, " +
                     "telefono, fecha_nacimiento, contrasena, contrasena_recuperacion FROM `dbtausch`.`tausch-usuarios`";
        ResultSet rs = con.ejecutarQuery(query);
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                int eliminado = rs.getInt("eliminado");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String username = rs.getString("username");
                String tipo_documento = rs.getString("tipo_documento");
                long documento_identidad = rs.getLong("documento_identidad");
                String email = rs.getString("email");
                long telefono = rs.getLong("telefono");
                String fecha_nacimiento= rs.getString("fecha_nacimiento");
                String contrasena = rs.getString("contrasena");
                int contrasena_recuperacion = rs.getInt("contrasena_recuperacion");
                Usuario j = new Usuario();
                lista.add(j);
            }
        } catch (SQLException ex) {
            con.desconectar();
            return null;
        }
        con.desconectar();
        return lista;
    }
    
    public Usuario consultarUsuario(String usuario) {
        Usuario u = null;
        ConexionBD con = new ConexionBD();
        String query = "SELECT id, eliminado, nombre, apellido, username, tipo_documento, documento_identidad, email, " +
                       "telefono, fecha_nacimiento, contrasena, contrasena_recuperacion FROM `dbtausch`.`tausch-usuarios`" +
                       "WHERE username = '" + usuario + "' or email = '"+ usuario +"';";
        ResultSet rs = con.ejecutarQuery(query);
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                int eliminado = rs.getInt("eliminado");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String username = rs.getString("username");
                String tipo_documento = rs.getString("tipo_documento");
                long documento_identidad = rs.getLong("documento_identidad");
                String email = rs.getString("email");
                long telefono = rs.getLong("telefono");
                String fecha_nacimiento= rs.getString("fecha_nacimiento");
                String contrasena = rs.getString("contrasena");
                int contrasena_recuperacion = rs.getInt("contrasena_recuperacion");
                u = new Usuario(id,eliminado,nombre,apellido,username,tipo_documento,documento_identidad,email,telefono,fecha_nacimiento,contrasena,contrasena_recuperacion);
            }
        } catch (SQLException ex) {
            con.desconectar();
            return null;
        }
        con.desconectar();
        return u;
    }

    public int actualizarUsuario(Usuario u) {
        String sql = "UPDATE `dbtausch`.`tausch-usuarios` " +
                "SET nombre = '" + u.getNombre() + "', username = '" + u.getUsername()+ "', contrasena = '" + u.getContrasena() + "', email = '" + u.getEmail() + "', contrasena_recuperacion = '" + u.getContrasena_recuperacion() + "', eliminado = '" + u.getEliminado() + "' " +
                "WHERE id = " + u.getId() + " ";
        ConexionBD con = new ConexionBD();
        return con.ejecutarUpdate(sql);
    }
}
