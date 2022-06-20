package br.com.residencia.trabalhopoo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Escrita {
	// Converte de data para txt
	static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	static Date date = new Date();

	// Vari�veis para o t�tulo do Extrato
	static String contaExtrato = "112233";
	static String agenciaExtrato = "7890";
	static String nomeCliente = "JosephClimber";

	// Vari�veis para o extrato
	static String operacaoData = simpleDateFormat.format(date);
	static String operacaoTipo = "DEPOSITO"; // A definir na fun��o da opera��o
	static String operacaoSaldoAnterior = "R$ " + "199.80"; // A definir na fun��o da opera��o
	static String operacaoValor = "R$ " + "200.00"; // A definir na fun��o da opera��o
	static String operacaoTaxa = "R$ " + "0.00"; // A definir na fun��o da opera��o
	static String operacaoSaldoAtual = "R$ " + "399.80"; // A definir na fun��o da opera��o

	// Vari�veis de caminho padr�o e extens�o
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	static final String PATH_COMPLETO = PATH_BASICO + "Extrato" + agenciaExtrato + "-" + contaExtrato + EXTENSAO;
	static String linhaEscrita = operacaoData + "\t\t" + operacaoTipo + "\t\t" + operacaoSaldoAnterior + "\t" + operacaoValor + "\t" + operacaoTaxa + "\t\t" + operacaoSaldoAtual;

	public static void escritorTituloExtrato(String agencia, String conta, String nome) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_COMPLETO));

		try {
			buffWrite.append("Conta: " + agencia + " " + conta + "\t Nome: " + nome + "\n"
					+ "Data da opera��o \t\tTipo de opera��o \tSaldo Anterior \tValor \t\tTributo \tSaldo Atual\n");
			buffWrite.flush();
		} catch (FileNotFoundException ex) {
			System.out.println("N�o foi poss�vel criar o arquivo");
		} finally {
			buffWrite.close();
		}
	}

	public static void registrarExtrato() throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_COMPLETO));

		// Vari�veis para o BuffRead
		String linhaLida = "";
		String leituraTotal = "";

		// Vari�vel que escreve a nova linha

		try {
			// Ir� puxar as informa��es existentes no TXT.
			// Se n�o houver TXT, a fun��o escritorTituloExtrato ir� rodar.
			while (true) {
				linhaLida = buffRead.readLine();
				if (linhaLida != null) {
					leituraTotal += linhaLida + "\n";
				} else {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			escritorTituloExtrato(contaExtrato, agenciaExtrato, nomeCliente); // Cria o arquivo e joga um t�tulo
		} finally {
			buffRead.close();
		}

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_COMPLETO));
		try {
			buffWrite.append(leituraTotal + linhaEscrita + "\n");
			buffWrite.flush();
		} catch (FileNotFoundException ex) {
			escritorTituloExtrato(contaExtrato, agenciaExtrato, nomeCliente);
		} finally {
			buffWrite.close();
		}
	}
}