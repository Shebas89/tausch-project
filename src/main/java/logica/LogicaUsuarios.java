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

    /* usuarioExiste retornara verdadero si el usuario y contrseña son correctos,
     * de lo contrario retornara falso */
    public boolean usuarioExiste(String user, String password){
        UsuarioDAO udao = new UsuarioDAO();
        Usuario usuario = udao.consultarUsuario(user);
        if (usuario != null)
            return usuario.getContrasena().equals(password);
        else
            return false;
    }

    /* usuarioRegistro retorna un booleano el cual sera falso cuando el usuario ya se encuentre registrado
     * y sera verdadero cuando el usuario no existe y sea cargado correctamente */
    public boolean usuarioRegistro(String name, String last_n, String usuario, String tdoc, int nd, String email,
                                   int telefono, String fnac, String password){
        UsuarioDAO udao = new UsuarioDAO();
        Usuario check_user = udao.consultarUsuario(usuario);
        if (check_user != null && !check_user.getUsername().equals(usuario) && !check_user.getEmail().equals(email)) {
            Usuario user = new Usuario(name, last_n, usuario, tdoc, nd, email, telefono, fnac, password);
            udao.guardarNuevoUsuario(user);
            Usuario usersaved = udao.consultarUsuario(usuario);
            return usersaved.getUsername().equals(usuario);
        }
        else
            return false;
    }

    /* resertPassword retornara verdadero is se actualiza la informacion de un usuario */
    public boolean resertPassword(String usuario, String email){
        UsuarioDAO udao = new UsuarioDAO();
        Usuario user = udao.consultarUsuario(usuario);
        if (user != null) {
            if (user.getEmail().equals(email)) {
                password pw = new password();
                user.setContrasena_recuperacion(1);
                user.setContrasena(pw.getPassword());
                return udao.actualizarUsuario(user) != 0;
            }
            else
                return false;
        }
        else
            return false;
    }

    public boolean nuevaContrasena(String user){
        UsuarioDAO udao = new UsuarioDAO();
        Usuario u = udao.consultarUsuario(user);
        int pw_rec = u.getContrasena_recuperacion();
        return pw_rec == 1;
    }

    public boolean actualizarContraseña(String user, String pw){
        UsuarioDAO udao = new UsuarioDAO();
        Usuario u = udao.consultarUsuario(user);
        if (u != null) {
            u.setContrasena_recuperacion(0);
            u.setContrasena(pw);
            udao.actualizarUsuario(u);
            return true;
        }
        else
            return false;
    }
}
