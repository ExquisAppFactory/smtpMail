package com.osagieerhabor.smtpMail.Providers;

import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;
import java.security.GeneralSecurityException;

@Service
public class MailChimpProvider implements MailServiceProviders {
    @Override
    public void send(String to, String subject, String bodyText) throws IOException, MessagingException, GeneralSecurityException {
        System.out.println("MailChimpProvider");
    }
}
