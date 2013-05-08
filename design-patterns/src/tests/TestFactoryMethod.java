package tests;

import factoryMethod.EmissorCreator;
import factoryMethod.interfaces.Emissor;

public class TestFactoryMethod {

	public static void main(String[] args) {
		EmissorCreator ec = new EmissorCreator();
		
		Emissor em = ec.create(EmissorCreator.SMS);
		em.Envia("Teste de SMS");
		
		em = ec.create(EmissorCreator.EMAIL);
		em.Envia("Teste EMAIL");
	}
	
}
