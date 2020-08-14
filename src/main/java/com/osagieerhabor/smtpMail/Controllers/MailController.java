package com.osagieerhabor.smtpMail.Controllers;

import com.osagieerhabor.smtpMail.MailService;
import com.osagieerhabor.smtpMail.model.EmailCompose;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController
@RequestMapping("/mail")
public class MailController {
    @PostMapping
    public String sendMessage(@RequestBody EmailCompose email)
            throws GeneralSecurityException, IOException, MessagingException {

        MailService.sendMessage(email.getTo(), email.getSubject(), email.getBody());

        return "Message sent";
    }
}