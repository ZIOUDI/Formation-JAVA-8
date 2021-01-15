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

/* Pour g�n�rer une exception, il suffit d'utiliser le mot cl� throw,
 *  suivi d'un objet dont la classe d�rive de Throwable.
 * Si l'on veut g�n�rer une exception dans une m�thode avec throw,
 *  il faut l'indiquer dans la d�claration de la m�thode, en utilisant le mot cl� throws. */
 

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
