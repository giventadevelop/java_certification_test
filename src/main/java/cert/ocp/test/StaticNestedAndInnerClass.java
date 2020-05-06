package cert.ocp.test;
public class StaticNestedAndInnerClass{  
  static int data=30;  
  static class DefaultStaticPackInner{  
   void msg(){System.out.println("data is "+data);}  
  } 
  
  private static class PrivateStaticInner{  
	  static int data=50; 
	   void msg(){System.out.println("PrivateStaticInner data is "+data);}  
	  } 
  
  
   class DefaultInnerClass{  
	   void msg(){System.out.println("DefaultInnerClass");}  
	  } 
   
   private class PrivateInnerClass{  
		    void msg(){System.out.println("PrivateInnerClass ");}  
   } 
	  
  
  public static void main(String args[]){ 

	  // A declaration like this below is causing compile error since the clss is default package
  /*StaticNestedClass.DefaultPackInner obj=new StaticNestedClass.DefaultPackInner();  
  obj.msg();*/ 
  
  // you can also invoke or instatiate this way below.
	  //  Static nested classes...
  DefaultStaticPackInner nested = new DefaultStaticPackInner();
  nested.msg();
  
  StaticNestedAndInnerClass.PrivateStaticInner obj2=new StaticNestedAndInnerClass.PrivateStaticInner();  
  obj2.msg(); 
  
  PrivateStaticInner privateStaticInner = new PrivateStaticInner();
  privateStaticInner.msg(); 
  
  //  nested  Inner member classes...
  
  StaticNestedAndInnerClass.DefaultInnerClass defaultInnernested = new StaticNestedAndInnerClass().new DefaultInnerClass();
  defaultInnernested.msg();
  

  
  StaticNestedAndInnerClass.PrivateInnerClass privateInnerClass =  new StaticNestedAndInnerClass().new PrivateInnerClass();
  privateInnerClass.msg(); 
  
  
  }  
}