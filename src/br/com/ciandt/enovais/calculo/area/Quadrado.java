package br.com.ciandt.enovais.calculo.area;

public class Quadrado extends CalculoArea {
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public void calcularArea() {
		setArea(Math.pow(lado, 2));
	}
}
