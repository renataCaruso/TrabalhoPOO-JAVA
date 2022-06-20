package br.com.residencia.trabalhopoo.mensagens;

public class Mensagem {

	// Outros
	public String seuSaldo = "Seu saldo atual é: ";
	public String algumaTecla = "Digite alguma tecla para retornar ao menu anterior";

	// Depósito
	public String qualVlDepositar = "Qual valor deseja depositar?";
	public String depositoInsucesso = "Não foi possível realizar o depósito.";
	public String depositoSucesso = "Depósito efetuado com sucesso!";

	// Pagamento de contas
	public String pagamentoInsucesso = "Não foi possível pagar este boleto por falta de saldo na conta.";
	public String pagamentoSucesso = "Pagamento efetuado com sucesso!";
	public String qualVlPagar = "Qual valor deseja pagar?";

	// Saque
	public String qualVlSacar = "Qual valor deseja sacar?";
	public String saqueInsucesso = "Não foi possível realizar o saque por falta de saldo na conta.";
	public String saqueSucesso = "Saque realizado com sucesso!";

	// Transferência
	public String qualAgenciaTransferir = "Para qual agência deseja transferir?";
	public String qualBancoTransferir = "Para qual banco deseja transferir?";
	public String qualContaTransferir = "Para qual conta deseja transferir?";
	public String qualVlTransferir = "Qual valor deseja transferir?";
	public String quemTransferir = "Para quem deseja transferir?";
	public String transfInsucesso = "Não foi possível efetuar a transferência.";
	public String transfSucesso = "Transferência realizada com sucesso!";

	// Login
	public String cpfInformar = "Informe seu CPF para acessar o sistema: ";
	public String acessoPermitido = "Acesso permitido, redirecionando ao menu de opções. \n";
	public String loginOpcaoInvalida = "Opção inválida, tente novamente!";
	public String preLoginBemVindo = "Bem vindo ao Banco XXXX!\n Escolha sua área de Login: ";
	public String senhaInformar = "Digite sua senha: \n";
	public String sistemaEncerrado = "O sistema será encerrado. \n";
	public String tentativasExcedidas = "Número de tentativas excedido.\n";
	public String tentativasRestantes = "Tentativas restantes: ";
	public String acessoIncorreto = "CPF ou conta incorretos. Tente novamente";

	// Relatórios
	public static String infoTaxaDeposito = "Taxa cobrada para cada depósito      : ";
	public static String infoTaxaSaque = "Taxa cobrada para cada saque         : ";
	public static String infoTaxaTransferencia = "Taxa cobrada para cada transferência : ";
	public static String totalTaxasDeposito = "O total cobrado das taxas de depósito é       : ";
	public static String totalTaxasSaque = "O total cobrado das taxas de saque é          : ";
	public static String totalTaxasTransferencia = "O total cobrado das taxas de transferências é : ";
	
    public void limparTela() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}