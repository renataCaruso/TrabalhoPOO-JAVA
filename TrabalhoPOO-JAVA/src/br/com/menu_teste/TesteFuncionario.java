package br.com.menu_teste;

//Falta importar o pacote dos relatórios

import java.util.Scanner;

public class TesteFuncionario {
	
	public static void MenuOpcoesFuncionario() {
		
		Scanner scan = new Scanner ( System.in);
		
		String opcaoMenuFuncionario;
		
		System.out.println("#####-Menu Funcionário-####");
		System.out.println("---------------------------");
		System.out.println("| 1. Menu Cliente         |");
		System.out.println("| 2. Relatórios           |");
		System.out.println("---------------------------");
		System.out.println("Selecione o tipo de acesso: ");
		
		opcaoMenuFuncionario = scan.next();
		
		switch (opcaoMenuFuncionario){
			
			case "1":
				System.out.println("Encaminhando para o menu de cliente");
				TesteCliente.MenuCliente();
				break;
				
			case "2":
				System.out.println("Opção Relatórios selecionada");
				//RelatoriosCliente();
				break;
				
			default:
				System.out.println("Opção inválida. Tente novamente.");
				MenuOpcoesFuncionario();
				break;
		}
	}
}