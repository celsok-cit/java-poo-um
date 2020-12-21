package br.com.ciandt.mshen.calculo.area;

public class CalculoTriangulo extends CalculoArea {
    public void calcularArea(int base, int altura) {
	this.setArea((base * altura) / 2);
    }

}
