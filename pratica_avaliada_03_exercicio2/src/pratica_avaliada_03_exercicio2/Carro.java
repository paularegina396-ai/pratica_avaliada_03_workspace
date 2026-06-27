package pratica_avaliada_03_exercicio2;

public class Carro {
	//Atributos
	private String modelo;
	private int velocidade;
	
	//Método Construtor
	public Carro(String modelo, int velocidade) {
		
	
		this.modelo = modelo;
		this.velocidade = velocidade;
	}
	
	//Get e Set
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	//Outros métodos --> Comportamentos do Domínio
	public void visualizar() { 
		System.out.println("Modelo: " + this.modelo); 
		System.out.println("Velocidade(km/h): " + this.velocidade);
		
	}
	
	//Método acelerar(valor) para aumentar a velocidade do carro em km/h
	public void acelerar(int valorAceleracao) { 
		
		Validacao.validarAcelerar(valorAceleracao);
		this.velocidade = this.velocidade+valorAceleracao;
		
		
	}
	
	
	
	
	
	
}
