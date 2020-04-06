/**
 * 
 */
package cert.ocp.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author gain
 *
 */
public class ArrayOperations {

	/**
	 * 
	 */
	public ArrayOperations() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try { 
			
			
	        // creating Arrays of Integer type 
            Integer a[] = new Integer[] { 10, 20, 30, 40 };
            
            Integer b[] = a;
            
            Integer c[] = new Integer[] { 10, 20, 30, 40 };
            
            System.out.println( " array equals  a and b   " + a.equals(b) );
            
            System.out.println( " array equals  a and c   " + a.equals(c) );
            
            //Int  array3 []= new int[] {1,2,3};
              // getting the list view of Array 
            List<Integer> list = Arrays.asList(a); 
            // below returns the old element 20 and set it to 60
            System.out.println(" set 1 to 60 : " + list.set(1, 60)); 
              // printing the list 
            System.out.println("The list is: " + list); 
            
          
            
           /* both below operations will throw java.lang.UnsupportedOperationException  on an array backed list
            Arrays.asList(a); */
           // System.out.println("list.add(50) : " + list.add(50));
          //  System.out.println("list.remove(50) : " + list.remove(50));
            
            //  since the below is unsorted the results are un predictable
          int  array3 []= new int[] {3,2,5};
          
          System.out.println(" Arrays.binarySearch for 3 "+ Arrays.binarySearch(array3, 3));
          
          System.out.println(" Arrays.binarySearch for 2 "+ Arrays.binarySearch(array3, 2));
          
          System.out.println(" Arrays.binarySearch for 6 "+ Arrays.binarySearch(array3, 6));
          
          // looping an array
          
          for (int i = 0; i < array3.length; i++) {
        	  
        	  System.out.println("i is "+ i +"  and val is " +array3[i]);
		}
          
          
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
		// TODO Auto-generated method stub

	}

}
