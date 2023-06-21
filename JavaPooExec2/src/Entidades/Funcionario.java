package Entidades;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double imposto;
	
	public double salarioImposto() {
		return salario - imposto;
	}
	
	public void aumento(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", salarioImposto());
	}
}
