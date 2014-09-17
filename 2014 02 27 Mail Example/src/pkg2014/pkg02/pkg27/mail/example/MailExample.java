package pkg2014.pkg02.pkg27.mail.example;

import java.net.PasswordAuthentication;
import java.util.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailExample {

    public static void main(String[] args) throws AddressException, MessagingException {
        final String username = "username@gmail.com";
        final char[] password = "password".toCharArray();

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("from-email@gmail.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("to-email@gmail.com"));
        message.setSubject("Testing Subject");
        message.setText("Dear Mail Crawler,\n\nNo spam to my email, please!");
        Transport.send(message);
        System.out.println("Done!");

    }

}
