package br.com.ciandt.jwillian.calculo.area;

import java.text.DecimalFormat;

public class CalculoAreaMain {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
		
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Area do retangulo = " + retangulo.calculaArea(7, 7));
		System.out.println("Area do quadrado = " + quadrado.calculaArea(10, 10));
		System.out.println("Area do circulo = " + df.format(circulo.calculaArea(5,5)));
		System.out.println("Area do triangulo = " + triangulo.calculaArea(5, 5));
	}

}
