package br.com.ciandt.mshen.calculo.area;

public class CalculoAreaMain extends CalculoArea {

    public static void main(String[] args) {
	CalculoQuadrado quadrado = new CalculoQuadrado();
	quadrado.calcularArea(3, 3);
	System.out.println(quadrado.getArea());

	CalculoRetangulo retangulo = new CalculoRetangulo();
	retangulo.calcularArea(2, 2);
	System.out.println(retangulo.getArea());

	CalculoTriangulo triangulo = new CalculoTriangulo();
	triangulo.calcularArea(2, 2);
	System.out.println(triangulo.getArea());

	CalculoCirculo circulo = new CalculoCirculo();
	circulo.calcularArea(2, 3.14);
	System.out.println(circulo.getArea());
    }

}
