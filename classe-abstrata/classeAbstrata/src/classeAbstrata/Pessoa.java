package classeAbstrata;

public abstract class Pessoa {
	protected String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}	
	
	public abstract void apresentar();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
