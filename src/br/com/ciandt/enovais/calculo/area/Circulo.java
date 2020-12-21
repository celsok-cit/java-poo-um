package br.com.ciandt.enovais.calculo.area;

public class Circulo extends CalculoArea{
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public void calcularArea() {
		setArea((Math.PI * Math.pow(this.raio, 2)));
	}
	
	
}
