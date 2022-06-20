package br.com.residencia.trabalhopoo.contas;

public class ContaCorrente extends Conta {
	 private Integer totalSaques = 0, totalDepositos = 0, totalTransferencias = 0;
	 private Double totalTributado = 0.0;
	
	public ContaCorrente() {
		super();
		
	}

	public ContaCorrente(String tipoConta, Integer numeroAgencia, Integer numeroConta, Double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);

		
	}

	public Integer getTotalSaques() {
		return totalSaques;
	}

	public Integer getTotalDepositos() {
		return totalDepositos;
	}

	public Integer getTotalTransferencias() {
		return totalTransferencias;
	}

	public Double getTotalTributado() {
		return totalTributado;
	}

	@Override
	public String toString() {
		return "ContaCorrente [tipoConta=" + tipoConta + ", numeroAgencia=" + numeroAgencia + ", numeroConta="
				+ numeroConta + ", saldo=" + saldo + ", cpf=" + cpf + "]";
	}
	
	
	
}