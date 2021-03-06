package br.com.fiap.Transaction.service;

import br.com.fiap.Transaction.dto.MailSenderDTO;
import br.com.fiap.Transaction.mail.MailPayload;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.List;

public interface MailSenderService {

    JavaMailSender createConnection(MailSenderDTO mailSenderDTO);
    void sendEmail(MailPayload mailPayload);
    MailPayload getMailPayload(Long idCliente);
	void sendSimpleMail(String to, String subject, String body);
}
