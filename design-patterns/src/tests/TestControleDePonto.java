package tests;

import adapter.ControleDePonto;
import adapter.ControleDePontoAdapter;
import adapter.Funcionario;

public class TestControleDePonto {

/*	public static void main(String[] args) throws InterruptedException {
		
		ControleDePonto controleDePonto = new ControleDePonto();
		Funcionario funcionario = new Funcionario("Marcelo Martins");

		controleDePonto.registraEntrada(funcionario);

		Thread.sleep(3000);

		controleDePonto.registraSaida(funcionario);
	}*/

	public static void main(String[] args) throws InterruptedException {

		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		Funcionario funcionario = new Funcionario("Marcelo Martins");

		controleDePonto.registraEntrada(funcionario);

		Thread.sleep(3000);

		controleDePonto.registraSaida(funcionario);
	}
}
