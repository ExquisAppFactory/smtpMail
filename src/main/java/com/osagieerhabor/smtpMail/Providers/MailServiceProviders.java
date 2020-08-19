package com.osagieerhabor.smtpMail.Providers;

import javax.mail.MessagingException;
import java.io.IOException;
import java.security.GeneralSecurityException;

public interface MailServiceProviders {
    void send(String to, String subject, String bodyText)
            throws IOException, MessagingException, GeneralSecurityException;
}
