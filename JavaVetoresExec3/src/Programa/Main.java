package Programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter seu vetor: ");
		int n = sc.nextInt();
		
		
		
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		
		
		System.out.println("Digite o valor do vetor A: ");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println("Digite o valor do vetor B: ");
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		
		System.out.println("Vetor resultante: ");
		for (int i = 0; i < n; i++) {
			C[i] = A[i] + B[i];
			System.out.println(C[i]);
		}
		
	
		
		sc.close();
		
	}

}
