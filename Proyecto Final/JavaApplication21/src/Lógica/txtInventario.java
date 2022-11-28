package Lógica;

import java.util.Vector;
import Clases.DatosInventario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class txtInventario {
        
    
    //asi se guarda en un archivo txt
    public void guardarArchivo(DatosInventario datos){
        
        try {
            FileWriter fw = new FileWriter("Inventarios.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(datos.getProducto().getCodigo());
            pw.print("|"+datos.getCantidad());
            pw.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // esto es para mostrar los datos en un jtable
    
   
        
    
    
    
}
