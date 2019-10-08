/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public class HidingVariables {
	
	 static char foo = 'a';
	 char nonStaticFoo = 'a';
	
	

	/**
	 * 
	 */
	public HidingVariables() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HidingVariables a = new HidingVariables();
		DerivedHidingVariables b = new DerivedHidingVariables();
		System.out.println(a.foo); // Prints 'a'
		System.out.println(b.foo); // Prints "b"
		
		HidingVariables aAsB = new DerivedHidingVariables();
		
		System.out.println(aAsB.nonStaticFoo); // Prints 'a'
		System.out.println(aAsB.nonStaticFoo); // Prints "b"

	}

}

class DerivedHidingVariables extends HidingVariables {
	
	 static char foo = 'b';
	 char nonStaticFoo = 'b';
	
}
