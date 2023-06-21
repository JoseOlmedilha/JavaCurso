package Entidades;

public class Aluno {

	private String nome;
	private double np1;
	private double np2;
	
	
	public Aluno(String nome, double np1, double np2) {
		this.nome = nome;
		this.np1 = np1;
		this.np2 = np2;
	}
	
	public double media() {
		return (np1 + np2)/2;
	}

	public String getNome() {
		return nome;
	}


	public double getNp1() {
		return np1;
	}


	public double getNp2() {
		return np2;
	}
	
	
}
