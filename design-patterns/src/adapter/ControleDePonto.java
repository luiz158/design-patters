package adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePonto {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public void registraEntrada(Funcionario f) {

		Calendar calendar = Calendar.getInstance();
		String format = sdf.format(calendar.getTime());
		System.out.println("Entrada: " + f.getNome() + " �s " + format);
	}

	public void registraSaida(Funcionario f) {
		Calendar calendar = Calendar.getInstance();
		String format = sdf.format(calendar.getTime());
		System.out.println("Sa�da: " + f.getNome() + " �s " + format);
	}

}
