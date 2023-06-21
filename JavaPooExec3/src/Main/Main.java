package Main;

import Entidades.Aluno;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("Digite o nome do aluno:  ");
		aluno1.alunoNome = sc.nextLine();
		System.out.println("Digite as notas do aluno: ");
		aluno1.nota1 = sc.nextDouble();
		aluno1.nota2 = sc.nextDouble();
		aluno1.nota3 = sc.nextDouble();
		
		System.out.printf("Sua nota total foi: %.2f%n ", aluno1.notaTotal());
		
		if(aluno1.notaTotal() < 60) {
			System.out.println("Reprovado");
			System.out.printf("Faltou: %.2f de pontos %n", aluno1.pontosFalta());
		}
		else {
			System.out.println("Passou");
		}
		
		
		
		
		
		sc.close();
	}

}
