package factoryMethod;

import factoryMethod.emissores.EmissorEmail;
import factoryMethod.emissores.EmissorJMS;
import factoryMethod.emissores.EmissorSMS;
import factoryMethod.interfaces.Emissor;

public class EmissorCreator {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;

	public Emissor create(int tipoDeEmissor){
		switch (tipoDeEmissor) {
		case 0:
			return new EmissorSMS();
		case 1:
			return new EmissorEmail();
		case 2:
			return new EmissorJMS();
		default:
			throw new IllegalArgumentException("Emissor não suportado");
		}
	}
}
