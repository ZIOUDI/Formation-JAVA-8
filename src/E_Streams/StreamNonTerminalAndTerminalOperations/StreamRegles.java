package E_Streams.StreamNonTerminalAndTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// L'interface Stream : un flux de traitement (ou un pipeline) 
public class StreamRegles {

	/* filter() map() flatMap() distinct() limit() peek() */

	List<String> strings = Arrays.asList("girafe", "chameau", "chat", "poisson", "cachalot");

	/*
	 * strings.stream()
	 * 
	 * // filtrage : filter(x->x.contains("cha"))
	 * 
	 * // mapping : reformatage des chaînes de caractères :
	 * map(x->x.substring(0,1).toUpperCase()+x.substring(1))
	 * 
	 * // tri par ordre alphabétique : sorted()
	 * 
	 * // Outputs: Cachalot Chameau Chat : forEach(System.out::println);
	 */

	public static void main(String[] args) {
		// Le flux de traitement commence par créer une instance de l’interface
		// java.util.stream.Stream à partir d’une source de données (collection,
		// tableau, ensemble d’éléments).
		// Creates a stream from a set of values.
		Stream<Integer> integerStream1 = Stream.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));

		// Creates a stream from an array.
		Integer[] values = { 1, 2, 3 };
		Stream<Integer> integerStream2 = Stream.of(values);
		Stream<Integer> integerStream3 = Arrays.stream(values);

		// Creates a stream from a list.
		Stream<Integer> integerStream4 = Arrays.asList(values).stream();

		// L’opération terminale du pipeline produit un résultat ou un effet de
		// bord. Cette opération ferme le flux.

		// the terminal operation "count" produces a result
		Long value = Stream.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)).count();

		// the terminal operation "forEach" produces a side-effect
		Stream.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)).forEach(System.out::println);

		/*
		 * les opérations intermédiaires d’un pipeline ne seront jamais
		 * exécutées si le pipeline ne declare pas une operation terminale.
		 */
		// filter is an intermediate operation, it won't be applied now
		Stream<Integer> integerStream10 = Stream.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3))
				.filter(i -> i % 2 == 0);

		// forEach is a terminal operation, all intermediate along with the
		// terminal operation will be applied
		integerStream10.forEach(System.out::println);

		// the intermediate operation "limit" will restrict the processing of
		// the elements of the stream to only the specified number
		Stream.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)).limit(2);

		/*
		 * Une seule opération terminale peut s'appliquer sur une instance
		 * Stream.
		 */
		Stream<Integer> integerStream11 = Stream.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));

		// OK: first operation to be applied on the "integerStream1" instance
		Stream<Integer> integerStream12 = integerStream11.filter(i -> i % 2 == 0);

		// throws the exception: java.lang.IllegalStateException: stream has
		// already been operated upon or closed
		// Stream<Integer> integerStream3 = integerStream1.filter(i -> i%2==0);

	}

}
