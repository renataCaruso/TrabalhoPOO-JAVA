package br.com.menu_teste;

import java.util.Scanner;

public class Testes {
	
	public static void MenuCliente() {
		
		Scanner scan = new Scanner (System.in);
		
		int opcao;
		
		System.out.println("######-- Menu de Cliente --#####\n");
		System.out.println("-------------------------------------");
		System.out.println("| 1. Saque                          |");
		System.out.println("| 2. Depósito                       |");
		System.out.println("| 3. Transferência para outra conta |");
		System.out.println("| 4. Saldo                          |");
		System.out.println("| 5. Relatórios                     |");
		System.out.println("| 6. Sair do menu / sistema         |");
		System.out.println("-------------------------------------");
		System.out.print("Digite uma opção: ");
		
		opcao = scan.nextInt();
	

		
	}

}
