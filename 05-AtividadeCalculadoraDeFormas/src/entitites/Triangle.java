package entitites;

import services.FormaGeometrica;

public class Triangle implements FormaGeometrica {

	private Double side1, side2, side3;
	private Double base;
	private Double height;
		
	public Triangle(Double side1, Double side2, Double side3, Double base, Double height) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.base = base;
		this.height = height;
	}

	@Override
	public double calcularArea() {
		return base * height / 2;
	}

	@Override
	public double calcularPerimetro() {
		return side1 + side2 + side3;
	}

}
