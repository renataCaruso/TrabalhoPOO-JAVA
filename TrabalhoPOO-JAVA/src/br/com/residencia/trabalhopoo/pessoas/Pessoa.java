package br.com.residencia.trabalhopoo.pessoas;

import java.util.Date;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class Pessoa implements Comparable<Pessoa> {

	protected String tipoPessoa;
	protected String nome;
	protected String cpf;
	protected String senha;
	protected Integer agencia;
	protected Integer numeroConta;

	public static Map<String, Pessoa> mapaPessoas = new HashMap<>();
	public static TreeMap<String, Pessoa> OrdenaPessoas = new TreeMap<>();

	public Pessoa() {

	}

	public Pessoa(String tipoPessoa, String nome, String cpf, String senha, Integer agencia, Integer numeroConta) {
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.cpf = cpf;
		this.senha = senha;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}

	public void setCpf(String cpf) {

		// só registra o cpf no campo caso o campo esteja vazio, sem registro
		if (this.cpf == null) {
			this.cpf = cpf;
		}
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public static Map<String, Pessoa> getMapaPessoas() {
		return mapaPessoas;
	}

	public static TreeMap<String, Pessoa> getOrdenaPessoas() {
		return OrdenaPessoas;
	}

	@Override
	public int compareTo(Pessoa outroPessoa) {

		return this.nome.compareTo(outroPessoa.getNome());
	}

//    public String relatorioInformacoes() {
//
//        return "Nome: " + this.nome + "\t CPF: " + this.cpf + "\tAgencia: " + this.agencia;
//
//    }



	@Override
	public String toString() {
		return "Usuario [tipoPessoa=" + this.tipoPessoa + ",nome=" + this.nome + ", cpf=" + this.cpf + ", senha="
				+ this.senha + ", agencia=" + this.agencia + ", numeroConta=" + this.numeroConta + "]";
	}
}