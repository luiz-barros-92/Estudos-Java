package tratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Digite o primeiro número inteiro: ");
			float n1 = scanner.nextFloat();
			
			System.out.print("Digite o segundo número inteiro: ");
			float n2 = scanner.nextFloat();
			
			if (n1 < 0 || n2 < 0) {
                throw new IllegalArgumentException("Não são permitidos números negativos!");
            }
			
			if (n2 == 0) {
				throw new IllegalArgumentException("Não é possível dividir por zero!");
			}
			float resultado = n1 / n2;
			System.out.println("A divisão dos números é " + resultado);
		}
		catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite apenas números válidos.");
		}
		catch(IllegalArgumentException e){
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			scanner.close();
		}			
	}
}