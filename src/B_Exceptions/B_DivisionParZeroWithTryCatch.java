package B_Exceptions;

public class B_DivisionParZeroWithTryCatch {
	public static void main(String[] args) {
		int a =5;
		int b = 0;
		
		try {
			
			System.out.println("Resultat de la div par 0 : "+ a/b); 
			System.out.println("Instruction suite � la division ... " ); // pas ex�cut�e !!!!
			
		} catch (Exception e) {
			
			System.out.println("Une Exception est declech�e : ArithmeticException  " ); 

		}
		
		System.out.println("Instruction suite � la fin ... " ); //  OK execut�e
		 
	}

}
