/**
 * 
 */
package cert.ocp.test.passeasily;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author gain
 *
 */
public class StreamWithoutTerminal_QN_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> strList=Arrays.asList("Jim","John","Jeff");
		Function<String,String> funVal=s->"Hello: ".concat(s);
		strList.stream().map(funVal).peek(System.out::print);
		// This prints nothing since theres no terminal oprn

	}

}
