package A_LambdaExpressions;


interface Instrument3 {
void jouer();
}
/* class Saxophone implements Instrument {
	@Override
	public void jouer() {
		System.out.println("ALLO ... ALLO ... Inerface ...");		
	}
}  */

public class Refacto2_ExpressionLambdaMultiligne {
	
	public static void main(String[] args) {
		Instrument3 instrument;
		//instrument1 = new Saxophone();
		
		instrument = /* new Instrument()  //Instanciation - classe anonyme interne
		{
			@Override
			public void jouer */() -> {
				System.out.println("ALLO ... ALLO ... Refacto 2 ExpressionLambdaMultiligne ...");				
			//}			
		};
		
		instrument.jouer();  // Utilisation
	}	
 	
}
