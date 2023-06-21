package Aplicacao;

import java.util.Scanner;
import Entidades.Conta;

public class Main {

	public static void main(String[] args) {
	
		Conta cliente;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Digite sua Conta: ");
		int conta = sc.nextInt();
		System.out.println();
		System.out.print("Digite seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("    Você vai abir com saldo:   ");
		System.out.println("Digite S para abrir com sadaldo e N para não");
		char situacao = sc.next().charAt(0);
		
			if(situacao == 'S') {
				System.out.print("Quanto você quer depositar: ");
				int deposito = sc.nextInt();
				
				cliente = new Conta(nome, conta, deposito);
				
				System.out.println("Conta criada com saldo");
			}
			else{
				cliente = new Conta(nome, conta);
				System.out.println("Conta criada sem saldo");
			}
			System.out.print("Informações da conta criada: ");
			System.out.println(cliente);
		
			
			System.out.println();
			System.out.print("Depositar: ");
			double depositar = sc.nextDouble();
			cliente.depositar(depositar);
			
			System.out.println();
			System.out.print("Conta atualizada: ");
			System.out.println(cliente);
			
			System.out.println();
			System.out.print("Quanto deseja sacar: ");
			double sacar = sc.nextDouble();
			cliente.sacar(sacar);
			
			System.out.print("Conta atualizada: ");
			System.out.println(cliente);
	
	
	
	
	
	
	
		sc.close();
	}
}
