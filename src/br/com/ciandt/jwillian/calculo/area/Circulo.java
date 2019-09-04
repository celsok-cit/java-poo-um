package br.com.ciandt.jwillian.calculo.area;

public class Circulo extends CalculoArea {
	
	 	//Polimorfismo de metodo da classe CalculoArea
	 	
		@Override
		public double calculaArea (double x, double y) {
			return Math.PI * (x * y);
			
	}	
}
	