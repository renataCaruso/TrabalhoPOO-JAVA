package br.com.residencia.trabalhopoo.pessoas;




public class Diretor extends Funcionario {


public Diretor() {
    super();
}

public Diretor(String tipoPessoa, String nome, String cpf, String senha, Integer agencia,
               Integer numeroConta, Double salario) {
    super(tipoPessoa, nome, cpf, senha, agencia, numeroConta, salario);
}

@Override
public String toString() {
    return "Diretor [tipoPessoa=" + this.tipoPessoa + ", nome=" + this.nome
            + ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia="
            + this.agencia + ", numeroConta=" + this.numeroConta + " salario=" + this.salario + " ]\n";
}

}