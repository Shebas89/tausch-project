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
    private int pid;
    private int disponible;
    private String pnombre;
    private String categoria;
    private int cantidad;
    private String medida;
    private String direccion;
    private String ciudad;
    private int id_usuario;
    private String fecha_publicacion;
    private String fecha_disponible;
    private String descripcion;
    private String estado;
    private String foto;

    public Producto() {
    }

    public Producto(int pid, String pnombre, int disponible, String categoria, int cantidad, String medida, String direccion, String ciudad, int id_usuario, String fecha_publicacion, String fecha_disponible, String descripcion, String estado, String imagen) {
        this.pid = pid;
        this.disponible = disponible;
        this.pnombre = pnombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.medida = medida;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.id_usuario = id_usuario;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_disponible = fecha_disponible;
        this.descripcion = descripcion;
        this.estado = estado;
        this.foto = "";
    }

    public Producto(int pdisponible, String pnombre, String pcategoria, int pcantidad, String pmedida, String pdireccion, String pciudad, int puid, String pfpub, String pfdis, String pdescripcion, String pestado) {
        this.disponible = pdisponible;
        this.pnombre = pnombre;
        this.categoria = pcategoria;
        this.cantidad = pcantidad;
        this.medida = pmedida;
        this.direccion = pdireccion;
        this.ciudad = pciudad;
        this.id_usuario = puid;
        this.fecha_publicacion = pfpub;
        this.fecha_disponible = pfdis;
        this.descripcion = pdescripcion;
        this.estado = pestado;
        this.foto = "";
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getFecha_disponible() {
        return fecha_disponible;
    }

    public void setFecha_disponible(String fecha_disponible) {
        this.fecha_disponible = fecha_disponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "pid=" + pid +
                ", disponible=" + disponible +
                ", pnombre='" + pnombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", cantidad=" + cantidad +
                ", medida='" + medida + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", id_usuario=" + id_usuario +
                ", fecha_publicacion='" + fecha_publicacion + '\'' +
                ", fecha_disponible='" + fecha_disponible + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
