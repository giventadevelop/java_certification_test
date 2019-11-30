/**
 * 
 */
package cert.ocp.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author gain
 *
 */
 class Base {
	 
	/* Static method in base class which will hide same signature static methods 
	 in subclass*/ 
	 
public static void display() { 
    System.out.println("Static or class method from Base"); 
} 
  
 // Non-static method which will be overridden in derived class  
 public void print()  { 
     System.out.println("Non-static or Instance method from Base"); 
} 
} 

//Subclass 
class Derived extends Base { 
  
/* This method hides display() in Base  
	if you remove static here you will get compiler error since its not 
	overriding
*/
	public static void display() { 
     System.out.println("Static or class method from Derived"); 
} 
  
// This method overrides print() in Base  
public void print() { 
     System.out.println("Non-static or Instance method from Derived"); 
     
     InputStream in = null;
	BufferedReader reader = new BufferedReader(new InputStreamReader(in));
} 
} 

//Driver class 
public class OverrideStaticMethods { 
public static void main(String args[ ])  { 
  
	Base obj1 = new Derived(); 
	
	//This will print from the derived since its class level method
	Derived obj2 = new Derived();
	
	
   // As per overriding rules this should call to class Derive's static  
   // overridden method. Since static method can not be overridden, it  
   // calls Base's display()  
   obj1.display(); 
   
   obj2.display();
   
   Derived.display();
     
   // Here overriding works and Derive's print() is called  
   obj1.print();
   obj2.print();     
} 
} 