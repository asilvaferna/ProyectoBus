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
import interfaz.Ticket;

/**
 *
 * @author Adri
 */
public class PrintPDF {

    public void imprimePagina() {
        try {
            Ticket ticket = new Ticket();
            
            String fileName = "ticket.pdf";

            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();

            doc.addPage(page);

            PDPageContentStream content = new PDPageContentStream(doc, page);

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 26);
            content.newLineAtOffset(220, 750);
            content.showText("Ticket");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 16);
            content.newLineAtOffset(80, 700);
            content.showText("Name : ");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 16);
            content.newLineAtOffset(80, 650);
            content.showText("Father Name : ");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 16);
            content.newLineAtOffset(80, 600);
            content.showText("Hola");
            content.endText();

            content.close();
            doc.save(fileName);
            doc.close();

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }
}
