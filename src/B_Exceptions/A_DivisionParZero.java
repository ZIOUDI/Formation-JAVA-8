package B_Exceptions;

public class A_DivisionParZero {
	public static void main(String[] args) {
		int a =5;
		int b = 0;
		System.out.println("Resultat de la div par 0 : "+ a/b); // java.lang.ArithmeticException: / by zero
	}

}
