package Entidades;

public class Aluno {
	
	public String alunoNome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaTotal() {
		return nota1 + nota2 + nota3;
	}	
	public double pontosFalta() {
		if(notaTotal() < 60) {
			return 60 - notaTotal();
		}
		else {
			return 0.0;
		}
		
	}
}
