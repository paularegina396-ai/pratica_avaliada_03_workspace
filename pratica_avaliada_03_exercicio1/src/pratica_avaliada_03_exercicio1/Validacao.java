package pratica_avaliada_03_exercicio1;

public class Validacao {
		/*	Os métodos de validação devem lançar exceções quando os dados forem inválidos.   */
	
	//Método para validar o atributo nome(não pode ser nulo ou vazio)
	public static void validarNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) //tira espaços em branco/ Checa se é vazia e se tamanho 0 
			throw new IllegalArgumentException("Nome não pode ser vazio!"); //Se isso for true daí dispara uma exceção 
	}
	
	//Método para validar o atributo e-mail (deve ser um e-mail válido) // para validar o e-mail, utilize Expressões Regulares
	public static void validarEmail(String email) {
		if (!email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$"))
			throw new IllegalArgumentException("Digite um e-mail válido!");
	}
	
}
