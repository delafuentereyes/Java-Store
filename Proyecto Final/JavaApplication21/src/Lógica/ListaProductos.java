/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica;

import Clases.Producto;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lflor
 */
public class ListaProductos {
    private ArrayList<Producto> LisProducto= new ArrayList();

    public ListaProductos() {
    }
    

    public ArrayList<Producto> getLisProducto() {
        return LisProducto;
    }

    public void setLisProducto(ArrayList<Producto> LisProducto) {
        this.LisProducto = LisProducto;
    }
    public void agregarProducto(Producto pproducto){
        this.LisProducto.add(pproducto);
    }
    
    public void eliminarProducto(String pnombre){
        for (int i =0 ; i<this.LisProducto.size();i++){
            if (this.LisProducto.get(i).getNombre().equals(pnombre)){
                this.LisProducto.remove(i);
            }
        
        }
    }
    
   public DefaultTableModel listarProductos(){
     Vector cabeceras = new Vector();
     cabeceras.addElement("Codigo");
     cabeceras.addElement("Nombre");
     cabeceras.addElement("Precio Interno");
     cabeceras.addElement("Precio de Venta");


     // Creamos el vector que contenga los datos
     // Creamos el modelo de tabla para agregarel vector, en la ubicacion 0

     DefaultTableModel mdlTablaInv = new DefaultTableModel(cabeceras,0);

    for (int i = 0 ; i<LisProducto.size();i++){
        Vector fila = new Vector();
        fila.addElement(LisProducto.get(i).getCodigo());
        fila.addElement(LisProducto.get(i).getNombre());
        fila.addElement(LisProducto.get(i).getPrecioInterno());
        fila.addElement(LisProducto.get(i).getPrecioVenta());
        mdlTablaInv.addRow(fila);
    }

  return mdlTablaInv;  

}
   
   
   public DefaultTableModel buscarProductos(String pcodigo){
    Vector cabeceras = new Vector();
    cabeceras.addElement("Codigo");
    cabeceras.addElement("Nombre");
    cabeceras.addElement("Precio Interno");
    cabeceras.addElement("Precio de Venta");


    // Creamos el vector que contenga los datos
    // Creamos el modelo de tabla para agregarel vector, en la ubicacion 0

    DefaultTableModel mdlTablaInv = new DefaultTableModel(cabeceras,0);

    for (int i = 0 ; i<LisProducto.size();i++){
        if(LisProducto.get(i).getCodigo().equals(pcodigo)){
         Vector fila = new Vector();
         fila.addElement(LisProducto.get(i).getCodigo());
         fila.addElement(LisProducto.get(i).getNombre());
         fila.addElement(LisProducto.get(i).getPrecioInterno());
         fila.addElement(LisProducto.get(i).getPrecioVenta());
         mdlTablaInv.addRow(fila);
            
        }

    }

  return mdlTablaInv;  

}

       

       
    
    
}
