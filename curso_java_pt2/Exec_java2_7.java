package curso_java_pt2;

import java.util.Scanner;

public class Exec_java2_7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int  X ,Y;
		String result;
		
		System.out.println("Digite as coordenadas X e Y:");
		X = scanner.nextInt();
		Y = scanner.nextInt();
		
		if (X == 0 && Y > 0) {
			result = "Origem";
		}
		else if(X > 0 && Y > 0 ) {
			result = "Q1";
		}
		else if(X > 0 && Y < 0) {
			result = "Q4";
		}
		else if(Y > 0 && X < 0){
			result = "Q2";
		}
		else {
			result = "Q3";
		}
		
		System.out.println("Pertence ao "+ result);
		scanner.close();
	}

}
