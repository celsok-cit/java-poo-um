package br.com.ciandt.joycelf.calculo.area;

public class CalculoAreaMain {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo(5, 10);
		double areaTriangulo =  triangulo.area();
		
		System.out.println("Triângulo: " + areaTriangulo);
		
		Quadrado quadrado = new Quadrado(10);
		double areaQuadrado =  quadrado.area();
		
		System.out.println("Quadrado: " + areaQuadrado);
		
		Retangulo retangulo = new Retangulo(5, 10);
		double areaRetangulo =  retangulo.area();
		
		System.out.println("Retângulo: " + areaRetangulo);
		
		Circulo circulo = new Circulo(10);
		double areaCirculo =  circulo.area();
		
		System.out.println("Circulo: " + areaCirculo);

	}

}
