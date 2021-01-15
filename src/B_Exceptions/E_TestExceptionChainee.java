package B_Exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class MonException extends Exception {
	public MonException() {
		super();
	}

	public MonException(String s, IOException e) {
		super(s);
		System.out.println(" Appel MonException !!! ");
	}
}
public class E_TestExceptionChainee {

	public static void main(String[] args) {
		try {
			String donnees = lireFichier();
			System.out.println("donnees=" + donnees);
		} catch (MonException e) {
			e.printStackTrace();
			//La méthode getCause() héritée de Throwable permet d'obtenir l'exception originale.
			System.out.println(e.getCause().getMessage());
		}
	}

	public static String lireFichier() throws MonException {
		File fichier = new File("C:/Users/Smile/Desktop/tests.txt");
		FileReader reader = null;

		StringBuffer donnees = new StringBuffer();

		try {
			reader = new FileReader(fichier);
			char[] buffer = new char[2048];
			int len;
			while ((len = reader.read(buffer)) > 0) {
				donnees.append(buffer, 0, len);
			}
		} catch (IOException e) {
			throw new MonException("Impossible de lire le fichier", e);
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return donnees.toString();
	}
}