package contact.hfttech.biz.contactinfo;

import contact.hfttech.biz.service.bo.ProcessContact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class ContactinfoApplication {

	public static void main(String[] args) {

		SpringApplication.run(ContactinfoApplication.class, args);
	}

	@Bean
	public ProcessContact getProcessContact() {
		return new ProcessContact();
	}

}
