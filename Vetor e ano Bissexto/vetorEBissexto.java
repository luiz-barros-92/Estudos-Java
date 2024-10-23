package vetor02;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Vetor02 {

	public static void main(String[] args) {
		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
				"Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		
		int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int totbi[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Calendar cal = GregorianCalendar.getInstance();		
		int ano = cal.get(Calendar.YEAR);
			System.out.println("Estamos no ano de " + ano + ", nele:");
		
		for (int c = 0; c < mes.length; c++)
			
			if(ano % 400 == 0) {
		
				System.out.println("O mês de " + mes[c] + " tem " + totbi[c] + " dias.");
			
			}else if (ano % 4 == 0 && ano % 100 != 0) {
				
				System.out.println("O mês de " + mes[c] + " tem " + totbi[c] + " dias.");
				
			}else {
				
				System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias.");
				
			}
	}
}
