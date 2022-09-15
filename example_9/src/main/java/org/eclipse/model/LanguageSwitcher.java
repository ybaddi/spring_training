package org.eclipse.model;

import org.eclipse.language.Salutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("languageSwitcher")
public class LanguageSwitcher {

	@Autowired
//	@Qualifier("salutationFr")
	private Salutation salutation;
	
	public void direBonjour() {
		salutation.sayHello();
	}
	
}

/*
Component  annotation de base
Controller  -> MVC
Service couche metier
Repository Dao

*/