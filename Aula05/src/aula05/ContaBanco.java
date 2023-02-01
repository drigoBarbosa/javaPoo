package aula05;

public class ContaBanco {
	
	// Atributos;
	
	public int numconta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// Métodos;
	
	public void estadoAtual() {
		System.out.println("============================================================");
		System.out.println("Conta: " + this.getNumConta());	
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		
	} 
	
	
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			System.out.print("Conta Corrente ");
			this.setSaldo(50.00f);
		} else if (t == "CP") {
			System.out.print("Conta Poupança ");
			this.setSaldo(150.00f);
		} else if (t != "CC" || t != "CP"){
			System.out.print("Tipo inválido! ");
		}
		System.out.println("Aberta com sucesso! ");
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Não pode ser fechada, Conta com Dinheiro! ");
		} else if (this.getSaldo() < 0) {
			System.out.println("Não pode ser fechada, Conta com Débito! ");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso! ");
		}
	}
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.dono);
		} else {
			System.out.print("Impossivel depósitar, conta fechada! ");
		}
	}
	public void sacar(float v) {
		if (this.getStatus()){
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque de " + v + " Realizado na conta de " + this.getDono());
			} else {
				System.out.println("[ERRO] conta vazia! ");
			}
		} else {
			System.out.println("[ERRO] conta fechada! ");
		}
	}
	public void pegarMensal() {
		float v = 0;
		if (this.getTipo() == "CC") {
			v = 12f;
		} else if (this.getTipo() == "CP") {
			v = 20f;
		}
		if (this.getStatus()) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente! ");
			}
		} else {
			System.out.println("Conta fechada, impossivel pagar! ");
		}
	}
	
	// Métodos Especiais;
	
	public void ContaBanco() { // Método construtor;
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void setNumConta(int n) { // Método Modificador;
		this.numconta = n;
	}
	public int getNumConta() { // Método Acessor;
		return this.numconta;
	}
	public void setTipo(String t) {
		this.tipo = t; 
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public String getDono() {
		return this.dono;
	}
	public void setSaldo(float s) {
		this.saldo = s;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setStatus(boolean s) {
		this.status = s;
	}
	public boolean getStatus() {
		return this.status;
	}	
	
	
	
	
	
	
	
	
}

