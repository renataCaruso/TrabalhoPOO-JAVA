package br.com.residencia.trabalhopoo.principal;

import java.io.IOException;
import java.util.Scanner;

import br.com.residencia.trabalhopoo.io.*;
import br.com.residencia.trabalhopoo.logins.*;
import br.com.residencia.trabalhopoo.relatorios.*;
public class SistemaInterativo {

	public static void main(String[] args) throws IOException {
		LoginInicial login = new LoginInicial();
		
		//Carga de dados
		ImportacaoTXT.cargaInicial();
		
		//Menu de login
		login.logar();
		Relatorio clientes = new Relatorio();
		
		//Atribuições de variáveis do usuário que logou
		clientes.dadosCliente();
		
		
	}
}
