package Clases;

public class DatosReporte {

    private String codigo, cantidad, producto, preciouni, pretotal;

    public DatosReporte(String codigo, String cantidad, String producto, String preciouni, String pretotal) {

        this.codigo = codigo;
        this.cantidad = cantidad;
        this.producto = producto;
        this.preciouni = preciouni;
        this.pretotal = pretotal;

    }

    public DatosReporte() {
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getproducto() {
        return producto;
    }

    public void setproducto(String codigo) {
        this.producto = producto;
    }

    public String getPreciouni() {
        return preciouni;
    }

    public void setPreciouni(String preciouni) {
        this.preciouni = preciouni;
    }

    public String getpretotal() {
        return pretotal;
    }

    public void setpretotal(String subtotal) {
        this.pretotal = subtotal;
    }

}
