package br.com.ciandt.jwillian.calculo.area;

import java.text.DecimalFormat;

public class CalculoArea {
	
	DecimalFormat df = new DecimalFormat();
	
	// Atributos da classe CalculoArea
	private double area;
	
	// Metodo set
	public void setArea (double area) {
		this.area = area;
	}
	
	// Metodo get
	public double getArea () {
		return this.area;
	}
}	

