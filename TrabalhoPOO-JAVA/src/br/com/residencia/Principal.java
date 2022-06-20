package br.com.residencia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd");

	Date dataNascimento;
	String cpf;
	String email;
	String endereco;
	String estadoCivil;
	String genero;
	String nome;
	String telefone;
	String tipoPessoa; // Pessoa física ou Jurídica

	dataNascimento=dt.parse("1991-01-01");

	System.out.println(dataNascimento);
}}