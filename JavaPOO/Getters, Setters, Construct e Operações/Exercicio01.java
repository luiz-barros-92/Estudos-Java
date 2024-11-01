package ex01;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirConta() {
		if (this.tipo == "cc") {
			this.setSaldo(50);
		}else if (this.tipo == "cp") {
			this.setSaldo(150);
		}
		this.status = true;
	}
	
	public void fecharConta() {
		if (this.saldo > 0) {
			System.out.println("Não foi possível fechar sua conta, pois há ainda um saldo de R$" + this.getSaldo() + " que deve ser sacado.");
		}else if(this.saldo < 0) {
			System.out.println("Não foi possível fechar sua conta, pois há ainda uma dívida de R$" + this.getSaldo() + " a ser paga.");
		}else if(this.saldo == 0) {
			this.status = false;
			System.out.println("Conta encerrada com sucesso!");
		}
		
	}
	
	public void depositar(float d) {
		this.setSaldo(this.getSaldo() + d);
	}
	
	public void sacar(float s) {
		this.setSaldo(this.getSaldo() - s);
	}
	
	public void pagarMensal() {
		if (this.tipo == "cc") {
			this.setSaldo(this.getSaldo() - 12);
			System.out.println("Mensalidade paga, total de R$12,00 de sua Conta Corrente");
		}else if (this.tipo == "cp") {
			this.setSaldo(this.getSaldo() - 20);
			System.out.println("Mensalidade paga, total de R$20,00 de sua Conta Poupança");
		}
	}
  
	public void extrato() {
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: R$ " + this.getSaldo());
		if (this.isStatus() == true) {
			System.out.println("Status: Aberta");
		}else {
			System.out.println("Status: Fechada");
		}		
	}
}
