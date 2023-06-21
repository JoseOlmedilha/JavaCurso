package Programa;

import java.util.Scanner;

import Aplication.Pessoa;

public class Aplicativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] vetor = new Pessoa[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %d a pessoa \n",i +1 );
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			vetor[i] = new Pessoa(nome, idade);
		}
		
		int maior = vetor[0].getIdade();
		int p = 0;
		
		for (int i = 1; i < n; i++) {
			if(vetor[i].getIdade() > maior ) {
				maior = vetor[i].getIdade();
				p = i;
			}
			else {
			}
		}
		System.out.print("A pessoa mais velha é " + vetor[p].getNome());
		
		
		
		
		sc.close();
	}

}
