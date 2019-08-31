package br.com.ciandt.thiagodf.calculo.area;

/**
 * Class Quadrado.
 * Extends Calculo Area.
 * 
 * @author thiagodf
 *
 */
public class Quadrado extends CalculoArea {
	
	/**
	 * Recebe os valores do eixo x e y depois faz o calculo.
	 * x + y = xy 
	 * 
	 * @param xy
	 */
	public void calculoQuadrado(double xy) {
		
		// setArea com o eixo xy.
		this.setArea(Math.pow(xy, 2));
		
		System.out.println("Area do quadrado = " + this.getArea());
	}

}
