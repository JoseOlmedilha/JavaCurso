package Curso_Java_pt3;

import java.util.Scanner;

public class Exec_propostopt3_2 {

	public static void main(String[] args) {

		int num;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		for(int i = 1; i < num ; i++) {
			
			int dobro = i * i;
			int triplo = i *i *i;
			
			System.out.printf("%d %d %d%n",i,dobro,triplo);
			
		}
		scanner.close();
	}
}