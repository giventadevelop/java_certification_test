/**
 * 
 */
package cert.ocp.test.passeasily;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author gain
 *
 */
public class StreamReduce_QN_40 {

		
	public static void main (String[] args) throws IOException {
		
		List<String> codes = Arrays.asList ("DOC", "MPEG", "JPEG");
		codes.forEach (c -> System.out.print(c + " "));
		String fmt = codes.stream().filter (s-> s.contains("PEG")).reduce((s, t) -> s + t).get();
		System.out.println("\n" + fmt);
		
		
		}
}
		
		