package B_Exceptions;

public class B_DivisionParZeroWithTryCatch {
	public static void main(String[] args) {
		int a =5;
		int b = 0;
		
		try {
			
			System.out.println("Resultat de la div par 0 : "+ a/b); 
			System.out.println("Instruction suite à la division ... " ); // pas exécutée !!!!
			
		} catch (Exception e) {
			
			System.out.println("Une Exception est declechée : ArithmeticException  " ); 

		}
		
		System.out.println("Instruction suite à la fin ... " ); //  OK executée
		 
	}

}
