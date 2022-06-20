package br.com.residencia.trabalhopoo.pessoas;


public class Gerente extends Funcionario {

    private Integer numeroAgencia;

    public Gerente() {
        super();
    }

    public Gerente(String tipoPessoa, String nome, String cpf, String senha, Integer agencia, 
    		Integer numeroConta, Double salario, Integer numeroAgencia) {
        super(tipoPessoa, nome, cpf, senha, agencia, numeroConta, salario);

        this.numeroAgencia = numeroAgencia;
    }

    public Integer getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

	@Override
	public String toString() {
		return "Gerente [tipoPessoa=" + tipoPessoa 	+ ", nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + ", agencia=" + agencia + ", numeroConta="
				+ numeroConta + ", salario=" + salario + " ]";
	}
	

    
}

