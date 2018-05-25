package com.felippe.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.felippe.cursomc.domain.Cliente;
import com.felippe.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPass);
	
}
