package tests;

import singleton.Configuracao;

public class TestSingleton {

	public static void main ( String [] args ) {
		Configuracao configuracao = Configuracao.getInstance ();
		 System.out.println("TIME_ZONE: "+configuracao.getPropriedade("time-zone"));
		 System.out.println("CURRENCY: "+configuracao.getPropriedade("currency-code"));
	}
	
}
