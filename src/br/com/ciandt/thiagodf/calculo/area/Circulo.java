package br.com.ciandt.thiagodf.calculo.area;

public class Circulo extends CalculoArea {

	public void calculoCirculo(double raio) {
		
		this.setArea(Math.PI * (Math.pow(raio, 2)));
		
		System.out.println("Area do Círculo = " + this.getArea());
		
	}

}
