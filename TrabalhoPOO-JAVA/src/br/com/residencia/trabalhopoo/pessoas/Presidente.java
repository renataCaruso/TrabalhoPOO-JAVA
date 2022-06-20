package br.com.residencia.trabalhopoo.pessoas;


public class Presidente extends Funcionario {

//	List<Gerente> listaGerentes = new ArrayList<>();
//	List<Diretor> listaDiretores = new ArrayList<>();
//	List<Agencia> listaAgencias = new ArrayList<>();

    public Presidente() {
        super();
    }

    public Presidente(String tipoPessoa, String nome, String cpf, String senha, Integer agencia, Integer numeroConta,
                      Double salario) {
        super(tipoPessoa, nome, cpf, senha, agencia, numeroConta, salario);
    }

    @Override
    public String toString() {
        return "Presidente [tipoPessoa=" + this.tipoPessoa  + ", nome=" + this.nome + ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia=" + this.agencia + ", numeroConta="
                + this.numeroConta + ", salario=" + this.salario + "]\n";
    }

}