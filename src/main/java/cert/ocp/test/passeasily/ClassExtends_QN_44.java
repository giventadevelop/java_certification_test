/**
 * 
 */
package cert.ocp.test.passeasily;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author gain
 *
 */
public class ClassExtends_QN_44 {
	
	
		
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
					
					C c=new C();
					
					
					IntStream stream = IntStream.of (1,2,3);
					//IntFunction<Integer> inFu= x -> y -> x*y; //line n1
					IntFunction<IntUnaryOperator> inFu= x -> y -> x*y; //line n1
					IntStream newStream = stream.map(inFu.apply(10)); //line n2
					newStream.forEach(System.out::print);
			
		}
		
}

class A{
	
	public A() {
		System.out.println( "A");
	}
}
		
class B extends A{
	public B() {
		System.out.println( "B");
	}
	
}


class C extends B{
	public C() {
		System.out.println( "C");
	}
}
