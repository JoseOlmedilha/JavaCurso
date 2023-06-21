package curso_java;

import java.util.Scanner;

public class Exec_proposto1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		int A,B;
		int resul;
		
		System.out.println("Digite um número: ");
		A = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		B = scanner.nextInt();
		
		resul = A + B;
		
		System.out.printf("A soma de %d + %d é:  %d%n",A ,B, resul);
		
		scanner.close();
		
	}

}
