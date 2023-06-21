package exec_01;

import Entidades.Retangulo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retan1 = new Retangulo();
		
		System.out.println("Digite a largura e a altura do retangulo: ");
		retan1.altura = sc.nextDouble();
		retan1.largura = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", retan1.area());
		System.out.printf("Perimetro: %.2f%n", retan1.perimetro());
		System.out.printf("Diagonal: %.2f%n", retan1.diagonal());
		
		sc.close();
	}

}
