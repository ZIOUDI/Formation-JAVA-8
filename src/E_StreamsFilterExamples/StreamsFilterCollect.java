package E_StreamsFilterExamples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsFilterCollect {

	public static void main(String[] args) {

		// Before Java 8
		System.out.println("************* Before Java 8 ***************");
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		List<String> result = getFilterOutputBeforeJava8(lines, "mkyong");
		for (String temp : result) {
			System.out.println(temp); // output : spring, node
		}

		// Java 8
		System.out.println("************* With Java 8 ***************");
		result = lines.stream() // convert list to stream
				.filter(line -> !"mkyong".equals(line)) // we dont like mkyong
				.collect(Collectors.toList()); // collect the output and convert
												// streams to a List

		result.forEach(System.out::println); // output : spring, node

	}

	private static List<String> getFilterOutputBeforeJava8(List<String> lines, String filter) {
		List<String> result = new ArrayList<>();
		for (String line : lines) {
			if (!"mkyong".equals(line)) { // we dont like mkyong
				result.add(line);
			}
		}
		return result;
	}

}