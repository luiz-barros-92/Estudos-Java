package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

	public static void main(String[] args) {
		int n = 0, s = 0, t = 0, p = 0, i = 0, c = 0;
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"<html><h3>Informe um número: </h3>"
					+ "<h5><em>digite 0 para sair</em></h5></html>"));
			t++;
			s += n;
			if (n % 2 == 0) {
				p++;
			}else {
				i++;
			}
			if (n > 100) {
				c++;
			}
			
		} while (n != 0);
		
		JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr><br>"
				+ "Total de Valores: " + (t - 1) 
				+ "<br>Total de Pares: " + (p - 1)
				+ "<br>Total de Ímpares: " + i 
				+ "<br>Acima de 100: " + c 
				+ "<br>Média dos Valores: "+ (s / (t - 1))
				+ "</html>");		
	}
}
