package br.com.residencia.trabalhopoo.operacoes;

import br.com.residencia.trabalhopoo.logins.DadosBase;
import br.com.residencia.trabalhopoo.logins.Menus;
import br.com.residencia.trabalhopoo.mensagens.*;
import java.util.Scanner;

public class OperacaoBancaria {

	Mensagem msg = new Mensagem();
	static Scanner scan = new Scanner(System.in);

	public static boolean consultarSaldoDisp(Double saldoContaOrigem, Double valorOperacao) {
		// Se há saldo, retorna positivo, senão,negativo.
		if (	saldoContaOrigem < (valorOperacao + TaxaBancaria.taxaSaque) || 
				saldoContaOrigem < (valorOperacao + TaxaBancaria.taxaDeposito) || 
				saldoContaOrigem < (valorOperacao + TaxaBancaria.taxaTransferencia))
			return false;
		else
			return true;
	}

	public static void sacar(Double saldoContaOrigem) {
		// Saca o valor da conta (diminui o valor da conta corrente)
		Mensagem msg = new Mensagem();
		System.out.println(msg.qualVlSacar);
		Double valorSaque = scan.nextDouble();
		if (!consultarSaldoDisp(saldoContaOrigem, valorSaque)) {
			System.out.println(msg.saqueInsucesso);
			Menus.retornarMenuCliente();
		} else {
			saldoContaOrigem -= (valorSaque + TaxaBancaria.taxaSaque);
			DadosBase.saldoUso = saldoContaOrigem;
			TaxaBancaria.totalTaxaSaque += TaxaBancaria.taxaSaque;
			System.out.println(msg.saqueSucesso);
			System.out.println(msg.seuSaldo + saldoContaOrigem);
			Menus.retornarMenuCliente();
		}
	}

	public static void depositar(Double saldoContaOrigem) { 
		//Deposita o valor na corrente
		Mensagem msg = new Mensagem();
		
		//Mensagem para informar  o valor
		System.out.println(msg.qualVlDepositar);
		Double valorDeposito = scan.nextDouble();
		
		// Cálculos
		saldoContaOrigem += valorDeposito - TaxaBancaria.taxaDeposito;
		TaxaBancaria.totalTaxaDeposito += TaxaBancaria.taxaDeposito;
		
		//Mensagem após operação efetuada
		System.out.println(msg.depositoSucesso);
		System.out.println(msg.seuSaldo + saldoContaOrigem); // Definir variavel saldoClinte??
		Menus.retornarMenuCliente();
	}

	public static void transferirMesmoBanco(Double saldoContaOrigem) {
		// Diminui o valor de uma conta pra depois aumentar o valor em outra
		Mensagem msg = new Mensagem();
		
		//Mensagem para informar  o valor
		System.out.println(msg.qualVlTransferir);
		Double valorTransferencia = scan.nextDouble();
		
		//Confirma se há saldo para efetuar a operação
		if (!consultarSaldoDisp(saldoContaOrigem, valorTransferencia)) {
			System.out.println(msg.transfInsucesso);
			Menus.retornarMenuCliente();
		} else {
			//Cálculos
			Double saldoContaDestino = 0.00; //Alterar para filtrar saldoContDestino!!!
			saldoContaOrigem -= valorTransferencia - TaxaBancaria.taxaTransferencia;
			TaxaBancaria.totalTaxaTransferencia += TaxaBancaria.taxaTransferencia;
			saldoContaDestino += valorTransferencia; //Definir getters e setters depois
			
			//Mensagem que informa que foi efetuado com sucesso
			System.out.println(msg.transfSucesso);
			Menus.retornarMenuCliente();
			}
	}

	public static void transferirOutroBanco(Double saldoContaOrigem) {
		// Verificar se iremos implementar, depende de puxar outro banco
		Mensagem msg = new Mensagem();
		System.out.println(msg.qualBancoTransferir);	// Gambiarra
		String qualBanco = scan.next(); 				// Gambiarra
		System.out.println(msg.qualAgenciaTransferir); 	// Gambiarra
		String qualAgencia = scan.next(); 				// Gambiarra
		System.out.println(msg.qualContaTransferir); 	// Gambiarra
		String qualConta = scan.next(); 				// Gambiarra
		System.out.println(msg.qualVlTransferir);
		Double valorTransferencia = scan.nextDouble();
		if (!consultarSaldoDisp(saldoContaOrigem, valorTransferencia)) {
			System.out.println(msg.transfInsucesso);
			Menus.retornarMenuCliente();
		} else {
			saldoContaOrigem -= (valorTransferencia - TaxaBancaria.taxaTransferencia);
			TaxaBancaria.totalTaxaTransferencia += TaxaBancaria.taxaTransferencia;
			System.out.println(msg.transfSucesso);
			Menus.retornarMenuCliente();			
		}
	}
	
}