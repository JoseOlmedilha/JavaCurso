package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Exec_proposto5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codPeca1, codPeca2, qntdPeca1, qntdPeca2;
		double preco1, preco2, result;
		
		
		System.out.println("Digite o código da primeira peça: ");
		codPeca1 = scanner.nextInt();
		System.out.println("Quantidade de Peça: ");
		qntdPeca1 = scanner.nextInt();
		System.out.println("Valor da peça: ");
		preco1 = scanner.nextDouble();
		System.out.println("Digite o código da Segunda peça: ");
		codPeca2 = scanner.nextInt();
		System.out.println("Quantidade de peça: ");
		qntdPeca2 = scanner.nextInt();
		System.out.println("Valor da peça: ");
		preco2 = scanner.nextDouble();
		
		result = ((qntdPeca1 * preco1)+(qntdPeca2 * preco2));
		
		System.out.printf("Valor a pagar: %.2f%n ", result);
		
		scanner.close();
	}

}
