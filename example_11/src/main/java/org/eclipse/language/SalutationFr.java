package org.eclipse.language;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SalutationFr implements Salutation {

	private String name;
	
	public SalutationFr() {
		super();
		System.out.println("SalutationFr");
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Bonjour");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
