package A_LambdaExpressions;

 
interface Instrument1 {
void jouer();
}


class Saxophone implements Instrument1 {
	@Override
	public void jouer() {
		System.out.println("ALLO ... ALLO ... ALLO ...");		
	}
}

public class ApprocheClassiqueInterface {
	
	public static void main(String[] args) {
		Instrument1 instrument1;
		instrument1 = new Saxophone();
		instrument1.jouer();
	}
	
	//Le codage de la classe Saxophone a été nécessaire pour pouvoir utiliser l’interface Instrument…!
	
}
