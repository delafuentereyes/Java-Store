
package Clases;

/**
 *
 * @author lflor
 */
public class Producto {
    
  private String codigo, nombre, precioInterno, precioVenta;
  
  public Producto(String codigo, String nombre, String precioInterno, String precioVenta) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.precioInterno = precioInterno;
    this.precioVenta = precioVenta;
  }
  public Producto(){}

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setPrecioInterno(String precioInterno) {
        this.precioInterno = precioInterno;
    }
    public String getPrecioInterno() {
        return precioInterno;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }
        
  

    
}
