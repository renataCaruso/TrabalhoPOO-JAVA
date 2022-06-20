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
							| 2. Depósito                       |
							| 3. Transferência para outra conta | 
							| 4. Relatórios                     | 
							| 5. Sair do sistema                | 
							+-----------------------------------+
							""");
		System.out.print("Digite uma opção: ");
		opcaoMenu = scan.next();

		switch (opcaoMenu) {
		// Operações bancárias
		case "1":
			OperacaoBancaria.sacar(DadosBase.saldoUso); 
			break;

		case "2":
			OperacaoBancaria.depositar(DadosBase.saldoUso);
			break;

		case "3":
			OperacaoBancaria.transferirMesmoBanco(DadosBase.saldoUso);
			break;
		//Relatórios
		case "4":
			relatoriosCliente(); // Relatórios de cliente
			break;

		case "5":
			System.out.println("Sair do sistema"); //Encerra o programa
			break;

		default:
			System.out.println("\nOpção inválida! Tente novamente."); // Retorna ao mesmo menu
			menuCliente();
		break;
		}
	}
	
	public static void menuFuncionario() {
		Mensagem msg = new Mensagem();
		msg.limparTela();

		System.out.println(	"""
							 #####-Menu de Funcionário-####
							+-----------------------------+
							| 1. Relatórios de Funcionário|
							| 2. Menu Cliente             |
							| 3. Sair do Sistema          |
							+-----------------------------+
							"""	);
		
	System.out.println("Selecione o tipo de acesso: ");
	opcaoMenu = scan.next();
				
		switch (opcaoMenu){

		case "1":
			System.out.println("\nRelatórios de funcionário"); 
			
			if (DadosBase.tipoPessoaEmUso.equalsIgnoreCase("Gerente")) {
				relatoriosGerente();
			} else if (DadosBase.tipoPessoaEmUso.equalsIgnoreCase("Diretor")) {
				relatoriosDiretor();
			} else if (DadosBase.tipoPessoaEmUso.equalsIgnoreCase("Presidente")) {
				relatoriosPresidente();
			}
			break;

		case "2":
			System.out.println("\nOpção Menu Cliente selecionada");
			menuCliente();
			break;
				
		case "3":
			System.out.println("\n Volte Sempre!");
			break;
		
		default:
			System.out.println("\nOpção incorreta! Tente Novamente.");
			menuFuncionario();
			break;
			}
		}	
	
	public static void relatoriosCliente() {
		Mensagem msg = new Mensagem();
		msg.limparTela();

		System.out.println(	
			"""
			      ####-Relatórios do cliente-####
			+--------------------------------------------+
			|1. Saldo Disponível                         |
			|2. Relatório de tributação da Conta Corrente|
			|3. Simular Rendimento de Poupança           |
			|4. Consultar Extrato                        |
			|5. Relatório de taxas cobradas              |
			|6. Retornar ao menu inicial                 |
			+--------------------------------------------+
			"""
				);
		System.out.print("Digite uma opção: ");
		opcaoMenu = scan.next();
				
		switch (opcaoMenu) {
			case "1":
				Relatorio.saldoDisponível(); // Mostra o saldo da conta
			break;
					
			case "2":
				Relatorio.relatorioTotalTaxas(); //Apresenta o total de taxas
			break;
					
			case "3":
				Relatorio.SimulacaoRendimentos(); //Simulador de Poupança
			break;

			case "4":
				System.out.println("Relatório do Extrato"); //Deus do céu
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
			       ######-Relatórios de Gerente-#####
			+----------------------------------------------+
			| 1. Relatório de contas gerenciadas na agência|
			| 2. Voltar ao menu inicial                    |
			+----------------------------------------------+
			"""
				);
		opcaoMenu = scan.next();
				
			switch (opcaoMenu) {
				case "1": // Mostra o único relatório do gerente
				System.out.println("Opção Relatório de contas gerenciadas na agência selecionada ");
				//RelatoriosGerente();
				break;
				
				case "2": //Retorna ao menu do Gerente
				System.out.println("Opção voltar ao menu inicial selecionada");
				menuFuncionario();
				break;
				
				default:
				System.out.println("\nOpção incorreta");
				break;
		}
	}

	public static void relatoriosDiretor() {
		Mensagem msg = new Mensagem();
		msg.limparTela();

		System.out.println(	
				"""
	                ######-Relatórios de Diretor-#####
	+----------------------------------------------------------------+
	| 1. Relatório de contas gerenciadas na agência                  |
	| 2. Relatório com as informações de Nome, CPF, agência de todos |
	|    os clientes do sistema em ordem alfabética.                 |
	| 3. Voltar ao menu inicial                                      |
	+----------------------------------------------------------------+
	"""	);
	   System.out.println("Digite uma opção: \n");
	   opcaoMenu = scan.next();
		
				switch (opcaoMenu) {
		 
					case "1":
					System.out.println("Opção Relatório de contas gerenciadas na agência selecionada ");
					break;
					
					case "2":
					System.out.println("Opção Relatório com as informações de Nome, CPF, Agência de todos os clientes do sistema em ordem alfabética selecionada ");
					break;
					
					case "3":
					System.out.println("Opção voltar ao menu inicial selecionada");
					menuFuncionario();
					break;
					
					default:
					System.out.println("Opção Incorreta! Tente novamente.");
					relatoriosDiretor();
					break;
			}
		}
	
	public static void relatoriosPresidente() {
		Mensagem msg = new Mensagem();
		msg.limparTela();

			System.out.println(	
					"""
			           ######-- Relatórios de Presidente --#####
			+--------------------------------------------------------------+
			| 1. Relatório de contas gerenciadas na agência                |
			| 2. Relatório com as informações de Nome, CPF, Agência de     |
			|    todos os clientes do sistema em ordem alfabética.         |
			| 3. Relatório com o valor total do capital armazenado no banco|
			| 4. Voltar ao menu inicial                                    |
			+--------------------------------------------------------------+
			"""
					);
			System.out.print("Digite uma opção: \n");
			
			opcaoMenu = scan.next();
			
					switch (opcaoMenu) {
			 
						case "1":
						System.out.println("Opção Relatório de contas gerenciadas na agência selecionada ");
						break;
						
						case "2":
						System.out.println("Opção Relatório com as informações de Nome, CPF, Agência de todos os clientes do sistema em ordem alfabética selecionada ");
						break;
					
						case "3":
						System.out.println("Relatório com o valor total do capital armazenado no banco ");
						break;
						
						case "4":
						System.out.println("Opção voltar ao menu inicial selecionada");
						menuFuncionario();
						break;
						
						default:
						System.out.println("Opção incorreta! Tente novamente");
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
