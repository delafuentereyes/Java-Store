package Lógica;

import Clases.DatosReporte;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
import java.util.ArrayList;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import javax.swing.JOptionPane;

public class Reportes {

    String nombreEmpresa;
    String Fecha;
    String rutaImagen;

    ArrayList<DatosReporte> productos;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo,
            ubicacion,
            codigoPostal,
            paginaWeb;

    public Reportes(String nombreEmpresa, String Fecha, ArrayList<DatosReporte> productos, String rutaImagen) {
        this.nombreEmpresa = nombreEmpresa;
        this.rutaImagen = rutaImagen;
        this.Fecha = Fecha;
        this.productos = productos;

        documento = new Document();
        titulo = new Paragraph("REPORTE DE VENTAS ");
        ubicacion = new Paragraph("Ubicacion: San José,Puriscal,Santiago");
        codigoPostal = new Paragraph("Codigo Postal: 10401");
        paginaWeb = new Paragraph("  www.Interthink.cr.com  ");

    }

    public Reportes() {

    }

    public void crearReportes() {

        try {

            archivo = new FileOutputStream(nombreEmpresa + ".pdf");
            PdfWriter.getInstance(documento, archivo);

            documento.open();

            //alineaciones 
            titulo.setAlignment(Element.ALIGN_LEFT);
            documento.add(Chunk.NEWLINE);
            ubicacion.setAlignment(Element.ALIGN_LEFT);
            documento.add(Chunk.NEWLINE);
            codigoPostal.setAlignment(Element.ALIGN_LEFT);
            documento.add(Chunk.NEWLINE);
            paginaWeb.setAlignment(Element.ALIGN_LEFT);
            documento.add(Chunk.NEWLINE);

            //para la tabla 
            documento.add(Chunk.NEWLINE);

            PdfPTable tabla = new PdfPTable(5);
            tabla.setWidthPercentage(100);

            PdfPCell codigo = new PdfPCell(new Phrase("codigo"));
            codigo.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell cantidad = new PdfPCell(new Phrase("cantidad"));
            cantidad.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell producto = new PdfPCell(new Phrase("producto"));
            producto.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell preciouni = new PdfPCell(new Phrase("P.Unitario"));
            preciouni.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell ptotal = new PdfPCell(new Phrase("P.Total"));
            ptotal.setBackgroundColor(BaseColor.LIGHT_GRAY);

            tabla.addCell(codigo);
            tabla.addCell(cantidad);
            tabla.addCell(producto);
            tabla.addCell(preciouni);
            tabla.addCell(ptotal);

            // para agregar imagenes y darle posicion 
            Image imagen = null;

            try {
                imagen = Image.getInstance(rutaImagen);
                imagen.scaleAbsolute(150, 120);
                imagen.setAbsolutePosition(415, 715);
            } catch (Exception e) {
            }
            //tabla 
            for (DatosReporte producto1 : productos) {
                tabla.addCell(producto1.getcodigo());
                tabla.addCell(producto1.getCantidad());
                tabla.addCell(producto1.getproducto());
                tabla.addCell(producto1.getPreciouni());
                tabla.addCell(producto1.getpretotal());

            }

            //con esto lo mostramos en el PDF
            documento.add(imagen);
            documento.add(titulo);
            documento.add(ubicacion);
            documento.add(codigoPostal);
            documento.add(paginaWeb);
            documento.add(Chunk.NEWLINE);
            documento.add(tabla);
            documento.add(Chunk.NEWLINE);

            documento.close();
            JOptionPane.showMessageDialog(null, "El reporte se a generado -_-");

        } catch (Exception e) {
        }

    }
}
