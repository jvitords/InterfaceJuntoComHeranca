package model.entities;

import model.enums.Color;

public class Retagulo extends FormasEmAbstract{

	private Double altura;
	private Double largura;
	
	public Retagulo(Color cor, Double altura, Double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}
	
	public Retagulo(Double altura, Double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	public Double area() {
		return altura *largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}
}
