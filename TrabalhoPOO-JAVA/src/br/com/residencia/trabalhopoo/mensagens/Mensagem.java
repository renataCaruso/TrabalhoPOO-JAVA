package br.com.residencia.trabalhopoo.mensagens;

public class Mensagem {

	// Outros
	public String seuSaldo = "Seu saldo atual �: ";
	public String algumaTecla = "Digite alguma tecla para retornar ao menu anterior";

	// Dep�sito
	public String qualVlDepositar = "Qual valor deseja depositar?";
	public String depositoInsucesso = "N�o foi poss�vel realizar o dep�sito.";
	public String depositoSucesso = "Dep�sito efetuado com sucesso!";

	// Pagamento de contas
	public String pagamentoInsucesso = "N�o foi poss�vel pagar este boleto por falta de saldo na conta.";
	public String pagamentoSucesso = "Pagamento efetuado com sucesso!";
	public String qualVlPagar = "Qual valor deseja pagar?";

	// Saque
	public String qualVlSacar = "Qual valor deseja sacar?";
	public String saqueInsucesso = "N�o foi poss�vel realizar o saque por falta de saldo na conta.";
	public String saqueSucesso = "Saque realizado com sucesso!";

	// Transfer�ncia
	public String qualAgenciaTransferir = "Para qual ag�ncia deseja transferir?";
	public String qualBancoTransferir = "Para qual banco deseja transferir?";
	public String qualContaTransferir = "Para qual conta deseja transferir?";
	public String qualVlTransferir = "Qual valor deseja transferir?";
	public String quemTransferir = "Para quem deseja transferir?";
	public String transfInsucesso = "N�o foi poss�vel efetuar a transfer�ncia.";
	public String transfSucesso = "Transfer�ncia realizada com sucesso!";

	// Login
	public String cpfInformar = "Informe seu CPF para acessar o sistema: ";
	public String acessoPermitido = "Acesso permitido, redirecionando ao menu de op��es. \n";
	public String loginOpcaoInvalida = "Op��o inv�lida, tente novamente!";
	public String preLoginBemVindo = "Bem vindo ao Banco XXXX!\n Escolha sua �rea de Login: ";
	public String senhaInformar = "Digite sua senha: \n";
	public String sistemaEncerrado = "O sistema ser� encerrado. \n";
	public String tentativasExcedidas = "N�mero de tentativas excedido.\n";
	public String tentativasRestantes = "Tentativas restantes: ";
	public String acessoIncorreto = "CPF ou conta incorretos. Tente novamente";

	// Relat�rios
	public static String infoTaxaDeposito = "Taxa cobrada para cada dep�sito      : ";
	public static String infoTaxaSaque = "Taxa cobrada para cada saque         : ";
	public static String infoTaxaTransferencia = "Taxa cobrada para cada transfer�ncia : ";
	public static String totalTaxasDeposito = "O total cobrado das taxas de dep�sito �       : ";
	public static String totalTaxasSaque = "O total cobrado das taxas de saque �          : ";
	public static String totalTaxasTransferencia = "O total cobrado das taxas de transfer�ncias � : ";
	
    public void limparTela() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}