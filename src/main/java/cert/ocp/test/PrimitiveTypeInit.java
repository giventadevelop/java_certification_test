/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public class PrimitiveTypeInit {

	/**
	 * @param args
	 */
	
	private static long longVar ;
	
	private static int _intVar ;
	
	private static String $strVar ;
	
	private static char $charVar ;
	
	final long  value3 = 0;
	
	static Float floatWrapper=new Float(1.0);
	
	static Float floatWrapper_f=new Float(1.0f);
	
	
	public static void main(String[] args) {
		
        /* the below will not compile  and should be declared 
		as instead float fltVar=2.1f;*/
		//float fltVar=2.1; 
		
		System.out.println("longVar "+ longVar );
		
		System.out.println("_intVar "+ _intVar );
		
		System.out.println("$strVar "+ $strVar ); 
		
		System.out.println("$charVar "+ $charVar );
		
		System.out.println("floatWrapper "+ floatWrapper ); 
		
		System.out.println("floatWrapper_f "+ floatWrapper_f ); 

	}

}
