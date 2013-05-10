package adapter;

public class ControleDePontoAdapter extends ControleDePonto {

	private NewControleDePonto controleDePontoNovo;

	public ControleDePontoAdapter() {
		this.controleDePontoNovo = new NewControleDePonto();
	}

	public void registraEntrada(Funcionario f) {
		this.controleDePontoNovo.registra(f, true);
	}

	public void registraSaida(Funcionario f) {
		this.controleDePontoNovo.registra(f, false);
	}

}
