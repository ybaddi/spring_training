package org.eclipse.config;

import org.eclipse.model.Adress;
import org.eclipse.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.eclipse.language, org.eclipse.model")
public class ApplicationConfig {
	
//	@Bean
//	public Student st(Adress adr) {
//		Student stObject = new Student(1,"baddi",adr);
//		return stObject;
//	}
	
//	@Bean
//	@Scope("prototype")
//	public Adress adr() {
//		Adress adressObject = new Adress(1,"Rabat");
//		return adressObject;
//	}
	
}
