package cert.ocp.test;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundTest {

	public UpperBoundTest() {
		// TODO Auto-generated constructor stub
	}

	static class Bird{
		
	}
	
	
static class  Sparrow extends Bird{
		
	}

	public static void main(String[] args) {
		// 
		List<? extends Bird> birds=new ArrayList<Bird>();
		//birds.addAll(new Bird());
		
		/*
		 * The above gives compilation error since the birds
		 * has become immutable and can only nbe used inside as
		 * a parameter argument 
		 */
		
		

	}

}
