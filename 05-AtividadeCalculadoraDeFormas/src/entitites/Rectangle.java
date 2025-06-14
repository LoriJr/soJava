package entitites;

import services.FormaGeometrica;

public class Rectangle implements FormaGeometrica{

	private Double height;
	private Double width;
	
		
	public Rectangle(Double height, Double width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double calcularArea() {
		return height * width;
	}
	@Override
	public double calcularPerimetro() {
		return 2 * (height + width);
	}
	
	
}
