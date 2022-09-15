package org.eclipse.language;

import org.springframework.stereotype.Component;

@Component
public class SalutationEn implements Salutation {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hello");

	}

}
