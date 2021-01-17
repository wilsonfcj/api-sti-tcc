package ifsc.sti.tcc.utilidades;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl {
	
	public void sendSimpleMessage(JavaMailSender emailSender, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setTo("wilsonfernandes382@gmail.com");//, "correiaribeirotiago@gmail.com "); 
        message.setSubject(subject); 
        message.setText(text);
        emailSender.send(message);
	}
}
