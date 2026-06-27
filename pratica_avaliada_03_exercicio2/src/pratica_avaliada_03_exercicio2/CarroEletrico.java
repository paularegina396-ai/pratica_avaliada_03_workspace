package pratica_avaliada_03_exercicio2;

public class CarroEletrico extends Carro {
	//Atributo
	private int nivelBateria;
	final int CONSUMO_POR_ACELERACAO = 2;
	
	//Método Construtor
	public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
		super(modelo, velocidade);
		Validacao.validarNivelBateria(nivelBateria);
		//Validacao.validarNivelinsuficiente(CONSUMO_POR_ACELERACAO, nivelBateria);
		
		this.nivelBateria = nivelBateria;
	}
	
	//Get e Set

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}
	
	//Outros métodos
	//Sobrescrever 
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nível de Bateria(%): " + this.nivelBateria);
	}
	
	@Override
	public void acelerar(int valorAceleracao) {
		
		//Validacao.validarAcelerar(super.getVelocidade());
		Validacao.validarNivelBateria(this.nivelBateria);
		
		int consumo = valorAceleracao/this.CONSUMO_POR_ACELERACAO;
		//Depois de calcular o consumo, valide o resultado com o método de validação do nível insuficiente da bateria
		Validacao.validarNivelinsuficiente(consumo, this.nivelBateria);
		
		
		//consumo = valorAceleracao/CONSUMO_POR_ACELERACAO;
		
		this.nivelBateria = this.nivelBateria - consumo;
		super.acelerar(valorAceleracao);
		
	}
	
	

}
