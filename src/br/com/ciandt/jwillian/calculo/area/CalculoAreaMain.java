package br.com.ciandt.jwillian.calculo.area;

public class CalculoAreaMain {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		
		retangulo.calcRetangulo(8, 2);
		quadrado.calcQuadrado(10);
		circulo.calcCirculo(5);
		triangulo.calcTriangulo(12,5);
	}

}
