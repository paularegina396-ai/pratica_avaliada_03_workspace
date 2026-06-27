package pratica_avaliada_03_exercicio3;


public class NotificacaoEmail extends Notificacao {

	//Método Construtor
	public NotificacaoEmail(String destinatario) {
		super(destinatario);
		// TODO Auto-generated constructor stub
	}
	
	//Sobreescrita
	@Override
	public void enviar(String mensagem) {//Objetivo dessa classe é printar a mensagem
		//Como sei se é email ou SMS? Chama as validações? Ou testa aqui com um if, pq se n for telefone, nem email dai realmente
		//a pessoa digitou errado, agora se for um o outro vai dar um exception ne, ou poe o if direto? é deselegante?
		
		System.out.println("Enviando Email para " + this.getDestinatario() + " - Mensagem: " + mensagem);
		
	}

}
