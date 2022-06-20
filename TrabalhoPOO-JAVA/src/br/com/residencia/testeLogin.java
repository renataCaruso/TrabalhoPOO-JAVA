package br.com.residencia;

import java.util.Scanner;

import br.com.residencia.trabalhopoo.mensagens.Mensagem;

public class testeLogin {
	public static void logar() {
		Mensagem msg = new Mensagem();
		Scanner scan = new Scanner(System.in);
		System.out.println(msg.clienteInformarAgencia);
		String agencia = scan.next();
		System.out.println(msg.clienteInformarConta);
		String conta = scan.next();
		System.out.println(msg.clienteInformarSenha);
		String senha = scan.next();
		
		if(validarLoginCliente(agencia, conta, senha) == true) {
			//menu do banco do cliente
		}
		else {
			System.out.println(msg.loginInvalido);
			logar();
	}

		public static boolean validarLoginCliente(String agencia, String conta, String senha) {
			if(agencia =="descobrir como puxar agencia" && conta == "descobrir como puxar conta" && senha == "descobrir como puxar senha" )
				return true;
			else 
				return false;
				
//			funcao logico valida(cadeia usuario, cadeia senha){
//				retorne(usuario == "Eduardo" e senha == "edu" ou usuario == "Wagner" e senha == "wagner" ou 
//						usuario == "Leonardo" e senha == "leo" ou usuario == "Paulo" e senha == "paulo" ou
//						usuario == "Renata" e senha == "renata" ou usuario == "Tatiana" e senha == "tati")
//			}
//			
			
			
		}
			
	
          se (valida(usuario, senha)){

        	  
               menuDepartamento()
                }
              senao {
               para(inteiro tentativa = 1; tentativa <= 1; tentativa++){
               se (valida(usuario, senha))

           limpa()
           escreva("Dados incorretos!\nNome do usuário: ")
           leia(usuario)
           escreva("Sua senha: ")
           leia(senha)
           limpa()
               }
               se (valida(usuario,senha)){
            escreva("Bem vindo, ", usuario)
            menuDepartamento()
                } 
                senao {
            escreva("Acesso negado! Por favor verifique seus dados cadastrados.")
          Util.aguarde(3000)
            inicio()
            login()
               }
        }
      }
funcao telaDeEntrada(){
            //limpa()
        escreva("\n","Olá, tudo bem? Deseja acessar nosso sistema? S/N : ")
            leia(entradaloja)
                se(entradaloja == "S" ou entradaloja == "s"){
                login()
                }
                senao {
                escreva("Ok, estaremos aguardando sua próxima visita")
                Util.aguarde(3000)
                inicio()
                }

  }
	
	
}
