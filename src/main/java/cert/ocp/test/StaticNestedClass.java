package cert.ocp.test;
public class StaticNestedClass{  
  static int data=30;  
  static class DefaultPackInner{  
   void msg(){System.out.println("data is "+data);}  
  } 
  
  private static class PrivateStaticInner{  
	  static int data=50; 
	   void msg(){System.out.println("PrivateStaticInner data is "+data);}  
	  } 
  public static void main(String args[]){ 
	  
  StaticNestedClass.DefaultPackInner obj=new StaticNestedClass.DefaultPackInner();  
  obj.msg(); 
  
  // you can also invoke or instatiate this way below.
  DefaultPackInner nested = new DefaultPackInner();
  nested.msg();
  
  StaticNestedClass.PrivateStaticInner obj2=new StaticNestedClass.PrivateStaticInner();  
  obj2.msg(); 
  
  PrivateStaticInner privateStaticInner = new PrivateStaticInner();
  privateStaticInner.msg(); 
  
  }  
}