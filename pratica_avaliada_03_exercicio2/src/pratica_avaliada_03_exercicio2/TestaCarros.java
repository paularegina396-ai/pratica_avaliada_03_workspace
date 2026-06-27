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
	//Criação de um carro elétrico
	static void carroEletrico() {
		System.out.println("\n ******************Caso 1: Criação de um carro elétrico*************************");
		try {
			CarroEletrico usu = new CarroEletrico("Tesla Model 3", 0, 20);// modelo,  velocidade inicial,  nivelBateria inicial
			usu.acelerar(30);
			usu.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	//Aceleração válida
	static void aceleracaoValida() {
		System.out.println("\n ******************Caso 2: Aceleração válida******************");
		try {
			CarroEletrico usu = new CarroEletrico("BYD Dolfin", 70, 70);
			usu.acelerar(5);
			usu.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	//Aceleração com valor inválido
	static void aceleracaoInvalida() {
		System.out.println("\n ******************Caso 3: Aceleração com valor inválido****************************");
		try {
			CarroEletrico usu = new CarroEletrico("BYD Dolfin", 70, 70);
			usu.acelerar(-3);
			usu.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}
	//Bateria insuficiente
	static void bateriaInsuficiente() {
		System.out.println("\n ******************Caso 4: Bateria insuficiente***********************");
		try {
			CarroEletrico usu = new CarroEletrico("BYD Dolfin", 70, 0);
			usu.acelerar(5);
			usu.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}
	
	//Bateria insuficiente
	static void bateriaAbaixoZero() {
		System.out.println("\n ******************Caso 5: Nível de bateria negativo***********************");
		try {
			CarroEletrico usu = new CarroEletrico("BYD Dolfin", 70, -7);
			usu.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}
	
	static void bateriaAcimaCem() {
		System.out.println("\n ******************Caso 6: Nível de bateria acima de 100%***********************");
		try {
			CarroEletrico usu = new CarroEletrico("BYD Dolfin", 70, 101);
			usu.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}

}
