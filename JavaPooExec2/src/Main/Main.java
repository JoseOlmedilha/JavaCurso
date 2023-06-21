package Main;

import java.util.Scanner;
import Entidades.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Funcionario Func1 = new Funcionario();
		
		System.out.println("Digite o nome do funcionário: ");
		Func1.nome = sc.nextLine();
		System.out.println("Digite o Salário do funcionário: ");
		Func1.salario = sc.nextDouble();
		System.out.println("Digite o imposto sobre o funcionário: ");
		Func1.imposto = sc.nextDouble();
		
		System.out.println(" ");
		System.out.println("Funcionario "+ Func1);
		System.out.println("");
		System.out.println("Qual a porcentagem para aumentar no salario: ");
		double porcentagem = sc.nextDouble();
		Func1.aumento(porcentagem);
		
		System.out.println(" ");
		System.out.println("Novo salario: "+ Func1);
		System.out.println("");
		
		
		
		sc.close();
	}

}
