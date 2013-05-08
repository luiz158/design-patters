package tests;

import builder.GeradorBoleto;
import builder.builders.BBBoletoBuilder;
import builder.interfaces.Boleto;
import builder.interfaces.BoletoBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorBoleto geradorDeBoleto = new GeradorBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();

		System.out.println(boleto);
	}
}
