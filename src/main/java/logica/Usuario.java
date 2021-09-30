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
    private String nombre;
    private String apellido;
    private String Username;
    private String tipo_documento;
    private long documento_identidad;
    private String email;
    private long telefono;
    private String contrasena;
    private int contrasena_recuperacion;

    public Usuario() {
    }

    public Usuario(int id, int eliminado, String nombre, String apellido, String Username, String tipo_documento, long documento_identidad, String email, long telefono, String contrasena, int contrasena_recuperacion) {
        this.id = id;
        this.eliminado = eliminado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Username = Username;
        this.tipo_documento = tipo_documento;
        this.documento_identidad = documento_identidad;
        this.email = email;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.contrasena_recuperacion = contrasena_recuperacion;
    }

    public Usuario(int eliminado, String nombre, String apellido, String Username, String tipo_documento, long documento_identidad, String email, long telefono, String contrasena, int contrasena_recuperacion) {
        this.eliminado = eliminado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Username = Username;
        this.tipo_documento = tipo_documento;
        this.documento_identidad = documento_identidad;
        this.email = email;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.contrasena_recuperacion = contrasena_recuperacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEliminado() {
        return eliminado;
    }

    public void setEliminado(int eliminado) {
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String gettipo_documento() {
        return tipo_documento;
    }

    public void settipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
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

    @Override
    public String toString() {
        return "usuario{" + "id=" + id + ", eliminado=" + eliminado + ", nombre=" + nombre + ", apellido=" + apellido + ", Username=" + Username + ", tipo_documento=" + tipo_documento + ", documento_identidad=" + documento_identidad + ", email=" + email + ", telefono=" + telefono + ", contrasena=" + contrasena + ", contrasena_recuperacion=" + contrasena_recuperacion + '}';
    }
}
