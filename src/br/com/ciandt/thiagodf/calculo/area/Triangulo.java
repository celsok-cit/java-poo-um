package br.com.ciandt.thiagodf.calculo.area;

/**
 * Class Triangulo.
 * Extends Calculo Area.
 * 
 * @author thiagodf
 *
 */
public class Triangulo extends CalculoArea {
	
	/**
	 * Recebe os valores do eixo x e y depois faz o calculo.
	 * 
	 * @param x
	 * @param y
	 */
	public void calculoTriangulo(double x, double y) {
		
		// setArea com o eixo x vezes y e divide por 2. 
		this.setArea((x * y) / 2);
		
		// print o resultado.
		System.out.println("Area do Triângulo = " + this.getArea());
	}
	
}
