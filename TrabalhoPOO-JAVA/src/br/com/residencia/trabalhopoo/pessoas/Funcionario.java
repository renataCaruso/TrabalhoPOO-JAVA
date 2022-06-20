package br.com.residencia.trabalhopoo.pessoas;

public abstract class Funcionario extends Pessoa {

    protected Double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String tipoPessoa, String nome, String cpf, String senha, Integer agencia, Integer numeroConta,
                       Double salario) {
        super(tipoPessoa, nome, cpf, senha, agencia, numeroConta);

        this.salario = salario;
    }

    public Double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "Funcionario [tipoPessoa=" + this.tipoPessoa + ", nome=" + this.nome + ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia=" + this.agencia + ", numeroConta="
                + this.numeroConta + ", salario=" + this.salario + "]\n";
    }

}