/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public class AssertionError {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

/*		Q. 9 	Which of the following prints OhNo with the assertion failure when the number is negative? (Choose all that apply.)*/
        //  this evaluates to true and won't throw the error
		//int n=-1;
		
	//  this evaluates to false and won't throw the error
		int n=1;
		    	assert n < 0: "OhNo";

/*				B.	assert n < 0, "OhNo";

				C.	assert n < 0 ("OhNo");

				D.	assert(n < 0): "OhNo";Your selection is incorrect

				E.	assert(n < 0, "OhNo");
*/

	}

}
