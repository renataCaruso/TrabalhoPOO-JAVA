package br.com.residencia.trabalhopoo.pessoas;

public class Cliente extends Pessoa {

	public static int qtClientes; //s[o fiz pra trazer get
	
    public Cliente() {
        super();
    }

    public Cliente(String tipoPessoa, String nome, String cpf, String senha, Integer agencia, Integer numeroConta) {
        super(tipoPessoa, nome, cpf, senha, agencia, numeroConta);

    }

    @Override
    public String toString() {
        return "Cliente [Nome: " + this.nome + ", tipoPessoa=" + this.tipoPessoa
                + ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia=" + this.agencia + ", numeroConta="
                + this.numeroConta + "]\n";
    }


}
