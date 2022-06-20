package br.com.residencia.trabalhopoo.logins;

import br.com.residencia.trabalhopoo.contas.Conta;
import br.com.residencia.trabalhopoo.pessoas.Pessoa;
import br.com.residencia.trabalhopoo.pessoas.Funcionario;

public class DadosBase {

	public static String cpfEmUso;
	public static String nomeEmUso;
	public static String senhaUso;
	public static Integer agenciaUso;
	public static Integer numeroContaUso;
	public static Double saldoUso;
	public static Double salarioEmUso;
	public static String tipoPessoaEmUso;
	
	public  String getCpfEmUso() {
		return cpfEmUso;
	}

	


	public static void carregarDadosBase() {
	//	DadosBase.cpfEmUso = digitadoCPF;
		nomeEmUso = Pessoa.mapaPessoas.get(cpfEmUso).getNome();
		cpfEmUso = Pessoa.mapaPessoas.get(cpfEmUso).getCpf();
		tipoPessoaEmUso = Pessoa.mapaPessoas.get(cpfEmUso).getTipoPessoa();
		senhaUso = Pessoa.mapaPessoas.get(cpfEmUso).getSenha();
		agenciaUso = Pessoa.mapaPessoas.get(cpfEmUso).getAgencia();
		numeroContaUso = Pessoa.mapaPessoas.get(cpfEmUso).getNumeroConta();
		saldoUso = Conta.mapaContas.get(cpfEmUso).getSaldo();		
	}
}
