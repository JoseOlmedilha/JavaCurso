import java.util.Scanner;

public class Exec1 {

	public static void imprimir() {
		System.out.println("Digite o numéro: ");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números voce vai digitar: ");
		int n = sc.nextInt();

		double numeros[] = new double[n];

		for (int i = 0; i < n; i++) {
			imprimir();
			numeros[i] = sc.nextDouble();

		}

		System.out.println("Os números negativos são: ");
		for (int i = 0; i < n; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			} else {
				continue;
			}
		}

		sc.close();

	}

}
