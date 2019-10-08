/**
 * 
 */
package cert.ocp.test;

import java.util.ArrayList;
import static java.util.Collections.sort;

//import static java.lang.Integer.MAX_VALUE;

/**
 *
 * Java program to demonstrate How to use static import in Java 5
 * By using static import you can use static field of external
ADVERTISEMENT

 class
 * as they are declared in same class.
 *
 * @author gain
 *
 */
public class StaticImports {

	/**
	 * 
	 */
	public StaticImports() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//without Static import
       System.out.println("Maximum value of int variable in Java without " +  "static import : "  + Integer.MAX_VALUE);

/*        System.out.println("Minimum value of int variable in Java without " +
                            static import : " + Integer.MIN_VALUE);
     
        //after static import in Java 5
        System.out.println("Maximum value of int variable using " +
                            static import : " + MAX_VALUE);
        System.out.println("Minimum value of int variable using" +
                            static import : " + MIN_VALUE);
*/
       
       
       //  Collections sort..
       
    // Create a list of strings 
       ArrayList<String> al = new ArrayList<String>(); 
       al.add("Geeks For Geeks"); 
       al.add("Friends"); 
       al.add("Dear"); 
       al.add("Is"); 
       al.add("Superb"); 
 
       /* Collections.sort method is sorting the 
       elements of ArrayList in ascending order. */
      // Collections.sort(al); 
       sort(al);
       // Let us print the sorted list 
       System.out.println("List after the use of" + 
                          " Collection.sort() :\n" + al); 

}
	
}
