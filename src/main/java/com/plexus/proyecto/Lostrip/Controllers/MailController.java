package com.plexus.proyecto.Lostrip.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/correo")
public class MailController {
	
	 @Autowired
	 
	 private JavaMailSender mailSender;
	 
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@PostMapping(path = "/enviar")
	 public void sendEmail(@RequestParam String to,@RequestParam String subject,@RequestParam String content) {

			logger.info("Enviando mensaje...");
	        SimpleMailMessage email = new SimpleMailMessage();

	        email.setTo(to);
	        email.setSubject(subject);
	        email.setText(content);

	        mailSender.send(email);
	    }
	
}
