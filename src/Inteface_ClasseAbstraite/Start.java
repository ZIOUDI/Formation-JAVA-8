package Inteface_ClasseAbstraite;

import java.awt.Point;
import java.util.ArrayList;

public class Start {

    public static void main( String [] args ) {
        
    	// Une classe abstraite ne peut pas être instanciée !
        //Shape shape = new Shape(); 
    	
             
            ArrayList<Shape> shapes = new ArrayList<>();
            
            shapes.add( new Circle( new Point( 5, 5 ), 1 ) );
            shapes.add( new Square( new Point( 1, 1 ), -2 ) );
            shapes.add( new Circle() );
            
            for( Shape shape : shapes ) {
                System.out.println( shape.perimeter() );
            }
            
           
    }
    
}