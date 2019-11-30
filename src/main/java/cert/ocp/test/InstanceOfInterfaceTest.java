/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */

interface X { }

class A implements X { }
 
class B extends A { }
 
class D extends InstanceOfInterfaceTest implements X { }

public class InstanceOfInterfaceTest {


	 
	    public static void main(String[] args) {
	        X x1 = new B();
	        B b1 = new B();
	        InstanceOfInterfaceTest c = new D();
	        if (x1 instanceof A)
	            System.out.println("x1 is a A");
	 
	        if (b1 instanceof X)
	            System.out.println("b1 is a X");
	        /* if (c instanceof A)    // compilation fails  // line 1
	                     System.out.println("c is a A");
	       */
	        if (c instanceof X) // line 2
	            System.out.println("c is a X");
	    }
	}


