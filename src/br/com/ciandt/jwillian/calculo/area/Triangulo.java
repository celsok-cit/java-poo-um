package br.com.ciandt.jwillian.calculo.area;

public class Triangulo extends CalculoArea {
	
	    // metodo para calcular a area do Triangulo
		public void calcTriangulo (double base, double altura) {
			setArea((base*altura)/2);
			System.out.println("Area do triangulo: " + getArea());
		}
}
