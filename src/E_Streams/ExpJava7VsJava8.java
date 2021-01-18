package E_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ExpJava7VsJava8 {

	public static void main(String args[]) {
		
		System.out.println("*************************************************************************** ");
		System.out.println("***********************    Using Java 7 / 8  ********************************** ");
		System.out.println("*************************************************************************** ");

 		
		List<String> strings = Arrays.asList("", "abc", "", "bc", "efg", "abcd", "", "jkl");
		System.out.println("----> List string: " + strings);
		
		System.out.println("**** Count empty strings  Using Java 7  ******** ");
		long count = getCountEmptyStringUsingJava7(strings);
		System.out.println("Empty elt in the list = " + count);
		
		System.out.println("**** Count empty strings  Using Java 8  ******** ");
		count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty Strings in the list : " + count);
		
		
		System.out.println("count Strings of length == 3");
		count = getCountLength3UsingJava7(strings);
		System.out.println("JAVA 7 : Strings of length == 3 : " + count);
		
		count = strings.stream().filter(string -> string.length() == 3).count();
		System.out.println("JAVA 8 : Strings of length == 3 : " + count);
		
		
		// Eliminate empty string
		List<String> filtered = deleteEmptyStringsUsingJava7(strings);
		System.out.println("JAVA 7 Filtered List from empty elt: " + filtered);
		
		filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("JAVA 8 Filtered List from empty elt: " + filtered);

		// Eliminate empty string and join using comma.
		String mergedString = getMergedStringUsingJava7(strings, ", ");
		System.out.println("Java 7 Merged String: " + mergedString);

		mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("JAVA 8 Merged String: " + mergedString);
		
		//
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		System.out.println("----> Nouvelle Liste : " + numbers);

		// get list of square(i*i) of distinct numbers
		List<Integer> squaresList = getSquares(numbers);
		System.out.println("Java 7 Squares List :" + numbers + " is " + squaresList);
		
		squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println("Java 8 Squares List: " + squaresList);
		
		
		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
		System.out.println("Liste : " + integers);
		System.out.println("Java 7 Highest number in List : " + getMax(integers));
		System.out.println("Java 7 Lowest number in List : " + getMin(integers));
		System.out.println("Java 7 Sum of all numbers : " + getSum(integers));
		System.out.println("Java 7 Average of all numbers : " + getAverage(integers));
 
		IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Nouvelle  Liste : " + stats);
		
		System.out.println("Java 8 Highest number in List : " + stats.getMax());
		System.out.println("Java 8 Lowest number in List : " + stats.getMin());
		System.out.println("Java 8 Sum of all numbers : " + stats.getSum());
		System.out.println("Java 8 Average of all numbers : " + stats.getAverage());
		
		// print ten random numbers
		Random random = new Random();
		System.out.println("Java 7 Random Numbers: ");

		for (int i = 0; i < 10; i++) {
			System.out.printf("R" + i + " : " + (int) random.nextInt(10)+", ");
		}
		
		System.out.println("Java 8 Random Numbers: ");

		random.ints().limit(1).sorted().forEach(System.out::println);

	 
  
		// parallel processing
		count = strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty Strings: " + count);
	}

	private static int getCountEmptyStringUsingJava7(List<String> strings) {
		int count = 0;

		for (String string : strings) {

			if (string.isEmpty()) {
				count++;
			}
		}
		return count;
	}

	private static int getCountLength3UsingJava7(List<String> strings) {
		int count = 0;

		for (String string : strings) {

			if (string.length() == 3) {
				count++;
			}
		}
		return count;
	}

	private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
		List<String> filteredList = new ArrayList<String>();

		for (String string : strings) {

			if (!string.isEmpty()) {
				filteredList.add(string);
			}
		}
		return filteredList;
	}

	private static String getMergedStringUsingJava7(List<String> strings, String separator) {
		StringBuilder stringBuilder = new StringBuilder();

		for (String string : strings) {

			if (!string.isEmpty()) {
				stringBuilder.append(string);
				stringBuilder.append(separator);
			}
		}
		String mergedString = stringBuilder.toString();
		return mergedString.substring(0, mergedString.length() - 2);
	}

	private static List<Integer> getSquares(List<Integer> numbers) {
		List<Integer> squaresList = new ArrayList<Integer>();

		for (Integer number : numbers) {
			Integer square = new Integer(number.intValue() * number.intValue());

			if (!squaresList.contains(square)) {
				squaresList.add(square);
			}
		}
		return squaresList;
	}

	private static int getMax(List<Integer> numbers) {
		int max = numbers.get(0);

		for (int i = 1; i < numbers.size(); i++) {

			Integer number = numbers.get(i);

			if (number.intValue() > max) {
				max = number.intValue();
			}
		}
		return max;
	}

	private static int getMin(List<Integer> numbers) {
		int min = numbers.get(0);

		for (int i = 1; i < numbers.size(); i++) {
			Integer number = numbers.get(i);

			if (number.intValue() < min) {
				min = number.intValue();
			}
		}
		return min;
	}

	private static int getSum(List numbers) {
		int sum = (int) (numbers.get(0));

		for (int i = 1; i < numbers.size(); i++) {
			sum += (int) numbers.get(i);
		}
		return sum;
	}

	private static int getAverage(List<Integer> numbers) {
		return getSum(numbers) / numbers.size();
	}
}