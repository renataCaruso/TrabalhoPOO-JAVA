package br.com.menu_teste;

import java.util.Scanner;

public class TestePresidente {

		public static void MenuAcessoPresidente() {
			
			Scanner scan = new Scanner (System.in);
			
			//Vari�veis
			int opcaoMenuAcesso;

			//Op��o de acesso para o gerente como funcion�rio. (5 op��es de acesso)

			System.out.println("####Op��es de acesso: ####");
			System.out.println("---------------------------");
			System.out.println("| 1. Menu Presidente      |");
			System.out.println("| 2. Menu Diretor         |");
			System.out.println("| 3. Menu Gerente         |");
			System.out.println("| 4. Menu Cliente         |");
			System.out.println("| 5. Sair                 |");
			System.out.println("---------------------------");
			System.out.println("Selecione o tipo de acesso: ");
		
			opcaoMenuAcesso = scan.nextInt();
			scan.close();
			
				switch (opcaoMenuAcesso){
				
					case 1:
					System.out.println("Op��o Menu Presidente selecionada");
					break;

					case 2:
					System.out.println("Op��o Menu Diretor selecionada");
					TesteDiretor.MenuDiretor();
					break;

					case 3:
					System.out.println ("Op��o Menu Gerente selecionada");
					TesteGerente.MenuGerente();
					break;

					case 4:
					System.out.println("Op��o Menu Cliente selecionada");
					TesteCliente.MenuCliente();
					break;
					
					case 5:
					System.out.println("Volte Sempre!");
					break;
					
					default:
					System.out.println("Op��o incorreta! Tente Novamente!");
					break;
			}
		}	
		
	}