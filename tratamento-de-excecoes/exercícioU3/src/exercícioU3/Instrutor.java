package exercícioU3;

public class Instrutor {
	private String nome;
	private String email;
	private String especializacao;
	
	
	public Instrutor(String nome, String email, String especializacao) {
		if (email == null || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("O e-mail informado é inválido.");
		}
		this.nome = nome;
		this.email = email;
		this.especializacao = especializacao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	
}
