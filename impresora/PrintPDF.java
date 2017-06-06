/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresora;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * @author Pablo
 * @author Adri
 */
public class PrintPDF {

    private String nombreArchivo;
    private String nombreImagen;
    public static String ruta;

    BufferedImage awtImage;
    PDDocument doc;
    PDPage page;
    PDPageContentStream contenido;

    public PrintPDF() throws IOException {

        this.nombreImagen = "src/Images/bus_ticket.png";

        this.doc = new PDDocument();
        this.page = new PDPage();
        this.contenido = new PDPageContentStream(doc, page);
        this.awtImage = ImageIO.read(new File(this.nombreImagen));
        doc.addPage(page);
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo + ".pdf";
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public void imprimeTexto(String texto, int alto, int ancho, int fuente, String tipo) throws IOException {
        if (tipo.equals("negrita")) {
            contenido.beginText();
            contenido.setFont(PDType1Font.COURIER_BOLD, fuente);
            contenido.newLineAtOffset(alto, ancho);
            contenido.showText(texto);
            contenido.endText();
        } else {
            contenido.beginText();
            contenido.setFont(PDType1Font.COURIER, fuente);
            contenido.newLineAtOffset(alto, ancho);
            contenido.showText(texto);
            contenido.endText();
        }

    }

    public void imprimeImagen(int alto, int ancho) throws IOException {
        PDImageXObject img = LosslessFactory.createFromImage(doc, awtImage);
        contenido.drawImage(img, alto, ancho, awtImage.getWidth(), awtImage.getHeight());

    }

    public void cerrarContenido() throws IOException {
        contenido.close();
    }

    public void guardarPDF() throws IOException {
        doc.save(ruta + "/" + this.nombreArchivo);
    }

    public void cerrarPDF() throws IOException {
        doc.close();
    }
}
