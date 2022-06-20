package br.com.residencia.trabalhopoo.relatorios;

import br.com.residencia.trabalhopoo.mensagens.Mensagem;
import br.com.residencia.trabalhopoo.operacoes.*;
import br.com.residencia.trabalhopoo.pessoas.Cliente;
import br.com.residencia.trabalhopoo.pessoas.Pessoa;

import java.util.Map;
import java.util.Scanner;

import br.com.residencia.trabalhopoo.contas.Conta;
import br.com.residencia.trabalhopoo.logins.*;

public class Relatorio {
	static Scanner scan = new Scanner(System.in);
	public static Double totalCapitalArmazenadoBanco = 0.00;
	Cliente cliente = new Cliente();
	DadosBase base = new DadosBase();

	public static void relatorioInformacoesDasTaxas() {
		System.out.println("-----------------------------");
		System.out.println("****INFORMAÇÕES DAS TAXAS****");
		System.out.println("-----------------------------");
		System.out.println(Mensagem.infoTaxaDeposito + TaxaBancaria.getTaxaDeposito());
		System.out.println(Mensagem.infoTaxaSaque + TaxaBancaria.getTaxaSaque());
		System.out.println(Mensagem.infoTaxaTransferencia + TaxaBancaria.getTaxaTransferencia());
		Menus.retornarMenuCliente();
	}

	public static void relatorioTotalTaxas() {
		System.out.println("--------------------------");
		System.out.println("******TOTAL DE TAXAS******");
		System.out.println("--------------------------");
		System.out.println(Mensagem.totalTaxasDeposito + TaxaBancaria.getTotalTaxaDeposito());
		System.out.println(Mensagem.totalTaxasSaque + TaxaBancaria.getTotalTaxaSaque());
		System.out.println(Mensagem.totalTaxasTransferencia + TaxaBancaria.getTotalTaxaTransferencia());
		Menus.retornarMenuCliente();
	}

	public static void dadosCliente() {
		System.out.println("------------------------");
		System.out.println("******DADOS CLIENTE*****");
		System.out.println("------------------------");
		System.out.println("Nome Cliente: " + DadosBase.nomeEmUso);
		System.out.println("CPF: " + DadosBase.cpfEmUso);
		System.out.println("Senha: " + DadosBase.cpfEmUso);
		System.out.println("Agencia: " + DadosBase.agenciaUso);
		System.out.println("Saldo:" + DadosBase.saldoUso);
		Menus.retornarMenuCliente();
	}

	public static void SimulacaoRendimentos() {
		//Variáveis para cálculo
		Double valorSimulacao;
		String periodoSimulacao;
		Integer periodoTempo;
		
		//Título
		System.out.println(	"-------------------------------------\n" + 
							"   **Simulação de Rendimentos**		 \n"+ 
							"-------------------------------------\n");

		//Valor e período (Dia, Mês e Ano)
		System.out.println("Qual valor gostaria de simular?\n");
		valorSimulacao = scan.nextDouble();

		System.out.println("Qual período de simulação?\n" + "[1] Dia\n" + "[2] Mês\n" + "[3] Ano");
		periodoSimulacao = scan.next();
		
		//De acordo com o que foi solicitado, irá fazer um cálculo diferente
		switch (periodoSimulacao) {

		case "1":
			System.out.println("Quantos dias gostaria de simular?");
			periodoTempo = scan.nextInt();
			//Cálculo
			TaxaBancaria.aplicarRendimentoPoupancaDias(valorSimulacao, periodoTempo);
			//Mensagem e retorno ao menu
			System.out.println("O valor total após o período de " + periodoTempo + " dias é de " + TaxaBancaria.valorSimuladoPoupanca);
			Menus.retornarMenuCliente();
			break;

		case "2":
			System.out.println("Quantos meses gostaria de simular?");
			periodoTempo = scan.nextInt();
			//Cálculo
			TaxaBancaria.aplicarRendimentoPoupancaMeses(valorSimulacao, periodoTempo);
			//Mensagem e retorno ao menu
			System.out.println("O valor total após o período de " + periodoTempo + " meses é de " + TaxaBancaria.valorSimuladoPoupanca);
			Menus.retornarMenuCliente();
			break;

		case "3":
			System.out.println("Quantos anos gostaria de simular?");
			periodoTempo = scan.nextInt();
			//Cálculo
			TaxaBancaria.aplicarRendimentoPoupancaAno(valorSimulacao, periodoTempo);
			//Mensagem e retorno ao menu
			System.out.println("O valor total após o período de " + periodoSimulacao + " anos é de " + TaxaBancaria.valorSimuladoPoupanca);
			Menus.retornarMenuCliente();
			break;

		default:
			System.out.println("Opção Incorreta! Tente Novamente.");
			SimulacaoRendimentos();
			break;
		}
	}

	public static void saldoDisponível() {
		System.out.println("---------------------------");
		System.out.println("******Saldo Disponível*****");
		System.out.println("---------------------------");
		System.out.println("Saldo:" + DadosBase.saldoUso);
		Menus.retornarMenuCliente();
	}
}
