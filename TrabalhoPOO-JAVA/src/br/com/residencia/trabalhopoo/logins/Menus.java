package br.com.residencia.trabalhopoo.logins;

import java.util.Scanner;

import br.com.residencia.trabalhopoo.mensagens.Mensagem;
import br.com.residencia.trabalhopoo.operacoes.*;
import br.com.residencia.trabalhopoo.relatorios.Relatorio;

public class Menus {
	static Scanner scan = new Scanner(System.in);
	static String opcaoMenu;
	
	public static void menuCliente() {
		Mensagem msg = new Mensagem();
		msg.limparTela();

		System.out.println(	"""
							    ######-Menu de Cliente -##### 
							+-----------------------------------+
							| 1. Saque                          | 
							| 2. Dep�sito                       |
							| 3. Transfer�ncia para outra conta | 
							| 4. Relat�rios                     | 
							| 5. Sair do sistema                | 
							+-----------------------------------+
							""");
		System.out.print("Digite uma op��o: ");
		opcaoMenu = scan.next();

		switch (opcaoMenu) {
		// Opera��es banc�rias
		case "1":
			OperacaoBancaria.sacar(DadosBase.saldoUso); 
			break;

		case "2":
			OperacaoBancaria.depositar(DadosBase.saldoUso);
			break;

		case "3":
			OperacaoBancaria.transferirMesmoBanco(DadosBase.saldoUso);
			break;
		//Relat�rios
		case "4":
			relatoriosCliente(); // Relat�rios de cliente
			break;

		case "5":
			System.out.println("Sair do sistema"); //Encerra o programa
			break;

		default:
			System.out.println("\nOp��o inv�lida! Tente novamente."); // Retorna ao mesmo menu
			menuCliente();
		break;
		}
	}
	
	public static void menuFuncionario() {
		Mensagem msg = new Mensagem();
		msg.limparTela();

		System.out.println(	"""
							 #####-Menu de Funcion�rio-####
							+-----------------------------+
							| 1. Relat�rios de Funcion�rio|
							| 2. Menu Cliente             |
							| 3. Sair do Sistema          |
							+-----------------------------+
							"""	);
		
	System.out.println("Selecione o tipo de acesso: ");
	opcaoMenu = scan.next();
				
		switch (opcaoMenu){

		case "1":
			System.out.println("\nRelat�rios de funcion�rio"); 
			
			if (DadosBase.tipoPessoaEmUso.equalsIgnoreCase("Gerente")) {
				relatoriosGerente();
			} else if (DadosBase.tipoPessoaEmUso.equalsIgnoreCase("Diretor")) {
				relatoriosDiretor();
			} else if (DadosBase.tipoPessoaEmUso.equalsIgnoreCase("Presidente")) {
				relatoriosPresidente();
			}
			break;

		case "2":
			System.out.println("\nOp��o Menu Cliente selecionada");
			menuCliente();
			break;
				
		case "3":
			System.out.println("\n Volte Sempre!");
			break;
		
		default:
			System.out.println("\nOp��o incorreta! Tente Novamente.");
			menuFuncionario();
			break;
			}
		}	
	
	public static void relatoriosCliente() {
		Mensagem msg = new Mensagem();
		msg.limparTela();

		System.out.println(	
			"""
			      ####-Relat�rios do cliente-####
			+--------------------------------------------+
			|1. Saldo Dispon�vel                         |
			|2. Relat�rio de tributa��o da Conta Corrente|
			|3. Simular Rendimento de Poupan�a           |
			|4. Consultar Extrato                        |
			|5. Relat�rio de taxas cobradas              |
			|6. Retornar ao menu inicial                 |
			+--------------------------------------------+
			"""
				);
		System.out.print("Digite uma op��o: ");
		opcaoMenu = scan.next();
				
		switch (opcaoMenu) {
			case "1":
				Relatorio.saldoDispon�vel(); // Mostra o saldo da conta
			break;
					
			case "2":
				Relatorio.relatorioTotalTaxas(); //Apresenta o total de taxas
			break;
					
			case "3":
				Relatorio.SimulacaoRendimentos(); //Simulador de Poupan�a
			break;

			case "4":
				System.out.println("Relat�rio do Extrato"); //Deus do c�u
			break;
			
			case "5":
				Relatorio.relatorioInformacoesDasTaxas();
			break;
			
			case "6":
				LoginInicial.enviarMenuclienteOuFuncionario();
			break;
			
			default:
				System.out.println(msg.loginOpcaoInvalida);
				relatoriosCliente();
			break;
		}
	}
	
	public static void relatoriosGerente() {
		Mensagem msg = new Mensagem();
		msg.limparTela();

		System.out.println(	
				"""
			       ######-Relat�rios de Gerente-#####
			+----------------------------------------------+
			| 1. Relat�rio de contas gerenciadas na ag�ncia|
			| 2. Voltar ao menu inicial                    |
			+----------------------------------------------+
			"""
				);
		opcaoMenu = scan.next();
				
			switch (opcaoMenu) {
				case "1": // Mostra o �nico relat�rio do gerente
				System.out.println("Op��o Relat�rio de contas gerenciadas na ag�ncia selecionada ");
				//RelatoriosGerente();
				break;
				
				case "2": //Retorna ao menu do Gerente
				System.out.println("Op��o voltar ao menu inicial selecionada");
				menuFuncionario();
				break;
				
				default:
				System.out.println("\nOp��o incorreta");
				break;
		}
	}

	public static void relatoriosDiretor() {
		Mensagem msg = new Mensagem();
		msg.limparTela();

		System.out.println(	
				"""
	                ######-Relat�rios de Diretor-#####
	+----------------------------------------------------------------+
	| 1. Relat�rio de contas gerenciadas na ag�ncia                  |
	| 2. Relat�rio com as informa��es de Nome, CPF, ag�ncia de todos |
	|    os clientes do sistema em ordem alfab�tica.                 |
	| 3. Voltar ao menu inicial                                      |
	+----------------------------------------------------------------+
	"""	);
	   System.out.println("Digite uma op��o: \n");
	   opcaoMenu = scan.next();
		
				switch (opcaoMenu) {
		 
					case "1":
					System.out.println("Op��o Relat�rio de contas gerenciadas na ag�ncia selecionada ");
					break;
					
					case "2":
					System.out.println("Op��o Relat�rio com as informa��es de Nome, CPF, Ag�ncia de todos os clientes do sistema em ordem alfab�tica selecionada ");
					break;
					
					case "3":
					System.out.println("Op��o voltar ao menu inicial selecionada");
					menuFuncionario();
					break;
					
					default:
					System.out.println("Op��o Incorreta! Tente novamente.");
					relatoriosDiretor();
					break;
			}
		}
	
	public static void relatoriosPresidente() {
		Mensagem msg = new Mensagem();
		msg.limparTela();

			System.out.println(	
					"""
			           ######-- Relat�rios de Presidente --#####
			+--------------------------------------------------------------+
			| 1. Relat�rio de contas gerenciadas na ag�ncia                |
			| 2. Relat�rio com as informa��es de Nome, CPF, Ag�ncia de     |
			|    todos os clientes do sistema em ordem alfab�tica.         |
			| 3. Relat�rio com o valor total do capital armazenado no banco|
			| 4. Voltar ao menu inicial                                    |
			+--------------------------------------------------------------+
			"""
					);
			System.out.print("Digite uma op��o: \n");
			
			opcaoMenu = scan.next();
			
					switch (opcaoMenu) {
			 
						case "1":
						System.out.println("Op��o Relat�rio de contas gerenciadas na ag�ncia selecionada ");
						break;
						
						case "2":
						System.out.println("Op��o Relat�rio com as informa��es de Nome, CPF, Ag�ncia de todos os clientes do sistema em ordem alfab�tica selecionada ");
						break;
					
						case "3":
						System.out.println("Relat�rio com o valor total do capital armazenado no banco ");
						break;
						
						case "4":
						System.out.println("Op��o voltar ao menu inicial selecionada");
						menuFuncionario();
						break;
						
						default:
						System.out.println("Op��o incorreta! Tente novamente");
						relatoriosPresidente();
						break;
			}
		}
	
	public static void retornarMenuFuncionario () {
		Mensagem msg = new Mensagem();
		System.out.println(msg.algumaTecla);
		String qualquerCoisaDigitada = scan.next();
		Menus.menuFuncionario();
	}

	public static void retornarMenuCliente () {
		Mensagem msg = new Mensagem();
		System.out.println(msg.algumaTecla);
		String qualquerCoisaDigitada = scan.next();
		Menus.menuCliente();
	}
}
