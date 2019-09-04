package br.com.ciandt.joycelf.calculo.area;

public class FiguraGeometrica {
	private double sideA;
	private double sideB;

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double area() {
		return sideA * sideB;
	}
}
