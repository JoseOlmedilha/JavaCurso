package aplication;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a dimensões da matriz:  ");
		int l = sc.nextInt();
		int c = sc .nextInt();
		
		int[][] matriz = new int[l][c]; 
		
		System.out.println("Digite os número: ");
		
			for (int i = 0; i < matriz.length; i++) {
				System.out.printf("%d° Linha : \n", i+1);
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j] = sc.nextInt();
					
				}
			}
			
			System.out.println();
			System.out.println("Qual número vc quer saber: ");
			int descobrir = sc.nextInt();
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if(matriz[i][j] == descobrir) {
						System.out.printf("Posição: %d , %d \n", i , j );
						
						if(j > 0 ) {
							System.out.printf("Número a esquerda: %d \n ", matriz[i][j - 1]);
			
						}
						if(i > 0) {
							System.out.printf("Númrero a cima: %d \n", matriz[i - 1][j]);
	
						}	
						if(j < matriz[i].length -1) {
						System.out.printf("Número a direita: %d \n", matriz[i][j + 1]);
						
						}
						if(i < matriz.length -1){
						System.out.printf("Número em baixo: %d \n", matriz[i + 1 ][j]);
						
						}
						System.out.println();
					}
				}	
			}
		
		sc.close();
	}
}