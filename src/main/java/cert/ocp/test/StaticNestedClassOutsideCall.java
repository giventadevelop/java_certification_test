/**
 * 
 */
package cert.ocp.test;

import cert.ocp.test.StaticNestedClass.DefaultPackInner;
//import cert.ocp.test.StaticNestedClass.PrivateStaticInner;

/**
 * @author gain
 *
 */
public class StaticNestedClassOutsideCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 StaticNestedClass.DefaultPackInner obj=new StaticNestedClass.DefaultPackInner();  
		  obj.msg(); 
		  
		  // you can also invoke or instatiate this way from outside using import since the class is scope is
		  //packae scope default.
		  DefaultPackInner nested = new DefaultPackInner();
		  nested.msg();
		  
		  //  below is not possible since  The type StaticNestedClass.PrivateStaticInner is not visible
		  /*
		  StaticNestedClass.PrivateStaticInner obj2=new StaticNestedClass.PrivateStaticInner();  
		  obj2.msg(); 
		  
		  PrivateStaticInner privateStaticInner = new PrivateStaticInner();
		  privateStaticInner.msg(); 
*/
	}

}
