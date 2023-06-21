package curso_java_pt2;

import java.util.Scanner;

public class curso_java_pt2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A,B;
		
		System.out.println("Digite dois números: ");
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		scanner.close();
		
		
		
		
		

	}

}
