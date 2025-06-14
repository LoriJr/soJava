package model.entities;

import model.enums.*;

public abstract class Shape {
	
	private Color color;

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();	

}
