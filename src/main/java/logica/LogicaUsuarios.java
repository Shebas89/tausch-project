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
        if (usuario.getContrasena().equals(password))
            return true;
        else
            return false;
    }
}
