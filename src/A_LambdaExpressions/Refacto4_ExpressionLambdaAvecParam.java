package A_LambdaExpressions;

  

interface Instrument5 {

void jouer(String param);

}


public class Refacto4_ExpressionLambdaAvecParam {
	
	public static void main(String[] args) {
	
		Instrument5  instrument;
		
		  instrument =  (String param) -> System.out.println("ALLO ... Refacto 4 Param ="+param);					 		   
		
		instrument.jouer("Lambda");  // Utilisation
		
	}		
}
