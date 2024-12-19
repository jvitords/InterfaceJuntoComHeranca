package application;

import model.entities.Circulo;
import model.entities.FormasEmAbstract;
import model.entities.Retagulo;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("OOOi");
		
		FormasEmAbstract retangulo = new Retagulo(Color.Preto, 20.0, 10.0);
		FormasEmAbstract circulo = new Circulo(Color.Branco, 7.5);
		
		System.out.println(retangulo.getCor() + ", " + retangulo.area());
		System.out.println(circulo.area() + ", " + circulo.getCor());
		
	}
}
