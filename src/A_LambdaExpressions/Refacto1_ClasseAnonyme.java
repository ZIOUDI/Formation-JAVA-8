package A_LambdaExpressions;

 

interface Instrument2 {
void jouer();
}

/*interface Instrument {
    void jouer();
 }
*/

/* class Saxophone implements Instrument {
	@Override
	public void jouer() {
		System.out.println("ALLO ... ALLO ... Inerface ...");		
	}
}  */

public class Refacto1_ClasseAnonyme {
	
	public static void main(String[] args) {
		Instrument2 instrument1;
		//instrument1 = new Saxophone();
		
		instrument1 = new Instrument2()  //Instanciation - classe anonyme interne
		{
			@Override
			public void jouer() {
				System.out.println("ALLO ... ALLO ... Classe anonyme ...");				
			}
 		 		
		};
		
		instrument1.jouer();  // Utilisation
	}	
 	
}
