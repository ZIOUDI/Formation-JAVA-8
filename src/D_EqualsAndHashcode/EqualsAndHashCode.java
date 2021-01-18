package D_EqualsAndHashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualsAndHashCode {
	
	/*
	 * The equals()method :
	 *  is designed to compare two objects semantically (by comparing the data members of the class),
	 *  
	 *  the == operator :
	 *   compares two objects technically (by comparing their references i.e. memory addresses).
	 *   
	 *   
	 *   
	 *   hashCode() :
	 *   in the Object class returns an integer number which is the memory address of the object.
	 * 
	 * 
	 *   equals () est remplacée, la méthode hashCode () doit également être remplacée.
	 *   
	 *   Si deux objets sont égaux, leurs codes de hachage doivent également être égaux.
	 *   Si deux objets ne sont pas égaux, il n'y a aucune contrainte sur leurs codes de hachage
	 *   
	 *   
	 *   Si deux objets ont des codes de hachage identiques, il n'y a aucune contrainte sur leur égalité (ils peuvent être égaux ou non).
	 *   Si deux objets ont des codes de hachage différents, ils ne doivent pas être égaux.
	 *   
	 *   
	 */
	
	
	public static void main(String[] args) {
		
		///////////////////////////////////////////////////////////////////////
		//////////////  equals()  ///////////////
		///////////////////////////////////////////////////////////////////////
		System.out.println("............  String comparison    ........... ... " );  
		String s1 = new String("This is a string");
		String s2 = new String("This is a string");
		 
		boolean refEqual = (s1 == s2);
		boolean secEqual = (s1.equals(s2));
		 
		System.out.println("s1 == s2: " + refEqual); //reference ?
		System.out.println("s1.equals(s2): " + secEqual); // valeur
		
		
		System.out.println("............   compare 2 Students object    ........... ... " );  

		Student student1 = new Student("123", "Tom", "tom@gmail.com", 30);
		Student student2 = new Student("123", "Tom", "tom@gmail.com", 30);
		Student student3 = new Student("456", "Peter", "peter@gmail.com", 23);
		 
		System.out.println("student1 == student2: " + (student1 == student2)); // false
		System.out.println("student1.equals(student2): " + (student1.equals(student2))); // true
		System.out.println("student2.equals(student3): " + (student2.equals(student3))); // false

		System.out.println("............compares only the ID attribute of two Student ........... ... " );  
		List<Student> listStudents = new ArrayList<>();
		listStudents.add(student1); // id =123
		listStudents.add(student2); // id=123
		listStudents.add(student3); // id = 456
		
		Student searchStudent1 = new Student("123");
		Student searchStudent4 = new Student("789");
		
		boolean found1 = listStudents.contains(searchStudent1);
		boolean found4 = listStudents.contains(searchStudent4);
		 
		System.out.println("Found student1: " + found1); // true 
		System.out.println("Found student4: " + found4); // false
		
		System.out.println("............ search a Student in a List with equals()   ........... ... " );  
		boolean existe1 = searchStudent(listStudents, "123");
		boolean existe2 = searchStudent(listStudents, "456");
		boolean existe3 = searchStudent(listStudents, "789");
		
		System.out.println("123 existe : " + existe1); // true
		System.out.println("456 existe : " + existe2); // true
		System.out.println("789 existe : " + existe3); // false
		
		///////////////////////////////////////////////////////////////////////
		//////////////////////////////  hashCode()  ///////////////////////////
		///////////////////////////////////////////////////////////////////////
		System.out.println(".................................................... ... " );  
		System.out.println("..................... hashCode()   ................. ... " );  
		System.out.println(".................................................... ... " );  

		System.out.println(".......... table de hachage :   Hashtable, HashSet and HashMap ............. " );  

		Set<Student> setStudents = new HashSet<Student>();
		 
		setStudents.add(student1);
		setStudents.add(student2);
		setStudents.add(student3);
		
		System.out.println("............ HashSet() before hashCode() implementation   ........... ... " );  
		setStudents.forEach(student -> System.out.println(student)); // output : 3 lines
		
		System.out.println("............ HashSet() after hashCode() implementation   ........... ... " );  
		setStudents.forEach(student -> System.out.println(student)); // output : 2 lines

		
 
	}
	
	public static boolean searchStudent(List<Student> listStudents, String id) {
	    for (Student student : listStudents) {
	        if (student.getId().equals(id)) {
	            return true;
	        }
	    }
	 
	    return false;
	}

}
