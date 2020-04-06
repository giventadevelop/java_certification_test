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
	 
	 private char privateFoo = 'c';
	
	

	/**
	 * 
	 */
	public HidingVariables() {
		// TODO Auto-generated constructor stub
	}
	
	 public void print()  { 
	     System.out.println("Non-static or Instance method from Base"); 
	} 


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HidingVariables a = new HidingVariables();
		DerivedHidingVariables b = new DerivedHidingVariables();
		HidingVariables aAsB = new DerivedHidingVariables();
	
	/*  variables both static and instance variables will be hidden it will always
        and invoking on the class will be using the class level and not the overridden level*/
		
		System.out.println(a.foo); // Prints 'a'
		System.out.println(b.foo); // Prints "b"
		System.out.println(aAsB.nonStaticFoo); // Prints 'a'
		System.out.println(b.nonStaticFoo); // Prints "b"
		
		// private char privateFoo = 'c';
		
		System.out.println(a.privateFoo); // Prints 'c'
		//  The field DerivedHidingVariables.privateFoo is not visible
		//System.out.println(b.privateFoo); // Prints "b"
		System.out.println(aAsB.privateFoo); // Prints 'c'
		 // Prints "b"
		
		/*methods are overidden but variables both static and instance variables will be hidden it will always
       invoking class level uses the class level and the sub class ref uses the derived or overidden method*/
		
		a.print();
		aAsB.print();
		b.print();

	}

}

class DerivedHidingVariables extends HidingVariables {
	
	 static char foo = 'b';
	 char nonStaticFoo = 'b';
	 
	 private char privateFoo = 'c';
	 
	 
	 public void print()  { 
	     System.out.println("Non-static or Instance method from Derived"); 
	} 

	
}
