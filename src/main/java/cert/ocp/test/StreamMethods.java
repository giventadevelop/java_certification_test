package cert.ocp.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		
		List<String> citiesList = Arrays.asList("New York","Tokyo","New Delhi");
		Stream<String> listToStream = citiesList.stream();
		Stream<String> parallelListToStream = citiesList.parallelStream();
		citiesList.stream().forEach(System.out::println);

		/**
		 * The partitioningBy() operation always returns a map with two Boolean keys, even if there are no corresponding values. By contrast, groupingBy() returns only keys that are actually needed.
		 */
		
		Stream<String> s = Stream.empty();
		Stream<String> s2 = Stream.empty();
		Map<Boolean, List<String>> p = s.collect(
		Collectors.partitioningBy(b -> b.startsWith("c")));
		Map<Boolean, List<String>> g = s2.collect(
		Collectors.groupingBy(b -> b.startsWith("c")));
		System.out.println(p + " " + g);
		
		
	}

}
