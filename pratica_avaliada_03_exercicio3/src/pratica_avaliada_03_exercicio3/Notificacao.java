package pratica_avaliada_03_exercicio3;

public class Notificacao {
	//Atributos
	private String destinatario;
	
	//Método Construtor
	public Notificacao(String destinatario) {
		Validacao.validarDestinatario(destinatario); //Validação antes de construir
		this.destinatario = destinatario;
	}
	
	//Get e Set
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {//Validação antes de set
		Validacao.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}
	
	//Demais métodos
	public void enviar(String mensagem) {
		//Método enviar(mensagem) para enviar uma notificação - esse método faz oq? kk nada?
		
	}
	
	

}
