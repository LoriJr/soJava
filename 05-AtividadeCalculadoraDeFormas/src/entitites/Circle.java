package entitites;

import services.FormaGeometrica;

public class Circle implements FormaGeometrica {

	private Double radius;
			
	public Circle(Double radius) {
		this.radius = radius;
	}

	@Override
	public double calcularArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * radius;
	}

}
