package br.com.ciandt.joycelf.calculo.area;

public class Circulo extends FiguraGeometrica  {
	private static final double pi = 3.14;
	private double radius;
	
	public Circulo(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return pi*Math.pow(radius, 2);
	}
}
