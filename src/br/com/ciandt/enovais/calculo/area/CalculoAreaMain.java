package br.com.ciandt.enovais.calculo.area;

public class CalculoAreaMain {

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado(10);
		Retangulo r1 = new Retangulo(10, 20);
		Circulo c1 = new Circulo(8);
		Triangulo t1 = new Triangulo(18, 6);
		
		q1.calcularArea();
		r1.calcularArea();
		c1.calcularArea();
		t1.calcularArea();
		
		System.out.println("A �rea do quadrado 1 �: " + q1.getArea());
		System.out.println("A �rea do ret�ngulo 1 �: " + r1.getArea());
		System.out.println("A �rea do circulo 1 �: " + c1.getArea());
		System.out.println("A �rea do tri�ngulo 1 �: " + t1.getArea());
		
	}

}
