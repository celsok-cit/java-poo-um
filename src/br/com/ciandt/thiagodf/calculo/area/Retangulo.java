package br.com.ciandt.thiagodf.calculo.area;

/**
 * Class Retangulo.
 * Extends Calculo Area.
 * 
 * @author thiagodf
 *
 */
public class Retangulo extends CalculoArea {
	
	/**
	 * Recebe os valores do eixo x e y depois faz o calculo.
	 * 
	 * @param x
	 * @param y
	 */
	public void calculoRetangulo(double x, double y) {
		
		// setArea com o eixo x vezes y.
		this.setArea(x * y);
		
		// print o resultado.
		System.out.println("Area do Retângulo = " + this.getArea());
	}

}
