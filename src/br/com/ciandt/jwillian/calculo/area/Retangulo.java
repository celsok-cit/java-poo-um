package br.com.ciandt.jwillian.calculo.area;

public class Retangulo extends CalculoArea {
	
	    // metodo para calcular a area do Retangulo
		public void calcRetangulo (double base, double altura) {
			setArea(base * altura);
			System.out.println("Area retangulo = " + getArea());
		}
}
