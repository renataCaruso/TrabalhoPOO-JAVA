package br.com.residencia.trabalhopoo.io;

import java.io.IOException;

public class TesteIO {

	public static void main(String[] args) throws IOException {
//		LeituraEscrita.escritor();
//		LeituraEscrita.escritorIncremento();
//		Escrita.escritorTituloExtrato(Escrita.agenciaExtrato, Escrita.contaExtrato, Escrita.nomeCliente);

		System.out.println("teste");
		Escrita.registrarExtrato();
		System.out.println(Escrita.PATH_COMPLETO);

	}

}
