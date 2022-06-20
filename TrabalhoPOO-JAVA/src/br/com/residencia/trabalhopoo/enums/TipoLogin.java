package br.com.residencia.trabalhopoo.enums;

public enum TipoLogin {
	
	LOGIN_CLIENTE(1),
	LOGIN_FUNCIONARIO(2);
	
	private final int valor;
	TipoLogin(int valorOpcao){
	valor = valorOpcao;
	}
	public int getValor(){
	return valor;
	}
	}

