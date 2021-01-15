package Inteface_ClasseAbstraite;

import java.awt.Point;

public class Circle extends Shape {

	// Begin of the class: attributes, constructors, properties, ...
    
    
    private double radius;

	public Circle(Point point, int i) {
		// TODO Auto-generated constructor stub
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override 
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override 
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

}