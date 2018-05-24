package com.felippe.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felippe.cursomc.services.DBService;
import com.felippe.cursomc.services.EmailService;
import com.felippe.cursomc.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	DBService dbServie;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbServie.instantiateDatabase();
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
	
}
