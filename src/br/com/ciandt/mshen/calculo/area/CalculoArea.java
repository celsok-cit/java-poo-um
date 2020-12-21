package br.com.ciandt.mshen.calculo.area;

public class CalculoArea {
    private double area;

    public double getArea() {
	return area;
    }

    public void setArea(double area) {
	this.area = area;
    }

    public void calcularArea(int base, int altura) {
	this.setArea(0);
    }
}
