package pratica_avaliada_03_exercicio1;

public class TestaUsuarios {

	public static void main(String[] args) {
		//Chamada dos métodos de teste
		usuarioValido();
		administradorValido();
		nomeVazio();
		emailInvalido();
	}
	
	//Métodos de teste
	
	static void usuarioValido() {
		System.out.println("\n ******************Caso 1: Usuário válido*************************");
		try {
			Usuario usu = new Usuario("Armando", "armando@empresa.com");
			usu.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void administradorValido() {
		System.out.println("\n ******************Caso 2: Administrador válido******************");
		try {
			Administrador adm = new Administrador("Armando", "armando@empresa.com", "1");
			adm.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void nomeVazio() {
		System.out.println("\n ******************Caso 3: Nome Vazio****************************");
		try {
			Administrador adm = new Administrador("", "armando@empresa.com", "1");
			adm.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}
	
	static void emailInvalido() {
		System.out.println("\n ******************Caso 4: E-mail Inválido***********************");
		try {
			Administrador adm = new Administrador("Armando", "armandoempresa.com", "1");
			adm.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}

}
