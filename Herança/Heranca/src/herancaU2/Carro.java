package herancaU2;

public class Carro extends Veiculo {
	private int numeroPortas;	
	
	public Carro(int numeroPortas) {
	    super();
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
		System.out.println("Nº de Portas: " + numeroPortas);
	}
}
