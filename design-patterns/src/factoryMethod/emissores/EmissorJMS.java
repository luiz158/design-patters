package factoryMethod.emissores;

import factoryMethod.interfaces.Emissor;

public class EmissorJMS implements Emissor{

	@Override
	public void Envia(String msg) {
		System.err.println("Enviando JMS: "+msg);
	}

}
