package A_LambdaExpressions;

  

interface Instrument6 {

String  jouer(String param ,int val);

} 

public class Refacto4_ExpressionLambdaAvecParamAndReturnValue {
	
	public static void main(String[] args) {	
		Instrument6  instrument;		
		  instrument =  (String param , int val) -> {
			  System.out.println("ALLO ... Refacto 2 Param ="+param +"and : "+ val);	
			  return "Bravo ! Excellente interpretation" ;
		  };
		                                   				 		   	
		String retour = instrument.jouer("Lambda", 5);  // Utilisation
		System.out.println( retour);
		
	}		
}
