package curso_java;

import java.util.Scanner;

public class Exec_proposto3 {

	public static void main(String[] args) {
		
		int A, B, C, D, result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 4 números inteiros: ");
		A = scanner.nextInt();	
		B = scanner.nextInt();	
		C = scanner.nextInt();	
		D =  scanner.nextInt();	
		
		result = (A*B)-(C*D);
		
		System.out.printf("Diferença: %d", result);
		
		scanner.close();
	}

}
