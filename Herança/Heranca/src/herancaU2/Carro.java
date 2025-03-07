package herancaU2;

public class Carro extends Veiculo {
	private int numeroPortas;	
	
	public Carro(String marca, String modelo, int ano, int numeroPortas) {
	    super(marca, modelo, ano);
	    this.numeroPortas = numeroPortas;
	}
	
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Nº de Portas: " + numeroPortas);
		System.out.println("------------------");
	}
}
