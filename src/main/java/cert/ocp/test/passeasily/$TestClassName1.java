/**
 * 
 */
package cert.ocp.test.passeasily;

/**
 * @author Gain
 * A sample showing that you can have class names starting with $ or _  
 * and also can include digits in it but thats discouraged
 */
public class $TestClassName1 {

	/**
	 * 
	 */
	public $TestClassName1() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * A sample showing that you can have method names starting with $ or _
	 * and also can include digits in it and thats discouraged 
	 * @return
	 */
	public String $testMethodName1() {
		return "$TestClassName [" + (getClass() != null ? "getClass()=" + getClass() + ", " : "") + "hashCode()="
				+ hashCode() + ", " + (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "$TestClassName [" + (getClass() != null ? "getClass()=" + getClass() + ", " : "") + "hashCode()="
				+ hashCode() + ", " + (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}


	static final public  String _testMethodName1() {
		return null;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
