
package Lógica;

import Clases.Producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class txtProducto {
        

    //asi se guarda en un archivo txt
    public void guardarArchivo(ArrayList<Producto> lista){
        
        try {
            File fd = new File("Productos.txt");
            fd.delete();
            FileWriter fw = new FileWriter("Productos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0 ; i<lista.size();i++){
              pw.print(lista.get(i).getCodigo());
              pw.print("|"+lista.get(i).getNombre());
              pw.print("|"+lista.get(i).getPrecioInterno());
              pw.println("|"+lista.get(i).getPrecioVenta());
            }
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // esto es para mostrar los datos en un jtable
    
    
    
    public ArrayList<Producto> CargarProductos(){
           ArrayList<Producto> Lis = new ArrayList();

        try {

            
            FileReader fr = new FileReader("Productos.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine()) !=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                 int x = 0;
                 Producto datos = new Producto();
                while(dato.hasMoreTokens()){
                    switch(x){
                        case 0:
                          datos.setCodigo(dato.nextToken());
                          break;
                        case 1:
                          datos.setNombre(dato.nextToken());
                          break;
                        case 2:
                          datos.setPrecioInterno(dato.nextToken());
                          break;
                        case 3:
                          datos.setPrecioVenta(dato.nextToken());
                          break;
                    }
                    
                 x++;

                }  
             Lis.add(datos);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            
        }
        
      return Lis;  
        
    }
    
    
    

}
