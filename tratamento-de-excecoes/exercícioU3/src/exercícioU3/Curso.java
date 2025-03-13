package exercícioU3;

public class Curso {
	private String nome;
	private int cargaHoraria;
	private Instrutor instrutor;
	
	public void exibirDetalhes() {		
		System.out.println("---Detalhes do curso---");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Carga Horária: " + this.getCargaHoraria());
		System.out.println("Instrutor: " + instrutor.getNome());
		System.out.println("Especialização: " + instrutor.getEspecializacao());
		System.out.println("Email Instrutor: " + instrutor.getEmail());		
	}
	
	public Curso(String nome, int cargaHoraria, Instrutor instrutor) {
		if (nome == null || nome.trim().isEmpty()) {
	        throw new IllegalArgumentException("O nome do curso não pode ser vazio.");
	    }
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}
