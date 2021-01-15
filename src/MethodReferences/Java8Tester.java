package MethodReferences;

import java.util.List;
import java.util.ArrayList;

public class Java8Tester {
	public static void main(String args[]) {
		List<String> names = new ArrayList<String>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");

		names.forEach(System.out::println);
	}
}

/*
 * Method references help to point to methods by their names. 
 * A method reference  is described using "::" symbol.
 *  A method reference can be used to point the following types of methods 
 *  − Static methods
 *  - Instance methods
 *  -  Constructors using new operator (TreeSet::new)
 *  
 *  Here we have passed System.out::println method as a static method reference.
 */
