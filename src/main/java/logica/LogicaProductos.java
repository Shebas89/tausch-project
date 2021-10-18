package logica;

import java.util.ArrayList;
import java.util.Objects;

import persistencia.ProductoDAO;
public class LogicaProductos {
    private ArrayList<Producto> lista;

    public ArrayList<Producto> getListaProductos() {
        return lista;
    }

    public boolean productoRegistro(int disp, String pnombre, String categoria, int cantidad, String medida,
                                    String direccion, String ciudad, int uid, String fpub, String fdisp,
                                    String descripcion, String estado, String imagen){
        ProductoDAO pdao = new ProductoDAO();
        Producto p = pdao.consultarProducto(pnombre);
        if (p == null){
            Producto pcreation = new Producto(disp,pnombre,categoria,cantidad,medida,direccion,ciudad,uid,fpub,fdisp,descripcion,estado);
            int id = pdao.guardarNuevoProducto(pcreation);
            return id != 0;
        }
        else
            return false;
    }
}
