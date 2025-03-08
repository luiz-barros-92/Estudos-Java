package herancaU2;

public class Main {

	public static void main(String[] args) {
		Carro c1 = new Carro("Ford", "Escort", 1995, 3);
		c1.exibirDetalhes();	
		
		Carro c2 = new Carro("Fiat", "Palio", 2001, 3);
		c2.exibirDetalhes();
		
		Moto m1 = new Moto("Honda", "Biz", 2005, 100);
		m1.exibirDetalhes();
		
		Moto m2 = new Moto("Yamaha", "Ybr", 2003, 125);
		m2.exibirDetalhes();
	}
}
