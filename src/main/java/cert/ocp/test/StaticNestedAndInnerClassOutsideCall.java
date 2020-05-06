/**
 * 
 */
package cert.ocp.test;

import cert.ocp.test.StaticNestedAndInnerClass.DefaultInnerClass;
import cert.ocp.test.StaticNestedAndInnerClass.DefaultStaticPackInner;
//import cert.ocp.test.StaticNestedClass.PrivateStaticInner;
//import cert.ocp.test.StaticNestedAndInnerClass.PrivateInnerClass;

/**
 * @author gain
 *
 */
public class StaticNestedAndInnerClassOutsideCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 StaticNestedAndInnerClass.DefaultStaticPackInner obj=new StaticNestedAndInnerClass.DefaultStaticPackInner();  
		  obj.msg(); 
		  
		  // you can also invoke or instatiate this way from outside using import since the class is scope is
		  //packae scope default.
		  DefaultStaticPackInner nested = new DefaultStaticPackInner();
		  nested.msg();
		  
		  //  below is not possible since  The type StaticNestedClass.PrivateStaticInner is not visible
		  /*
		  StaticNestedClass.PrivateStaticInner obj2=new StaticNestedClass.PrivateStaticInner();  
		  obj2.msg(); 
		  
		  PrivateStaticInner privateStaticInner = new PrivateStaticInner();
		  privateStaticInner.msg(); 
*/
		  //  nested  Inner member classes...
		  
		  StaticNestedAndInnerClass.DefaultInnerClass defaultInnernested = new StaticNestedAndInnerClass().new DefaultInnerClass();
		  defaultInnernested.msg();
		  
		  //  	not visible  since private
		  
		 /* StaticNestedAndInnerClass.PrivateInnerClass privateInnerClass =  new StaticNestedAndInnerClass().new PrivateInnerClass();
		  privateInnerClass.msg();*/ 
		  
	}

}
