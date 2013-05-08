package factoryMethod.emissores;

import factoryMethod.interfaces.Emissor;

public class EmissorEmail implements Emissor{

	@Override
	public void Envia(String msg) {
		System.err.println("Enviando EMAIL: "+msg);
	}
}
