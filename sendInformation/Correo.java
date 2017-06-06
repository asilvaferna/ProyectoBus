/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendInformation;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Pablo
 */
public class Correo {

    public static String correo;
    public static String contenido;
    public static String ruta;

    public Correo() {
    }

    Properties properties = new Properties();

    public static void sendEmail() throws MessagingException {

        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.user", "busvigoprogramacion@gmail.com");
        props.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        session.setDebug(true);
        
         BodyPart texto = new MimeBodyPart();
        texto.setText(contenido);
        
        BodyPart adjunto = new MimeBodyPart();
        adjunto.setDataHandler(new DataHandler(new FileDataSource(ruta)));
        adjunto.setFileName("TARJETA DE EMBARQUE.pdf");

        MimeMultipart union = new MimeMultipart();
        union.addBodyPart(adjunto);
                union.addBodyPart(texto);

        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(props.getProperty("mail.smtp.user")));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
        message.setSubject("BUS - VIGO");
        message.setContent(union);

        Transport t = session.getTransport("smtp");
        t.connect(props.getProperty("mail.smtp.user"), "programacion");
        t.sendMessage(message, message.getAllRecipients());
        t.close();

    }
}
