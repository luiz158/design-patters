package factoryMethod.emissores;

import factoryMethod.interfaces.Emissor;

public class EmissorSMS implements Emissor{

	@Override
	public void Envia(String msg) {
		System.err.println("Enviando SMS: "+msg);
	}

}
