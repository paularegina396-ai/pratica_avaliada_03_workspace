package pratica_avaliada_03_exercicio3;

public class Validacao {
/*	Os métodos de validação devem lançar exceções quando os dados forem inválidos.   */
	
	//Método para validar o atributo mensagem (não pode ser nula ou vazia)
	public static void validarMensagem(String mensagem) {
		if (mensagem.isEmpty())  
			throw new IllegalArgumentException("A mensagem não pode ser nula ou vazia"); 
	}
	
	//Método para validar o atributo destinatário 
	//(não pode ser nula ou vazia, pode ser um e-mail ou telefone celular válido (ddd + numero))
	public static void validarDestinatario(String destinatario) {
		if (!(destinatario.trim().matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) && !(destinatario.trim().matches("^\\d{2}9?\\d{8}$")))  //trim tira espaços vazios, 
			throw new IllegalArgumentException("Digite um e-mail ou telefone válido!");
	}
	
	//Método para validar o atributo destinatário 
		//(não pode ser nula ou vazia, pode ser um e-mail ou telefone celular válido (ddd + numero))
		public static void validarTipo(String tipo) {
			if (!(tipo.trim().toUpperCase().equals("EMAIL") ) && !(tipo.trim().toUpperCase().equals("SMS")))  //trim tira espaços vazios 
				throw new IllegalArgumentException("Digite uma das opções de tipo 'EMAIL' ou 'SMS'!!!");
		}
	
}
