package br.com.ciandt.jwillian.calculo.area;

public class Quadrado extends CalculoArea {
	
	// metodo para calcular a area do quadrado
	public void calcQuadrado (double lado) {
		setArea(Math.pow(lado, 2));
		System.out.println("Area do quadrado = " + getArea());
		
	}	

}
