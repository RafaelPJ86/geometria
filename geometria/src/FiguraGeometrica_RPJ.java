
public abstract class FiguraGeometrica_RPJ {
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}

	protected String tipoFigura;

	public FiguraGeometrica_RPJ(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract double area();
	
	public abstract double perimetro();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

}
