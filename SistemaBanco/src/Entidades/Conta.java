package Entidades;

public class Conta {
	
	private int numConta;
	private String nome;
	private double saldo;

	
	
	public Conta(String nome, int numConta, double valorDeposito) {
		
		this.nome = nome;
		this.numConta = numConta;
		depositar(valorDeposito);
	}
	
	public Conta(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
	}

	public void setNome(String nome) {
		this.nome = nome;	
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor + 5;
	}

	public String toString() {
		return "Número da conta: "
				+  getNumConta()
				+ ", Nome: "
				+ getNome()
				+", Saldo: $"
				+ String.format("%.2f", getSaldo());
	}






}