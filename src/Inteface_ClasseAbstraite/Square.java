package Inteface_ClasseAbstraite;

import java.awt.Point;

public class Square extends Shape {

    private int length;

	// Begin of the class: attributes, constructors, properties, ...
    
    
   public Square(Point point, int i) {
		// TODO Auto-generated constructor stub
	}

@Override 
   public double area() {
       return this.length * this.length;
   }

   @Override 
   public double perimeter() {
       return 4 * length;
   }

}