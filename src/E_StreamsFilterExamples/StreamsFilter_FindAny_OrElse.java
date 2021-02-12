package E_StreamsFilterExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * * * A simple Java Program to demonstrate how to use map and filter method
 * Java 8. In this program, we'll convert a list of String into a list of
 * Integer and * then filter all even numbers.
 */

public class StreamsFilter_FindAny_OrElse {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 20),
				new Person("lawrence", 40));

		// Before Java 8, you get a Person by name like this :
		System.out.println("************* Before Java 8 ***************");
		Person result = getStudentByName(persons, "jack");
		System.out.println(result);

		// Java 8
		System.out.println("************* With Java 8 ***************");

		Person result1 = persons.stream() // Convert to steam
				.filter(x -> "jack".equals(x.getName())) // we want "jack" only
				.findAny() // If 'findAny' then return found
				.orElse(null); // If not found, return null

		System.out.println(result1);

		Person result2 = persons.stream().filter(x -> "ahmook".equals(x.getName())).findAny().orElse(null);

		System.out.println(result2);

	}

	private static Person getStudentByName(List<Person> persons, String name) {

		Person result = null;
		for (Person temp : persons) {
			if (name.equals(temp.getName())) {
				result = temp;
			}
		}
		return result;
	}

}
