package br.com.residencia.trabalhopoo.operacoes;

import br.com.residencia.trabalhopoo.mensagens.*;

public class TaxaBancaria {
	Mensagem msg = new Mensagem();
	// TAXAS CONTA
	static Double taxaDeposito = 0.10;
	static Double taxaSaque = 0.10;
	static Double taxaTransferencia = 0.20;

	// CONTA POUPANÇA
	static Double taxaRendimentoPoupancaAno = 0.1075; // Seguiremos com o valor de rendimento da taxa selic por ano
	static Double taxaRendimentoPoupancaMes = taxaRendimentoPoupancaAno / 12;
	static Double taxaRendimentoPoupancaDia = taxaRendimentoPoupancaAno / 365;

	// VALORES PARA RELATÓRIOS (UTILIZAR SOMENTE EM RELATÓRIOS)
	static Double totalTaxaDeposito = 0.0;
	static Double totalTaxaSaque = 0.0;
	static Double totalTaxaTransferencia = 0.0;
	public static Double valorSimuladoPoupanca;

	// Operações simples
	public static void aplicarRendimentoPoupancaAno(Double valorAplicado, Integer periodoAnos) {
		for (Integer i = 1; i <= periodoAnos; i++) {
			valorAplicado += (valorAplicado * taxaRendimentoPoupancaAno);
			valorSimuladoPoupanca = valorAplicado;
		}
	}

	public static void aplicarRendimentoPoupancaMeses(Double valorAplicado, Integer periodoMeses) {
		for (Integer i = 1; i <= periodoMeses; i++) {
			valorAplicado += (valorAplicado * taxaRendimentoPoupancaMes);
			valorSimuladoPoupanca = valorAplicado;
		}
	}

	public static void aplicarRendimentoPoupancaDias(Double valorAplicado, Integer periodoDias) {
		for (Integer i = 1; i <= periodoDias; i++) {
			valorAplicado += (valorAplicado * taxaRendimentoPoupancaDia);
			valorSimuladoPoupanca = valorAplicado;
		}
	}

	public Mensagem getMsg() {	return msg;	}

	public static Double getTaxaDeposito() {	return taxaDeposito;	}

	public static Double getTaxaSaque() {	return taxaSaque;	}

	public static Double getTaxaTransferencia() { return taxaTransferencia;	}

	public static Double getTaxaRendimentoPoupancaAno() {	return taxaRendimentoPoupancaAno;	}

	public static Double getTaxaRendimentoPoupancaMes() {	return taxaRendimentoPoupancaMes;	}

	public static Double getTaxaRendimentoPoupancaDia() {	return taxaRendimentoPoupancaDia;	}

	public static Double getTotalTaxaDeposito() {	return totalTaxaDeposito;	}

	public static Double getTotalTaxaSaque() {	return totalTaxaSaque;	}

	public static Double getTotalTaxaTransferencia() {	return totalTaxaTransferencia;	}

	public static Double getValorSimuladoPoupanca() {	return valorSimuladoPoupanca;	}


}