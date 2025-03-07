package herancaU2;

public class Moto extends Veiculo {
	private int cilindradas;
	
	public Moto(int cilindradas) {
	    super();
	    this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}	
	@Override
	public void exibirDetalhes() {
		System.out.println("Cilindradas: " + cilindradas);
	}	
}
