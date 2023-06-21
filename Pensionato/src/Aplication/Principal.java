package Aplication;

import java.util.Scanner;

import Entidades.Quartos;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Quartos[] vect = new Quartos[10];

		System.out.println("Quantos alunos vão alugar quarto: ");
		int n = sc.nextInt();
		
		System.out.println("Digite nome, E-mail e quarto: ");
		
		
		for (int i = 0; i < n; i++) {
			
			
			System.out.println("Digite os dados da " + (i +1) + "pessoa");
			System.out.println();
			
			System.out.println("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			
			System.out.println("Digite o E-mail: ");
			String email = sc.nextLine();
			
			System.out.println("Digite o quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			
			
			vect[quarto] = new Quartos(nome, email);
			
		}
		
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
		
		
		
		
		
		sc.close();
	}

}
