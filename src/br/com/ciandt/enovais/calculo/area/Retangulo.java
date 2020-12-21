package br.com.ciandt.enovais.calculo.area;

public class Retangulo extends CalculoArea {

	private double base;
	private double altura;

	public Retangulo(double b, double h) {
		this.base = b;
		this.altura = h;
	}

	public void calcularArea() {
		setArea((base * altura));
	}

}
