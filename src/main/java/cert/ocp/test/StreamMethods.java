package cert.ocp.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		
		List<String> citiesList = Arrays.asList("New York","Tokyo","New Delhi");
		Stream<String> listToStream = citiesList.stream();
		Stream<String> parallelListToStream = citiesList.parallelStream();
		citiesList.stream().forEach(System.out::println);

	}

}
