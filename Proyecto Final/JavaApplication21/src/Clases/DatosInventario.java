
package Clases;

import java.io.BufferedReader;
import java.io.PrintWriter;


public class DatosInventario {
    
    private Producto producto;
    private int cantidad;


    
    public DatosInventario(Producto pproducto, int pcantidad) {
        this.producto = pproducto;
        this.cantidad = pcantidad;
    }

    public DatosInventario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Producto getProducto(){
        return this.producto;    
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int pcantidad) {
        this.cantidad = pcantidad;
    }

}