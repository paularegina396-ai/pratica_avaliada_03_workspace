package pratica_avaliada_03_exercicio2;



public class TestaCarros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chamada dos métodos de teste
				carroEletrico();
				aceleracaoValida();
				aceleracaoInvalida();
				bateriaInsuficiente();
				bateriaAbaixoZero();
				bateriaAcimaCem();

	}
	//Métodos de Teste
	public static void criarCarroEletrico(String modelo, int velocidade, int nivelBateria, int aceleracao) {
	    CarroEletrico carro = new CarroEletrico(modelo, velocidade, nivelBateria);
	    carro.acelerar(aceleracao);
	    carro.visualizar();
	}
	
	//Criação de um carro elétrico
	static void carroEletrico() {
		System.out.println("\n ******************Caso 1: Criação de um carro elétrico*************************");
		try {
			//CarroEletrico usu = new CarroEletrico("Tesla Model 3", 0, 20);// modelo,  velocidade inicial,  nivelBateria inicial
			criarCarroEletrico("Tesla Model 3", 0, 20, 30);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	//Aceleração válida
	static void aceleracaoValida() {
		System.out.println("\n ******************Caso 2: Aceleração válida******************");
		try {
			criarCarroEletrico("BYD Dolfin", 70, 70, 5); // Passa os parâmetros pro método auxiliar!
			//usu.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	//Aceleração com valor inválido
	static void aceleracaoInvalida() {
		System.out.println("\n ******************Caso 3: Aceleração com valor inválido****************************");
		try {
			criarCarroEletrico("BYD Dolfin", 70, 70, -3);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}
	//Bateria insuficiente
	static void bateriaInsuficiente() {
		System.out.println("\n ******************Caso 4: Bateria insuficiente***********************");
		try {
			criarCarroEletrico("BYD Dolfin", 70, 0, 5);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}
	
	//Bateria insuficiente
	static void bateriaAbaixoZero() {
		System.out.println("\n ******************Caso 5: Nível de bateria negativo***********************");
		try {
			criarCarroEletrico("BYD Dolfin", 70, -7, 5);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}
	
	static void bateriaAcimaCem() {
		System.out.println("\n ******************Caso 6: Nível de bateria acima de 100%***********************");
		try {
			criarCarroEletrico("BYD Dolfin", 70, 101, 5);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}

}
