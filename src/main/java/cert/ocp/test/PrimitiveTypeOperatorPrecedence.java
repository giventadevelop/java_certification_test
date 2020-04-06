/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public class PrimitiveTypeOperatorPrecedence {

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
		
		int x=3;
		
		@SuppressWarnings("unused")
		int y= ++x * 5 / x-- + --x;
		
		// need to revisit this precedence case for ++  and -- in one single line..
		
	/*	int z= 4 * 5 / 2 + 3;
		*/
		System.out.println( " x is "+ x);
		
		System.out.println( " y is "+ y);
		
		// 

	}

}
