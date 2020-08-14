package com.osagieerhabor.smtpMail.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class EmailCompose {
    @Email
    @NotNull
    String to;

    @NotNull
    String subject;

    @NotNull
    String body;
}
