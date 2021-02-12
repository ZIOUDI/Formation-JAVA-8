package StreamOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import D_EqualsAndHashcode.Student;

public class CreationStream {
	
	public static void main(String[] args) {
		// 1) empty() : Creates an empty stream
		Stream<Student> emptyStream = Stream.empty();        
		System.out.println(emptyStream.count()); //Output : 0
		
		// 2) of(T t) : Creates a stream of single element of type T
		Stream<Student> singleElementStream = Stream.of(new Student());        
		System.out.println(singleElementStream.count()); //Output : 1
		
		// 3) of(T… values) : Creates a stream from values
		Stream<Integer> streamOfNumbers = Stream.of(7, 2, 6, 9, 4, 3, 1);
		System.out.println(streamOfNumbers.count()); 	//Output : 7
		
		// 4) Creating streams from collections
		List<String> listOfStrings = new ArrayList<>();       
		listOfStrings.add("One");		         
		listOfStrings.add("Two");		         
		listOfStrings.add("Three");		         
		listOfStrings.stream().forEach(System.out::println);		         
		//  Output :		         
		//  One
		//  Two
		//  Three
	}

}
