package com.example.terramodusvt.controller;
import com.example.terramodusvt.entities.EmailRequest;
import com.example.terramodusvt.service.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-email")
    public void sendEmail(@RequestBody EmailRequest emailRequest) throws MessagingException {
        String to = emailRequest.getTo();
        String subject = emailRequest.getSubject();
        String text = emailRequest.getText();
        emailService.sendSimpleMessage(to, subject, text);
    }

}
