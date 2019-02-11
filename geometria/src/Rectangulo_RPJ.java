
/**
 * @author Rafa Piñol
 * @version 1.2
 *
 */
public class Rectangulo_RPJ extends FiguraGeometrica_RPJ {
	private double l1;
	private double l2;
	
	/**
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_RPJ(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	
	 * @return devuelve el area del rectángulo
	 */

	@Override
	public double area() {
		return l1 * l2;
	}
/**
	
	 * @return devuelve el perímetro del rectángulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
