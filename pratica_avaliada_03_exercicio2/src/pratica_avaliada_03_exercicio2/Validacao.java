package pratica_avaliada_03_exercicio2;

public class Validacao {
	/*	Os métodos de validação devem lançar exceções quando os dados forem inválidos.   */
	
	//Método para validar a aceleracao (número inteiro positivo e maior do que zero)
	public static void validarAcelerar(int valorAceleracao) {
		if (valorAceleracao <= 0)  
			throw new IllegalArgumentException("Digite um valor de aceleração positivo maior que 0"); //Se for true dispara exceção 
	}
	
	//Método para validar o nivel da bateria (número inteiro entre 0 e 100, inclusivo)
	public static void validarNivelBateria(int valor) {
		if (valor<0 || valor>100)
			throw new IllegalArgumentException("Digite um valor de nível de bateria entre 0 e 100!");
	}
	
	//Método para validar o nível insuficiente da bateria (consumo não pode ser maior do que o nível da bateria)
		public static void validarNivelinsuficiente(int consumo, int nivelBateria) {
			if (consumo > nivelBateria)
				throw new IllegalArgumentException("Consumo não pode ser maior do que o nível da bateria!");
		}
}
