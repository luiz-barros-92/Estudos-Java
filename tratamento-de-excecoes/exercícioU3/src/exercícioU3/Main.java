package exercícioU3;

public class Main {

	public static void main(String[] args) {
		
		try {
			Instrutor marcelo = new Instrutor("Marcelo Gastaldi", "marcelo@chavo.com", "Engenheiro de Software");
			
		    Curso java = new Curso("Java Para Iniciantes", 10, marcelo);
		    
		    java.exibirDetalhes();
		    
		} catch (IllegalArgumentException e) {
		    System.out.println(e.getMessage());
		}
	}
}
