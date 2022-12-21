package com.miu.registration.controller;

import com.miu.registration.kafka.EmailMessage;
import com.miu.registration.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("backend/emails")
public class EmailController {
    @Autowired
    EmailService emailService;
    @PostMapping
    public ResponseEntity<String> sendMail(@RequestBody EmailMessage emailMessage){
            emailService.sendEmail(emailMessage);
            return new ResponseEntity<String>("Success", HttpStatus.OK);

    }
}
