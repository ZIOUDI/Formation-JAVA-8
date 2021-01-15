package A_LambdaExpressions;
 


interface Instrument4 {
void jouer();
}

/* class Saxophone implements Instrument {
	@Override
	public void jouer() {
		System.out.println("ALLO ... ALLO ... Inerface ...");		
	}
}  */

public class Refacto3_ExpressionLambdaUneligne {
	
	public static void main(String[] args) {
		Instrument4 instrument;
		//instrument1 = new Saxophone();
		
		/* instrument1 =  () -> {
				System.out.println("ALLO ... ALLO ... Refacto 3 ExpressionLambda Une ligne ...");					 		
		}; */
		
		instrument =  () -> System.out.println("ALLO ... ALLO ... Refacto 3 ExpressionLambda Une ligne ...");					 		   
		
		instrument.jouer();  // Utilisation
	}		
}
