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
		
		System.out.println("A área do quadrado 1 é: " + q1.getArea());
		System.out.println("A área do retângulo 1 é: " + r1.getArea());
		System.out.println("A área do circulo 1 é: " + c1.getArea());
		System.out.println("A área do triângulo 1 é: " + t1.getArea());
		
	}

}
