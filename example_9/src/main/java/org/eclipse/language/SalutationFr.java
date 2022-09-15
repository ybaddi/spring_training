package org.eclipse.language;

import org.springframework.stereotype.Component;

@Component
public class SalutationFr implements Salutation {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Bonjour");

	}

}
