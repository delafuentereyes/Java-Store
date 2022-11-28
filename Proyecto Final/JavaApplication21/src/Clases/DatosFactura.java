package Clases;

public class DatosFactura {

    private String codigo;
    private String producto;
    private String precio;
    private String cantidad;
    private String precioTotal;

    /*public DatosFactura(String codigo, String productos, String precio, String cantidad, String precioTotal) {
        this.codigo = codigo;
        this.producto = productos;
        this.precio = precio;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        
    }
*/
    public DatosFactura() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProductos() {
        return producto;
    }

    public void setProductos(String productos) {
        this.producto = productos;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }

    
    
    
}
