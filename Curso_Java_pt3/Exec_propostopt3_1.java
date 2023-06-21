package Curso_Java_pt3;

import java.util.Scanner;

public class Exec_propostopt3_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número :");
		num = scanner.nextInt();
		
		for (int i = 1; i <= num; i+=2) {
			System.out.println(i);
			
		}
		
		scanner.close();
	}

}
