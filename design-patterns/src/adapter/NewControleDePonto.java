package adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NewControleDePonto {

	public void registra(Funcionario f, boolean entrada) {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String format = simpleDateFormat.format(calendar.getTime());
		
		if (entrada == true) {
			System.out.println("Entrada : " + f.getNome() + " �s " + format);
		} else {
			System.out.println("Sa�da : " + f.getNome() + " �s " + format);
		}
		
	}
}
