package com.ItsFRZ.LocationDB.EmailUtility;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilityImplementation implements EmailUtility {

	@Autowired
	private JavaMailSender sender;
	
	@Override
	public void sendEmail(String toAddress, String toSubject, String toBody) {
		
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		
		try {
			helper.setTo(toAddress);
			helper.setSubject(toSubject);
			helper.setText(toBody);
		} catch (MessagingException e) {}
		
		
		sender.send(message);
		
	}

}
