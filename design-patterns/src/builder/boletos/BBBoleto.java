package builder.boletos;

import java.util.Calendar;

import builder.interfaces.Boleto;

public class BBBoleto implements Boleto {

	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;

	public BBBoleto(String sacado, String cedente, double valor,
			Calendar vencimento, int nossoNumero) {
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}

	@Override
	public String getSacado() {
		return sacado;
	}

	@Override
	public String getCedente() {
		return cedente;
	}

	@Override
	public double getValor() {
		return valor;
	}

	@Override
	public Calendar getVencimento() {
		return vencimento;
	}

	@Override
	public int getNossoNumero() {
		return nossoNumero;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("Boleto BB");
		stringBuilder.append("\n");
		
		stringBuilder.append("Sacado: "+sacado);
		stringBuilder.append("\n");
		
		stringBuilder.append("Cedente: "+cedente);
		stringBuilder.append("\n");
		
		stringBuilder.append("Valor: "+valor);
		stringBuilder.append("\n");
		
		stringBuilder.append("Vencimento: "+vencimento.toString());
		stringBuilder.append("\n");
		
		stringBuilder.append("Nosso número: "+nossoNumero);
		stringBuilder.append("\n");
		
		return stringBuilder.toString();
	}
	
}
