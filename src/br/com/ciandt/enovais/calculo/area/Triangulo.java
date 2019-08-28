package br.com.ciandt.enovais.calculo.area;

public class Triangulo extends CalculoArea {
	
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea() {
		setArea((base * altura) / 2);																;
	}
	
}
