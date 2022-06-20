package br.com.residencia.trabalhopoo.enums;

import br.com.residencia.trabalhopoo.logins.Login;

public class TesteEnums {
	TipoPessoa pessoa;
	TipoConta conta;

	public TesteEnums(String pessoa) {
		super();
		this.pessoa = TipoPessoa.valueOf(pessoa);
//		this.conta = TipoConta.valueOf(conta);
	}

	public void chamarPessoa() {
		switch (pessoa) {
		case CLIENTE:
		case GERENTE:
		case DIRETOR:
		case PRESIDENTE:
			Login.logar();
			break;
		}
	}

//	public void chamarConta() {
//		switch(conta) {
//		case CORRENTE:
//		case POUPANCA:
//		OperacaoBancaria.consultarSaldoDisp(null, null);
//		OperacaoBancaria.sacar(null, null);
//		OperacaoBancaria.depositar(0, null);
//		break;
//		
//		
//		}
}
