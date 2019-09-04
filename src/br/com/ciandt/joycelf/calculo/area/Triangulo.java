package br.com.ciandt.joycelf.calculo.area;

public class Triangulo extends FiguraGeometrica {
	private double base;
	private double height;
	
	public Triangulo(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		return (this.base*this.height)/2;
	}
}
