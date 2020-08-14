package com.osagieerhabor.smtpMail;

import com.osagieerhabor.smtpMail.Providers.GmailProvider;

import javax.mail.MessagingException;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class MailService {
    public static void sendMessage(String to,  String subject, String bodyText)
            throws GeneralSecurityException, MessagingException, IOException {
        GmailProvider.send(to, subject, bodyText);
    }
}
