package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class C_ManipulationMap {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////
		/////////// 1. Overview of Set Collection ////////
		/////////////////////////////////////////////////////////////////

		/*
		 * Duplicate elements are not allowed. Elements are not stored in order.
		 * 
		 * Why and When Use Sets? You want to store elements distinctly without
		 * duplication, or unique elements. You don’t care about the order of elements
		 * 
		 */

		///////////////////////////////////////////////////////////////////////
		////////////// 2. Set Implementations //////////////////
		///////////////////////////////////////////////////////////////////////

		/*
		 * HashSet: is the best-performing implementation and is a widely-used Set
		 * implementation. It represents the core characteristics of sets: no
		 * duplication and unordered. 
		 * 
		 * LinkedHashSet: This implementation orders its
		 * elements based on insertion order. So consider using a LinkedHashSet when you
		 * want to store unique elements in order. 
		 * 
		 * TreeSet: This implementation orders
		 * its elements based on their values, either by their natural ordering, or by a
		 * Comparator provided at creation time.
		 */

		///////////////////////////////////////////////////////////////////////
		////////////// 3. Creating a new Set       //////////////////
		///////////////////////////////////////////////////////////////////////
		
		Set<Integer> numbers = new HashSet<>();
		Set<String> names = new LinkedHashSet<>();
		//create a Set from an existing collection
		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println(listNumbers);
		Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
		System.out.println(uniqueNumbers);
		
		//use stream with filter and collection functions to return a Set from a collection
		Set<Integer> uniqueOddNumbers = listNumbers.stream()
			    .filter(number -> number % 2 != 0).collect(Collectors.toSet());		 
	    System.out.println(uniqueOddNumbers);
	    
	    
	    Set<String> bigNames = new HashSet<>(1000); // 16 by default

		
		
		///////////////////////////////////////////////////////////////////////
		////////////// 4. Performing Basic Operations on a Set  //////////////////
		//////////////////////////////////////////////////////////////////////

	    // Adding elements to a Set: The add()method returns true/false
	    Set<String> names4 = new HashSet<>();
	    names4.add("Tom");
	    names4.add("Mary");
	     
	    if (names4.add("Peter")) { // true
	        System.out.println("Peter is added to the set");
	    }
	     
	    if (!names4.add("Tom")) { // false
	        System.out.println("Tom is already added to the set");
	    }
	    
	    // Removing an element from a Set:   true/false ?
	    if (names4.remove("Mary")) {   
	        System.out.println("Marry is removed");
	    }
	    
	    // Check if a Set is empty:   true/false ?
	    if (names.isEmpty()) {
	        System.out.println("The set is empty");
	    } else {
	        System.out.println("The set is not empty");
	    }
	    
	    // Remove all elements from a Set:
	    names.clear();
	    
	    if (names.isEmpty()) {
	        System.out.println("The set is empty");
	    }
	    
	    // Get total number of elements in a Set:
	    Set<String> names44 = new HashSet<>();
	    names44.add("Tom");
	    names44.add("Mary");
	    names44.add("Peter");
	    names44.add("Alice");
	     
	    System.out.printf("The set has %d elements", names44.size());
        System.out.println("-");


	
	    
		///////////////////////////////////////////////////////////////////////
		//////////////   5. Iterating over elements in a Set    ///////////////
		///////////////////////////////////////////////////////////////////////

        // Using an iterator:
	    Set<String> names5 = new HashSet<>();
	    names5.add("Tom");
	    names5.add("Mary");
	    names5.add("Peter");
	    names5.add("Alice");
	     
	     
	    Iterator<String> iterator = names5.iterator();
        System.out.println("-----------------Iterating Using an iterator--------------");

	    while (iterator.hasNext()) {
	        String name = iterator.next();
	        System.out.println(name);
	    }
 	    
	    // Using the enhanced for loop:
	    System.out.println("-----------------Iterating Using enhanced for loop--------------");
	    for (String name : names5) {
	        System.out.println(name);
	    }
	    // Using the forEach() method with Lambda expression
	    System.out.println("-----------------  Iterating Using forEach()  --------------");
	    names5.forEach(System.out::println);

		///////////////////////////////////////////////////////////////////////
		//////////////  6. Searching for an element in a Set    ///////////////
		///////////////////////////////////////////////////////////////////////
		//
	    Set<String> names6 = new HashSet<>();
	    System.out.println("-----------------  Searching Using  contains(Object)  --------------");
	    names6.add("Tom");
	    names6.add("Mary");
	    names6.add("Peter");
	    names6.add("Alice");
	     
	    if (names6.contains("Mary")) {
	        System.out.println("Found Mary");
	    }

	    
	    
		/////////////////////////////////////////////////////////////////////////////
		////////////// 7. Performing Bulk Operations between two Sets ///////////////
		/////////////////////////////////////////////////////////////////////////////
	    
	    System.out.println("----------------------   Subset operation  --------------------");
	    Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
	    Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));
	     
	    if (s1.containsAll(s2)) {
	        System.out.println("s2 is a subset of s1");
	    }
	    
	    System.out.println("-----------------------   Union operation   --------------------");

	    Set<Integer> s71 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
	    Set<Integer> s72 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
	     
	    System.out.println("s1 before union: " + s71);
	     
	    s71.addAll(s72);
	     
	    System.out.println("s1 after union: " + s71);
	    
	    System.out.println("--------------------- Intersection operation  -------------------");
	    Set<Integer> s73 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
	    Set<Integer> s74 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
	     
	    System.out.println("s1 ---------- : " + s73);
	    System.out.println("s2 ---------- : " + s74);
	     
	    s73.retainAll(s74);
	     
	    System.out.println("Intersection  : " + s73);
	    
	    System.out.println("------------------   Set difference operation  -----------------");
	    
	    Set<Integer> s75 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
	    Set<Integer> s76 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
	     
 	    System.out.println("s1 ---------- : " + s75);
	    System.out.println("s2 ---------- : " + s76);
	    s75.removeAll(s76);
	         
	    System.out.println(" difference   : " + s75);

		/////////////////////////////////////////////////////////////////////////////
		//////////////////////      8. Concurrent Sets           ////////////////////
		/////////////////////////////////////////////////////////////////////////////
	    

	}
}
