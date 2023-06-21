package Aplication;


import java.util.Scanner;

import Entidades.Aluno;

public class Aprovados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos Alunos: ");
		int qtdAlunos = sc.nextInt();
		
		Aluno[] alunos = new Aluno[qtdAlunos];
		
		for (int i = 0; i < qtdAlunos; i++) {
			System.out.printf("Digite nome, primeria e sgunda nota do %d aluno: \n ", i + 1);
			sc.nextLine();
			String nome = sc.nextLine();
			double np1 = sc.nextDouble();
			double np2 = sc.nextDouble();
			alunos[i] = new Aluno(nome, np1,np2);
		}
		
		System.out.println("Alunos Aprovados: ");
		for (int i = 0; i < qtdAlunos; i++) {
			if(alunos[i].media() > 6) {
				System.out.println(alunos[i].getNome());
			}
			
		}
		
		sc.close();
	}
}
