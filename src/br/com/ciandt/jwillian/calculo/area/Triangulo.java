package br.com.ciandt.jwillian.calculo.area;

public class Triangulo extends CalculoArea {
	
	//Polimorfismo de metodo da classe CalculoArea
		
	@Override	
	public double calculaArea (double x, double y) {
		return (x * y) / 2;
	}
}
