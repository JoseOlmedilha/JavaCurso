package Aplicação;

import java.util.Scanner;

import Entidades.ConverterDolar;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do dolar");
		double valorDolar = sc.nextDouble();
		
		System.out.println("Digite a quantidade de dolar: ");
		double quanti = sc.nextDouble();
		
		double valorBruto = ConverterDolar.conversor(quanti, valorDolar);
		
		double valorPago = ConverterDolar.valorPago(valorBruto);
	
		System.out.println(String.format("%.2f", valorPago));
		
		sc.close();
	}

}
