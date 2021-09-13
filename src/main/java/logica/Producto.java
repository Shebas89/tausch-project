/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author svelandia
 */
public class Producto {
    private int id;
    private int disponible;
    private String categoria;
    private String subcategoria;
    private int cantidad;
    private String medida;
    private String direccion;
    private int id_usuario;
    private String fecha_publicacion;
    private String fecha_disponible;
    private String descripcion;
    private String estado;
    private String foto;

    public Producto() {
    }

    public Producto(int disponible, String categoria, String subcategoria, int cantidad, String medida, String direccion, int id_usuario, String fecha_publicacion, String fecha_disponible, String descripcion, String estado, String foto) {
        this.disponible = disponible;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.cantidad = cantidad;
        this.medida = medida;
        this.direccion = direccion;
        this.id_usuario = id_usuario;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_disponible = fecha_disponible;
        this.descripcion = descripcion;
        this.estado = estado;
        this.foto = foto;
    }

    public Producto(int id, int disponible, String categoria, String subcategoria, int cantidad, String medida, String direccion, int id_usuario, String fecha_publicacion, String fecha_disponible, String descripcion, String estado, String foto) {
        this.id = id;
        this.disponible = disponible;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.cantidad = cantidad;
        this.medida = medida;
        this.direccion = direccion;
        this.id_usuario = id_usuario;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_disponible = fecha_disponible;
        this.descripcion = descripcion;
        this.estado = estado;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public int getDisponible() {
        return disponible;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public String getFecha_disponible() {
        return fecha_disponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public String getFoto() {
        return foto;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public void setFecha_disponible(String fecha_disponible) {
        this.fecha_disponible = fecha_disponible;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "producto{" + "id=" + id + ", disponible=" + disponible + ", categoria=" + categoria + ", subcategoria=" + subcategoria + ", cantidad=" + cantidad + ", medida=" + medida + ", direccion=" + direccion + ", id_usuario=" + id_usuario + ", fecha_publicacion=" + fecha_publicacion + ", fecha_disponible=" + fecha_disponible + ", descripcion=" + descripcion + ", estado=" + estado + ", foto=" + foto + '}';
    }
}
