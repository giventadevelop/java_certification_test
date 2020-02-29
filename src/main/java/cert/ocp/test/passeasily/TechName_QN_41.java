/**
 * 
 */
package cert.ocp.test.passeasily;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

/**
 * @author gain
 *
 */
public class TechName_QN_41 {
	
	
		
		public static void main (String[] args) {
			
			List<TechName> tech = Arrays.asList (
					new TechName("Java-"),
					new TechName("Oracle DB-"),
					new TechName("J2EE-")
					) ;
					Stream<TechName> stre = tech.stream();   
					
					//stre.forEach(System.out::print);
					
					stre.map(a-> a.techName).forEach(System.out::print);
					
					//QN 43
					//BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2; //line n1
					//System.out.println(val.apply(10, 10.5));
			
		}
		
}

class TechName {
	String techName;
	TechName (String techName) {
	this.techName=techName;
	}
	}

		