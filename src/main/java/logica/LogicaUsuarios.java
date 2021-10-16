/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import persistencia.UsuarioDAO;
/**
 *
 * @author svelandia
 */
public class LogicaUsuarios {
    private ArrayList<Usuario> lista;
    
    public ArrayList<Usuario> getListaUsuarios() {
        return lista;
    }
    
    public boolean usuarioExiste(String user, String password){
        UsuarioDAO udao = new UsuarioDAO();
        Usuario usuario = udao.consultarUsuario(user);
        if (usuario != null)
            return usuario.getContrasena().equals(password);
        else
            return false;
    }

    public boolean usuarioRegistro(String name, String last_n, String usuario, String tdoc, int nd, String email, int telefono, String fnac, String password){
        UsuarioDAO udao = new UsuarioDAO();
        Usuario user = new Usuario(name, last_n, usuario, tdoc, nd, email, telefono, fnac, password);
        udao.guardarNuevoUsuario(user);
        Usuario usersaved = udao.consultarUsuario(usuario);
        return usersaved.getUsername().equals(usuario);
    }

}
