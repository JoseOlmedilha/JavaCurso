package Programa;

import java.util.Scanner;

import Aplicação.Pessoa;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double somaAltura = 0;
		int menores = 0;
		
		
		
		System.out.println("Quantas pessoas você vai adicionar: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] dados = new Pessoa[n];		
		
		for(int i=0; i < n ; i++) {
			System.out.printf("Dados da %d pessoa %n ",i + 1);
			
			
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			dados[i] = new Pessoa(nome,altura,idade);
		}
		
		/*System.out.println("----------------Pessoas cadastradas--------------------");
		
		for (int i = 0; i < n; i++) {
			
			String nome = dados[i].getNome();
			double altura = dados[i].getAltura();
			int idade = dados[i].getIdade();
			
			System.out.println(nome);
			System.out.println(altura);
			System.out.println(idade);
		}
		*/
		
		for (int i = 0; i < n; i++) {
			somaAltura += dados[i].getAltura();
			if (dados[i].getIdade() < 16) {
				 menores++;
				 
			}
		}
		
		double mediaAltura = somaAltura / n ;
		
		double percentualMenores = ((double)menores / n)* 100;
		
		
		System.out.printf("Altura Media: %.2f\n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		
		for (int i = 0; i < n; i++) {
			if (dados[i].getIdade() < 16) {
				System.out.println(dados[i].getNome());
			}
			
		}
		
		sc.close();
		
	}
}
