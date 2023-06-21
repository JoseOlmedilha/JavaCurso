package curso_java_pt2;

import java.util.Scanner;

public class Exec_java2_8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double salario, imposto;

		System.out.println("Digite seu Sálario: ");
		salario = scanner.nextDouble();
		
		if (salario <= 2000.0) {
			imposto = 0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0)* 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0)* 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1.500 * 0.18 + 1.000 * 0.08;
		}
		if (imposto == 0) {
			System.out.println("Você não tem imposto para pagar");
		}
		else {
			System.out.println("Seu imposto é R$" + imposto);
		}
	
		scanner.close();
	}
}


