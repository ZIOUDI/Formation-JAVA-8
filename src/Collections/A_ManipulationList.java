package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class A_ManipulationList {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		List<String> listStringsArrayList = new ArrayList<String>();
		listStringsArrayList.add("One");
		listStringsArrayList.add("Two");
		listStringsArrayList.add("Three");
		listStringsArrayList.add("Four");
		System.out.println("ArrayList : "+ listStringsArrayList);
		
		List<String> listStringsLinkedList = new LinkedList<String>();
		listStringsLinkedList.add("Five");
		listStringsLinkedList.add("Six");
		listStringsLinkedList.add("Seven");
		listStringsLinkedList.add("Eight");
		System.out.println("LinkedList : "+ listStringsLinkedList);
		
		/*  Creating a new list    */
		List<Object> listAnything = new ArrayList<Object>();
		List<String> listWords = new ArrayList<String>();
		List<Integer> listNumbers1 = new ArrayList<Integer>();
		List<String> linkedWords1 = new LinkedList<String>();
		
		/* Since Java 7, we can remove the type parameter on the right side  */
		List<Integer> listNumbers2 = new ArrayList<>();
		List<String> linkedWords2 = new LinkedList<>();
		
		/* Since Java 9, you can create a List collection from a fixed set   */
		List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);
		
		/* Since Java 10, you can shorten the declaration of a List collection by using the var   */
		//var employees = new ArrayList<Employee>();
		
		/*   if we know that a list contains around 1000 elements */
		List<Integer> listNumbers3 = new ArrayList<>(1000);
		
		/* construct a list that takes elements from an existing collection */
		List<Integer> listNumberOne =  List.of(1, 2, 3, 4, 5, 6);  // existing collection
		List<Integer> listNumberTwo = new ArrayList<>(listNumberOne);
		
		/*
		 * -------------------------------------------------------------------
		 * Basic List operations: adding, retrieving, updating, removing elements
		 * -------------------------------------------------------------------
		 */
		
		 /* ------------------  Adding elements to a List: ------------------------------ */
		List<String> listStrings = new ArrayList<String>();
		// OK to add Strings:
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		// But this will cause compile error
		// listStrings.add(123);  NOOOOOOOO
		
		//Adding elements of sub types of the declared type
		List<Number> linkedNumbers = new LinkedList<>();
		linkedNumbers.add(new Integer(123));
		linkedNumbers.add(new Float(3.1415));
		linkedNumbers.add(new Double(299.988));
		linkedNumbers.add(new Long(67000));
		
		//insert an element into the list at a specified index
		listStrings.add(1, "Four");
		
		//add all elements of an existing collection
		listStrings.addAll(listWords);
		
		//add the elements to the list at a specified position
		listStrings.addAll(2, listWords);
		
		 /* --------------------    Retrieving elements from a List      ------------------- */
		String element = listStrings.get(1);
		Number number = linkedNumbers.get(3);
		
		//For a LinkedListimplementation, we can get the first and the last elements
		LinkedList<Number> numbers = new LinkedList<Number>();		 
		Number first = numbers.getFirst();
		Number last = numbers.getLast();
		
		 /* -----------------       Updating elements in a List    ----------------------- */
		listStrings.set(2, "Hi");
		
		/* ------------------  Removing elements from a List        ------------------------*/
		// Remove the element at the 3rd position in the list
		listStrings.remove(2);
		// Remove the String element “Two” in the list
		listStrings.remove("Two");
		
		
		/////////////////////////////////////////////////////////////////
		///////////    4. Iterating over elements in a list     ////////
		///////////////////////////////////////////////////////////////
		
		for (String elt : listStrings) {
		    System.out.println(elt);
		}
		
		Iterator<String> iterator = listStrings.iterator();
		while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		}
		
		Iterator<Number> iterator2 = linkedNumbers.listIterator();
		while (iterator2.hasNext()) {
		    System.out.println(iterator.next());
		}
		
		
		/////////////////////////////////////////////////////////////////
		///////////    5. Searching for an element in a list     ////////
		///////////////////////////////////////////////////////////////
		
		if (listStrings.contains("Hello")) {
		    System.out.println("Found the element");
		} else {
		    System.out.println("There is no such element");
		}
		int firstIndex = linkedNumbers.indexOf(1234);
		int lastIndex = listStrings.lastIndexOf("Hello");
		
		
	}
}


