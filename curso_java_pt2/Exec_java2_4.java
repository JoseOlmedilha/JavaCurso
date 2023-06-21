package curso_java_pt2;

import java.util.Scanner;

public class Exec_java2_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int senhadig = 0,senha = 1234;
		
		
		while(senhadig != senha) {
			System.out.println("Digite uma senha: ");
			senhadig = scanner.nextInt();
			if(senhadig == senha) {
				System.out.println("A senha é valida");
				break;
				}
			else {
				System.out.println("A senha é errada");
			}	
		}
		System.out.println("Parabens vc fez o login");
		scanner.close();
	}

}
