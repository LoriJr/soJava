package app;

import java.util.Locale;
import java.util.Scanner;

import entitites.Circle;
import entitites.Rectangle;
import entitites.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("TRIANGLE DATA");
		System.out.print("side #1: ");
		double side1 = sc.nextDouble();
		System.out.print("side #2: ");
		double side2 = sc.nextDouble();
		System.out.print("side #3: ");
		double side3 = sc.nextDouble();
		
		System.out.print("base: ");
		double baseTriangle = sc.nextDouble();
		System.out.print("height: ");
		double heightTriangle = sc.nextDouble();
		
		Triangle triangle = new Triangle(side1, side2, side3, baseTriangle, heightTriangle);
		System.out.println();
		
	    System.out.println("RECTANGLE DATA");
	    System.out.print("height: ");
	    double heightRectangle = sc.nextDouble();
	    System.out.print("width: ");
	    double widhtRectangle = sc.nextDouble();
	    
	    Rectangle rectangle = new Rectangle(heightRectangle, widhtRectangle);
	    System.out.println();
	    
	    System.out.println("CIRCLE DATA");
		System.out.print("radius: ");
		double radius = sc.nextDouble();
		
		Circle circle = new Circle(radius);
	    
	    System.out.println();
		System.out.println("TRIANGLE");
		System.out.println("Triangle perimeter: " + triangle.calcularPerimetro());
		System.out.println("Triangle area: " + triangle.calcularArea());
		System.out.println();
		System.out.println("RECTANGLE");
		System.out.println("Rectangle perimeter: " + rectangle.calcularPerimetro());
		System.out.println("Rectangle area: " + rectangle.calcularArea());
		System.out.println();
		System.out.println("CIRCLE");
		System.out.println("Circle perimeter: " + String.format("%.2f", circle.calcularPerimetro()));
		System.out.println("Circle area: " + String.format("%.2f", circle.calcularArea()));
		
				
		sc.close();
		
		
	}

}
