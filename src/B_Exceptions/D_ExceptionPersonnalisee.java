package B_Exceptions;

class SaisieErroneeException extends Exception {
	public SaisieErroneeException() {
		super();
	}

	public SaisieErroneeException(String s) {
		super(s);
		System.out.println(" Appel SaisieErroneeException !!! ");
	}
}

/* Pour générer une exception, il suffit d'utiliser le mot clé throw,
 *  suivi d'un objet dont la classe dérive de Throwable.
 * Si l'on veut générer une exception dans une méthode avec throw,
 *  il faut l'indiquer dans la déclaration de la méthode, en utilisant le mot clé throws. */
 

public class D_ExceptionPersonnalisee {

	public static void controle(String chaine) throws SaisieErroneeException {
		if (chaine.equals("") == true)
			throw new SaisieErroneeException("Saisie erronee : chaine vide");
	}

	public static void main(java.lang.String[] args) {

		try {
			controle("bonjour");
		} catch (SaisieErroneeException e) {
			System.out.println("Chaine1 saisie erronee");
		}

		try {
			controle("");
		} catch (SaisieErroneeException e) {
			System.out.println("Chaine2 saisie erronee");
		}
	}
}
