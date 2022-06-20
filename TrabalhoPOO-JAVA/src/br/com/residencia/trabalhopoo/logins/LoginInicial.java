package br.com.residencia.trabalhopoo.logins;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.residencia.trabalhopoo.contas.Conta;
import br.com.residencia.trabalhopoo.mensagens.*;
import br.com.residencia.trabalhopoo.pessoas.Pessoa;

public class LoginInicial {

	public String digitadoCPF;
	public String digitadoSenha;

	Mensagem msg = new Mensagem();
	Scanner scan = new Scanner(System.in);

	public void logar() throws NullPointerException, InputMismatchException {
		try {
			System.out.println(msg.cpfInformar);
			digitadoCPF = scan.next();
			System.out.println(msg.senhaInformar);
			digitadoSenha = scan.next();

			Pessoa pessoa = Pessoa.mapaPessoas.get(digitadoCPF);
			Conta conta = Conta.mapaContas.get(digitadoCPF);

			while (pessoa == null || !(pessoa.getSenha().equals(digitadoSenha))) {
				System.out.println(msg.acessoIncorreto);

				System.out.println(msg.cpfInformar);
				digitadoCPF = scan.next();
				System.out.println(msg.senhaInformar);
				digitadoSenha = scan.next();

				pessoa = Pessoa.mapaPessoas.get(digitadoCPF);
				conta = Conta.mapaContas.get(digitadoCPF);
			}
			msg.limparTela();

			// Puxará todos os dados de quem fez o login no momento
			DadosBase.cpfEmUso = digitadoCPF;
			DadosBase.carregarDadosBase();
			enviarMenuclienteOuFuncionario();
		

		} catch (NullPointerException e) {
			System.out.println("Não localizado");
		} //finally {
//			System.out.println("Outro menu?");
//		}
	}
	
	public static void enviarMenuclienteOuFuncionario() {
		//Descobre se é cliente ou funcionário
		if (DadosBase.tipoPessoaEmUso.equalsIgnoreCase("Cliente")) {
			Menus.menuCliente();
		} else {
			Menus.menuFuncionario();
		}
	}
}