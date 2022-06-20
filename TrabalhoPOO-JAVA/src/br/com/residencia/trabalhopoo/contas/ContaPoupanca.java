package br.com.residencia.trabalhopoo.contas;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
		
	}

	public ContaPoupanca(String tipoConta, Integer numeroAgencia, Integer numeroConta, Double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
		
	}

	@Override
	public String toString() {
		return "ContaPoupanca [tipoConta=" + tipoConta + ", numeroAgencia=" + numeroAgencia + ", numeroConta="
				+ numeroConta + ", saldo=" + saldo + ", cpf=" + cpf + "]";
	}

	
}
