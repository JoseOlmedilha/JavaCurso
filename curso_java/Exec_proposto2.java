package curso_java;

import java.util.Scanner;

public class Exec_proposto2 {

	public static void main(String[] args) {
		
		double raio, resultado, pi = 3.14159;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		raio = scanner.nextDouble();
		
		resultado =  pi * (Math.pow(raio, 2));
		
		
		System.out.printf("O resultado é %.4f", resultado);
		
		
		
		scanner.close();

	}

}
