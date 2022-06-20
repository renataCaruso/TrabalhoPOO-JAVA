package br.com.residencia.trabalhopoo.contas;

import java.util.HashMap;
import java.util.Map;

public abstract class Conta {
    protected String tipoConta;
    protected Integer numeroAgencia;
    protected Integer numeroConta;
    protected Double saldo;
    protected String cpf;

    public static Map<String, Conta> mapaContas = new HashMap<>();
//	Set<Integer> agencias = new HashSet<>();

    public Conta() {
    }

    public Conta(String tipoConta, Integer numeroAgencia,
                 Integer numeroConta, Double saldo, String cpf) {
        this.tipoConta = tipoConta;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cpf = cpf;
    }

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	  @Override
	    public String toString() {
	        return "Conta [tipoConta=" + this.tipoConta + ", numeroAgencia=" + this.numeroAgencia + ", numeroConta="
	                + this.numeroConta + ", saldo=" + this.saldo + "cpf=" + this.cpf + "]";
	    }
}