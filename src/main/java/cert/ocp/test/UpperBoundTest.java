package cert.ocp.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UpperBoundTest {

	public UpperBoundTest() {
		// TODO Auto-generated constructor stub
	}

	

	

	static class Bird{
		
	}
	
	
static class  Sparrow extends Bird{
		
	}

	public static void main(String[] args) {
		
		// works but the below won't
		Set<Number> numbers = new HashSet<>();
		
		//compiler error with Unbounded variablke generic type
		//Set<Number> numbers2 = new HashSet<Integer>();
		
		// 
		List<? extends Bird> birds=new ArrayList<Bird>();
		//birds.addAll(new Bird());
		
		//birds.add(new Sparrow());
		
		/*List<? extends Sparrow> sparrows=new ArrayList<Sparrow>();
		
		sparrows.add(new Bird());*/
		
		/*
		 * The above gives compilation error since the birds
		 * has become immutable and can only  used inside as
		 * a parameter argument 
		 */
		
	//	List<? super  IOException> exceptions=new ArrayList<Exception>();
		List<? super  IOException> exceptions=new ArrayList<>();
		exceptions.add(new FileNotFoundException () ); 
		
		exceptions.add(new IOException () );

		
		

	}

}
