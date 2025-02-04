package model.entities;

import model.enums.Color;

public class Circulo extends FormasEmAbstract{

	private Double raio;

	public Circulo(Color cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Circulo(Double raio) {
		this.raio = raio;
	}
	public Double area() {
		return Math.PI * raio * raio;
	}
	
	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
}
