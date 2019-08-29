package br.com.ciandt.jwillian.calculo.area;

public class Circulo extends CalculoArea {
	
	// metodo para calcular a area do circulo
		public void calcCirculo (double raio) {
			setArea(Math.PI * (Math.pow(raio, 2)));
			System.out.println("Area do circulo = " + df.format(getArea()));	
	}
}
