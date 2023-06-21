package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Exec_proposto4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double horasTrabalhadas, valorH, valorSalario;
		int numEmpregado;
		
	
		System.out.println("Digite o seu número de funcionário: ");
		numEmpregado = scanner.nextInt();
		System.out.println("Digite o suas horas trabalhadas: ");
		horasTrabalhadas = scanner.nextDouble();
		System.out.println("Digite o valor da sua hora: ");
		valorH = scanner.nextDouble();
		
		valorSalario = valorH * horasTrabalhadas;

		System.out.println("Número do empregado: " + numEmpregado);
		System.out.printf("Salario:  %.2f%n", valorSalario);
		
		scanner.close();
	}

}
