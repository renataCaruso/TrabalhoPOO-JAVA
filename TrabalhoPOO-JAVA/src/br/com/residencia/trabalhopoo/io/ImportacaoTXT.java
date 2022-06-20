package br.com.residencia.trabalhopoo.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import br.com.residencia.trabalhopoo.contas.Conta;
import br.com.residencia.trabalhopoo.contas.ContaCorrente;
import br.com.residencia.trabalhopoo.contas.ContaPoupanca;
import br.com.residencia.trabalhopoo.pessoas.*;
import br.com.residencia.trabalhopoo.relatorios.Relatorio;

public class ImportacaoTXT {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	static final String NOME_ARQUIVO_CARGA = "CargaInicial";
	static final String PATH_IMPORTACAO = PATH_BASICO + NOME_ARQUIVO_CARGA + EXTENSAO;

	public static void cargaInicial() throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_IMPORTACAO));

		String lerLinha = "";
		String separador = ";";

		while (true) {
			lerLinha = buffRead.readLine();

			if (lerLinha != null) {
				String[] dados = lerLinha.split(separador);

				if (dados[0].equalsIgnoreCase("CORRENTE")) {
					ContaCorrente cc = new ContaCorrente(dados[0], Integer.parseInt(dados[1]),
							Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), dados[4]);
					Conta.mapaContas.put(dados[4], cc);
					Relatorio.totalCapitalArmazenadoBanco = Relatorio.totalCapitalArmazenadoBanco + Double.parseDouble(dados[3]);
				} else if (dados[0].equalsIgnoreCase("POUPANCA")) {
					ContaPoupanca cp = new ContaPoupanca(dados[0], Integer.parseInt(dados[1]),
							Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), dados[4]);
					Conta.mapaContas.put(dados[4], cp);
					Relatorio.totalCapitalArmazenadoBanco = Relatorio.totalCapitalArmazenadoBanco + Double.parseDouble(dados[3]);
				} else if (dados[0].equalsIgnoreCase("CLIENTE")) {
					Cliente cliente = new Cliente(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]),
							Integer.parseInt(dados[5]));
					Pessoa.mapaPessoas.put(dados[2], cliente);
					Pessoa.OrdenaPessoas.put(dados[2], cliente);
				} else if (dados[0].equalsIgnoreCase("GERENTE")) {
					Gerente gerente = new Gerente(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]),
							Integer.parseInt(dados[5]), Double.parseDouble(dados[6]), Integer.parseInt(dados[7]));
					Pessoa.mapaPessoas.put(dados[2], gerente);
					Pessoa.OrdenaPessoas.put(dados[2], gerente);
				} else if (dados[0].equalsIgnoreCase("DIRETOR")) {
					Diretor diretor = new Diretor(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]),
							Integer.parseInt(dados[5]), Double.parseDouble(dados[6]));
					Pessoa.mapaPessoas.put(dados[2], diretor);
					Pessoa.OrdenaPessoas.put(dados[2], diretor);
				} else if (dados[0].equalsIgnoreCase("PRESIDENTE")) {
					Presidente presidente = new Presidente(dados[0], dados[1], dados[2], dados[3],
							Integer.parseInt(dados[4]), Integer.parseInt(dados[5]), Double.parseDouble(dados[6]));
					Pessoa.mapaPessoas.put(dados[2], presidente);
					Pessoa.OrdenaPessoas.put(dados[2], presidente);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}
}