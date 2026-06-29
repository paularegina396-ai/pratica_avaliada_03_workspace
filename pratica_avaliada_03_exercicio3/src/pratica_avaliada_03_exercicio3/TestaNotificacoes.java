package pratica_avaliada_03_exercicio3;


public class TestaNotificacoes {

	public static void main(String[] args) {
		//Chamada dos métodos de teste
		emailValido();
		smsValido();
		mensagemVazia();
		destinatarioVazio();
		tipoInexistente();
		


	}
	
	//Método para enviar as notificações
	public static void criarNotificacao(String tipo, String destinatario, String mensagem) {
		 //Esse método decide qual objeto criar na memória e disparar o envio de forma generica
		
		//Validacoes antes de criar objeto
		Validacao.validarTipo(tipo);
		Validacao.validarDestinatario(destinatario);;
		Validacao.validarMensagem(mensagem);
		
		if (tipo.equalsIgnoreCase("EMAIL")) {
			// Instancia a filha de Email
				NotificacaoEmail usu = new NotificacaoEmail(destinatario); //É errado criar assim? Deveria criar uma classe mãe?
				usu.enviar(mensagem);
	    } else if (tipo.equalsIgnoreCase("SMS")) {
	    	// Instancia a filha de SMS
	    		NotificacaoSMS usu = new NotificacaoSMS(destinatario);
	    		usu.enviar(mensagem);
	    } else {
	        // Proteção extra: se não for nenhum dos dois, joga a exceção explicitamente
	        throw new IllegalArgumentException("Tipo de notificação inválido!");
	    }
		
		//usu.enviar(mensagem); - ao inves de por dois posso por so um aqui ne

	}
	
	//Métodos de Teste
	//Email válido
	static void emailValido() {
		System.out.println("\n ******************Caso 1: Email válido*************************");
		try {
			String tipo = "email";
			String destinatario = "ana@email.com";
			String mensagem = "Bem-vindo ao sistema";
			
			criarNotificacao(tipo, destinatario, mensagem);
		
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
		//SMS válido
		static void smsValido() {
			System.out.println("\n ******************Caso 2: SMS válido*************************");
			try {
				String tipo = "sms";
				String destinatario = "1167867564";
				String mensagem = "Bem-vindo ao sistema";
				
				criarNotificacao(tipo, destinatario, mensagem);
			
			} catch (Exception e) {
				System.err.println("Erro: " + e.getMessage());
			}
		}
		
//Mensagem vazia
		static void mensagemVazia() {
			System.out.println("\n ******************Caso 3: Mensagem vazia*************************");
			try {
				String tipo = "email";
				String destinatario = "ana@email.com";
				String mensagem = "";
				
				criarNotificacao(tipo, destinatario, mensagem);
			
			} catch (Exception e) {
				System.err.println("Erro: " + e.getMessage());
			}
		}
		
		//Destinatário vazio
		static void destinatarioVazio() {
			System.out.println("\n ******************Caso 4: Destinatário vazio*************************");
			try {
				String tipo = "email";
				String destinatario = "";
				String mensagem = "Bem-vindo ao sistema";
				
				criarNotificacao(tipo, destinatario, mensagem);
			
			} catch (Exception e) {
				System.err.println("Erro: " + e.getMessage());
			}
		}
		
		//Tipo inexistente
		static void tipoInexistente() {
			System.out.println("\n ******************Caso 5: Tipo inexistente*************************");
			try {
				String tipo = "";
				String destinatario = "ana@email.com";
				String mensagem = "Bem-vindo ao sistema";
				
				criarNotificacao(tipo, destinatario, mensagem);
			
			} catch (Exception e) {
				System.err.println("Erro: " + e.getMessage());
			}
		}

}
