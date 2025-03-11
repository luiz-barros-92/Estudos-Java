package classeAbstrata;

public class Aluno extends Pessoa{
	private int matricula;

	public Aluno(String nome, int matricula) {
		super(nome);
		this.setMatricula(matricula);
	}
	
	@Override
	public void apresentar() {
		System.out.println("Nome: " + nome + "\nNúmero Matrícula: " + matricula);;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	
}
