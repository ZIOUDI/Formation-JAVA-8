package B_Exceptions;

public class C_ThrowableClassMethodes {
		
	public static void main(java.lang.String[] args) {
		
	    // Insert code to start the application here.
	    int i = 3;
	    int j = 0;
	    
	    try {
	      System.out.println("résultat = " + (i / j));
	    } catch (ArithmeticException e) {
	    	
 	      System.out.println("getmessage : "+e.getMessage());
 	      
  	      System.out.println("toString : "+e.toString());
  	      
 	      System.out.println("methode : printStackTrace :");
 	      
	      e.printStackTrace();
	    }
	  }

}


