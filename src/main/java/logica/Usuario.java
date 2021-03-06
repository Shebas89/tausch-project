/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author svelandia
 */
public class Usuario {
    private int id;
    private int eliminado;
    private String unombre;
    private String apellido;
    private String Username;
    private String tipo_documento;
    private long documento_identidad;
    private String email;
    private long telefono;
    private String fecha_nacimiento;
    private String contrasena;
    private int contrasena_recuperacion;
    private String urole;

    public Usuario() {
    }

    public Usuario(int id, int eliminado, String unombre, String apellido, String Username, String tipo_documento, long documento_identidad, String email, long telefono, String fecha_nacimiento, String contrasena, int contrasena_recuperacion) {
        this.id = id;
        this.eliminado = eliminado;
        this.unombre = unombre;
        this.apellido = apellido;
        this.Username = Username;
        this.tipo_documento = tipo_documento;
        this.documento_identidad = documento_identidad;
        this.email = email;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contrasena = contrasena;
        this.contrasena_recuperacion = contrasena_recuperacion;
        this.urole = "usuario";
    }

    public Usuario(int eliminado, String unombre, String apellido, String Username, String tipo_documento, long documento_identidad, String email, long telefono, String fecha_nacimiento, String contrasena, int contrasena_recuperacion) {
        this.eliminado = eliminado;
        this.unombre = unombre;
        this.apellido = apellido;
        this.Username = Username;
        this.tipo_documento = tipo_documento;
        this.documento_identidad = documento_identidad;
        this.email = email;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contrasena = contrasena;
        this.contrasena_recuperacion = contrasena_recuperacion;
        this.urole = "usuario";
    }

    public Usuario(String unombre, String apellido, String username, String tipo_documento, int documento_identidad, String email, int telefono, String fecha_nacimiento, String contrasena) {
        this.eliminado = 0;
        this.unombre = unombre;
        this.apellido = apellido;
        this.Username = username;
        this.tipo_documento = tipo_documento;
        this.documento_identidad = documento_identidad;
        this.email = email;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contrasena = contrasena;
        this.contrasena_recuperacion = 0;
        this.urole = "usuario";
    }

    public Usuario(int id, int eliminado, String unombre, String apellido, String username, String tipo_documento, long documento_identidad, String email, long telefono, String fecha_nacimiento, String contrasena, int contrasena_recuperacion, String role) {
        this.id = id;
        this.eliminado = eliminado;
        this.unombre = unombre;
        this.apellido = apellido;
        this.Username = username;
        this.tipo_documento = tipo_documento;
        this.documento_identidad = documento_identidad;
        this.email = email;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contrasena = contrasena;
        this.contrasena_recuperacion = contrasena_recuperacion;
        this.urole = role;
    }

    public int getId() {
        return id;
    }

    public int getEliminado() {
        return eliminado;
    }

    public void setEliminado(int eliminado) {
        this.eliminado = eliminado;
    }

    public String getUNombre() {
        return unombre;
    }

    public void setUNombre(String unombre) {
        this.unombre = unombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public long getDocumento_identidad() {
        return documento_identidad;
    }

    public void setDocumento_identidad(long documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getContrasena_recuperacion() {
        return contrasena_recuperacion;
    }

    public void setContrasena_recuperacion(int contrasena_recuperacion) {
        this.contrasena_recuperacion = contrasena_recuperacion;
    }

    public String getRole() {
        return urole;
    }

    public void setRole(String role) {
        this.urole = role;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", eliminado=" + eliminado + ", unombre=" + unombre + ", apellido=" + apellido + ", Username=" + Username + ", tipo_documento=" + tipo_documento + ", documento_identidad=" + documento_identidad + ", email=" + email + ", telefono=" + telefono + ", fecha_nacimiento=" + fecha_nacimiento + ", contrasena=" + contrasena + ", contrasena_recuperacion=" + contrasena_recuperacion +", role="+urole+"}";
    }   
}
