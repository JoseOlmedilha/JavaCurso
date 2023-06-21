package curso_java;

import java.util.Locale;

public class Exec_Aula01 {

	public static void main(String[] args) {
		
		String produto1 = "computador";
		String produto2 = "Mesa de escritório";
	
		int idade = 30;
		int codigo = 5290;
		char sexo = 'f';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos :");
		System.out.printf("O preço do %s é %.2f%n",produto1,preco1);
		System.out.printf("O preço da %s é %.2f%n",produto2,preco2);		
		System.out.println();
		System.out.printf("Informativo: %d anos de idade, seu codigo é %d e seu sexo é: %C%n", idade, codigo, sexo);
		System.out.println();
		System.out.printf("Medida com oito decimais %.8f%n", medida);
		System.out.printf("A medida arredondada com 3 decimais é %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("(Mercação Americana)%n A medida arredondada com 3 decimais é %.3f", medida);
	}

}
