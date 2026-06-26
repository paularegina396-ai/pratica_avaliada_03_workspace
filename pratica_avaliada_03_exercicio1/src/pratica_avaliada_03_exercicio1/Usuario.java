package pratica_avaliada_03_exercicio1;

public class Usuario {
	
	//Atributos
	private String nome;
	private String email;
	
	
	//Método Construtor
	public Usuario(String nome, String email) {
		//Validações antes de criar objetos
		Validacao.validarNome(nome);
		Validacao.validarEmail(email);
		
		this.nome = nome;
		this.email = email;
	}

	
	
	//Métodos get e set de todos os atributos
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		Validacao.validarNome(nome); //Validações antes de atualizar objetos
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		Validacao.validarEmail(email); //Validações antes de atualizar objetos
		this.email = email;
	}
	
	//Outros métodos --> Comportamentos do Domínio
	
	public void visualizar() { 
		System.out.println("Nome: " + this.nome); //This. faz referencia aos atributos DA PRÓPRIA CLASSE, por isso n passa parametro
		System.out.println("E-mail: " + this.email);
		
	}
	
	
	
	

}
