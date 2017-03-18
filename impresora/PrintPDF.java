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


import interfaz.Ticket;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author Adri
 */
public class PrintPDF {

    public void imprimePagina() {
        try {
            
            
            String fileName = "ticket.pdf";
            String imageName = "/Users/Adri/NetBeansProjects/ProyectoBus/src/Images/ticket.png";

            BufferedImage awtImage = ImageIO.read(new File(imageName));
            
            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();

            doc.addPage(page);

            PDPageContentStream content = new PDPageContentStream(doc, page);
            
            
            PDImageXObject img = LosslessFactory.createFromImage(doc, awtImage);
                    
            content.drawImage(img, 200, 30, awtImage.getWidth(), awtImage.getHeight());
            content.close();

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
