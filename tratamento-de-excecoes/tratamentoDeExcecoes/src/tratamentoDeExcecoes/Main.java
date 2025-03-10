package tratamentoDeExcecoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float n1 = scanner.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float n2 = scanner.nextFloat();
		
		scanner.close();
		
		float resultado = n1 / n2;
		
		System.out.println("A divisão dos números é " + resultado);
	}

}
