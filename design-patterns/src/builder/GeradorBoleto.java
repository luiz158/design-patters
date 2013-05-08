package builder;

import java.util.Calendar;

import builder.interfaces.Boleto;
import builder.interfaces.BoletoBuilder;

public class GeradorBoleto {

	private BoletoBuilder boletoBuilder;

	public GeradorBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}

	public Boleto geraBoleto() {
		this.boletoBuilder.buildSacado(" Marcelo Martins ");
		this.boletoBuilder.buildCedente(" K19 Treinamentos ");
		this.boletoBuilder.buildValor(100.99);
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.MONTH, 1);
		
		this.boletoBuilder.buildVencimento(vencimento);
		this.boletoBuilder.buildNossoNumero(1234);
		
		Boleto boleto = boletoBuilder.getBoleto();
		
		return boleto;
	}
}
