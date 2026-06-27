package pratica_avaliada_03_exercicio3;

public class NotificacaoSMS extends Notificacao {
	
	//Método Construtor
	public NotificacaoSMS(String destinatario) {
		super(destinatario);
		// TODO Auto-generated constructor stub
	}
	
	//Sobreescrita
	@Override
	public void enviar(String mensagem) {//Objetivo dessa classe é printar a mensagem
	
		System.out.println("Enviando SMS para " + this.getDestinatario() + " - Mensagem: " + mensagem);
		
	}

}
