/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sendInformation;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 
 * @author Pablo
 */
public class correo {

   
    static String correo;
    static String password;
    
    Properties properties = new Properties();
    


    public void sendEmail() throws MessagingException {

            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "busvigoprogramacion@gmail.com");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);
            session.setDebug(true);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress( props.getProperty("mail.smtp.user")));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
            message.setSubject("BUS - VIGO");
            message.setText("RECUPERACIÓN DE CONTRASEÑA\n  Contraseña: "+password);

            Transport t = session.getTransport("smtp");
            t.connect( props.getProperty("mail.smtp.user"), "programacion");
            t.sendMessage(message, message.getAllRecipients());
            t.close();
            


    }
}
