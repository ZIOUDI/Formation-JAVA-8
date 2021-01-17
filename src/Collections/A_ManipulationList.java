package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		System.out.println("ArrayList : " + listStringsArrayList);

		List<String> listStringsLinkedList = new LinkedList<String>();
		listStringsLinkedList.add("Five");
		listStringsLinkedList.add("Six");
		listStringsLinkedList.add("Seven");
		listStringsLinkedList.add("Eight");
		System.out.println("LinkedList : " + listStringsLinkedList);

		/* Creating a new list */
		List<Object> listAnything = new ArrayList<Object>();
		List<String> listWords = new ArrayList<String>();
		List<Integer> listNumbers1 = new ArrayList<Integer>();
		List<String> linkedWords1 = new LinkedList<String>();

		/* Since Java 7, we can remove the type parameter on the right side */
		List<Integer> listNumbers2 = new ArrayList<>();
		List<String> linkedWords2 = new LinkedList<>();

		/* Since Java 9, you can create a List collection from a fixed set */
		List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);

		/*
		 * Since Java 10, you can shorten the declaration of a List collection by using
		 * the var
		 */
		// var employees = new ArrayList<Employee>();

		/* if we know that a list contains around 1000 elements */
		List<Integer> listNumbers3 = new ArrayList<>(1000);

		/* construct a list that takes elements from an existing collection */
		List<Integer> listNumberOne = List.of(1, 2, 3, 4, 5, 6); // existing collection
		List<Integer> listNumberTwo = new ArrayList<>(listNumberOne);

		/*
		 * ------------------------------------------------------------------- Basic
		 * List operations: adding, retrieving, updating, removing elements
		 * -------------------------------------------------------------------
		 */

		/*
		 * ------------------ Adding elements to a List: ------------------------------
		 */
		List<String> listStrings = new ArrayList<String>();
		// OK to add Strings:
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		// But this will cause compile error
		// listStrings.add(123); NOOOOOOOO

		// Adding elements of sub types of the declared type
		List<Number> linkedNumbers = new LinkedList<>();
		linkedNumbers.add(new Integer(123));
		linkedNumbers.add(new Float(3.1415));
		linkedNumbers.add(new Double(299.988));
		linkedNumbers.add(new Long(67000));

		// insert an element into the list at a specified index
		listStrings.add(1, "Four");

		// add all elements of an existing collection
		listStrings.addAll(listWords);

		// add the elements to the list at a specified position
		listStrings.addAll(2, listWords);

		/* -------------------- Retrieving elements from a List ------------------- */
		String element = listStrings.get(1);
		Number number = linkedNumbers.get(3);

		// For a LinkedListimplementation, we can get the first and the last elements
		LinkedList<Number> numbers = new LinkedList<Number>();
		 numbers.add(1); numbers.add(2); numbers.add(3);
		Number first = numbers.getFirst();
		Number last = numbers.getLast();

		/* ----------------- Updating elements in a List ----------------------- */
		listStrings.set(2, "Hi");

		/* ------------------ Removing elements from a List ------------------------ */
		// Remove the element at the 3rd position in the list
		listStrings.remove(2);
		// Remove the String element “Two” in the list
		listStrings.remove("Two");

		/////////////////////////////////////////////////////////////////
		/////////// 4. Iterating over elements in a list ////////
		///////////////////////////////////////////////////////////////

		for (String elt : listStrings) {
			System.out.println(elt);
		}

		listStrings.add("A");listStrings.add("B");listStrings.add("C");
		Iterator<String> iterator = listStrings.iterator();	
		while (iterator.hasNext()) { 
			System.out.println(iterator.next());
		}

		linkedNumbers.add(1);linkedNumbers.add(2);linkedNumbers.add(3);
		Iterator<Number> iterator2 = linkedNumbers.listIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

		/////////////////////////////////////////////////////////////////
		/////////// 5. Searching for an element in a list ////////
		/////////////////////////////////////////////////////////////////

		if (listStrings.contains("Hello")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}
		int firstIndex = linkedNumbers.indexOf(1234);
		int lastIndex = listStrings.lastIndexOf("Hello");

		/////////////////////////////////////////////////////////////////
		///////////    6. Sorting a list     ////////
		/////////////////////////////////////////////////////////////////
		
		List<String> listStrings6 = new ArrayList<String>();
		listStrings6.add("D");
		listStrings6.add("C");
		listStrings6.add("E");
		listStrings6.add("A");
		listStrings6.add("B");
		System.out.println("listStrings before sorting: " + listStrings);
		Collections.sort(listStrings);
		System.out.println("listStrings after sorting: " + listStrings);

		/////////////////////////////////////////////////////////////////
		///////////  7. Copying elements from one list into another ////////
		/////////////////////////////////////////////////////////////////
		List<String> sourceList = new ArrayList<String>();
		sourceList.add("A");
		sourceList.add("B");
		sourceList.add("C");
		sourceList.add("D");
		List<String> destList = new ArrayList<String>();
		destList.add("V");
		destList.add("W");
		destList.add("X");
		destList.add("Y");
		destList.add("Z");
		System.out.println("destList before copy: " + destList);
		Collections.copy(destList, sourceList);
		System.out.println("destList after copy: " + destList); // destList = sourceList
		
		
		///////////////////////////////////////////////////////////////////////
		//////////////   8. Shuffling (randomly permute) elements in a list    //////////////////
		//////////////////////////////////////////////////////////////////////
		List<Integer> numbers8 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) numbers8.add(i);
		System.out.println("List before shuffling: " + numbers);
		Collections.shuffle(numbers8);
		System.out.println("List after shuffling: " + numbers8);
		
		///////////////////////////////////////////////////////////////////////
		//////////////   9. Reversing elements in a list    //////////////////
		//////////////////////////////////////////////////////////////////////
		List<Integer> numbers9 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) numbers9.add(i);
		System.out.println("List before reversing: " + numbers9);
		Collections.reverse(numbers9);
		System.out.println("List after reversing: " + numbers9);
		
		///////////////////////////////////////////////////////////////////////
		//////////////   10. Extracting a portion of a list   //////////////////
		//////////////////////////////////////////////////////////////////////
		List<String> listNames = Arrays.asList("Tom", "John", "Mary", "Peter", "David", "Alice");
		System.out.println("Original list: " + listNames);
		List<String> subList = listNames.subList(2, 5);
		System.out.println("Sub list: " + subList);
		
		///////////////////////////////////////////////////////////////////////
		//////////////  11. Converting between Lists and arrays ///////////////
		///////////////////////////////////////////////////////////////////////
		
		// converts an array of type T to a list of type T.
		List<String> listNames11 = Arrays.asList("John", "Peter", "Tom", "Mary", "David", "Sam");
		List<Integer> listNumbers11 = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
		System.out.println(listNames11);
		System.out.println(listNumbers11);
		
		List<String> listWords11 = new ArrayList<String>();
		// add elements to the list
		Object[] arrayWords = listWords11.toArray();
		
		
		///////////////////////////////////////////////////////////////////////
		//////////////             12. List to Stream           ///////////////
		///////////////////////////////////////////////////////////////////////
		//you can convert a List to a stream to take advantages of the Streams API
		List<Integer> listNumbers12 = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
		int sum = listNumbers12.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum Stream : " + sum );
		
		
		///////////////////////////////////////////////////////////////////////
		//////////////            13. Concurrent lists          ///////////////
		///////////////////////////////////////////////////////////////////////
		
		
	}
}
