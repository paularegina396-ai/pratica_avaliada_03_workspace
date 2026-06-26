package pratica_avaliada_03_exercicio1;

public class Administrador extends Usuario {
	//Atributo
	private String nivelDeAcesso; 
	
	//Método Construtor
	public Administrador(String nome, String email, String nivelDeAcesso) {
		super(nome, email);
		this.nivelDeAcesso = nivelDeAcesso;
		
	}

	//Get e Set
	public String getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}
	
	//Outros métodos
	//Sobrescrever o método visualizar para exibir o nível de acesso.
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nível de Acesso: " + this.nivelDeAcesso);
	}
	
	

}
