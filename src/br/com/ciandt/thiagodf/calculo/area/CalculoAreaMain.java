package br.com.ciandt.thiagodf.calculo.area;

/**
 * Class Calculo Area Main.
 * 
 * @author thiagodf
 *
 */
public class CalculoAreaMain extends CalculoArea {
	
	/**
	 * Recebe os paramentros o calculo.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Area figuras geométricas:
		// Quadrado
		Quadrado quadrado = new Quadrado();
		quadrado.calculoQuadrado(5);
		
		// Retangulo
		Retangulo retangulo = new Retangulo();
		retangulo.calculoRetangulo(4, 6);
		
		// Triangulo
		Triangulo triangulo = new Triangulo();
		triangulo.calculoTriangulo(2, 3);
		
		// Circulo
		Circulo circulo = new Circulo();
		circulo.calculoCirculo(5);
		
	}

}