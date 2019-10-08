/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public class Hey extends Food {

	/**
	 * @param quantity
	 */
	public Hey(int quantity) {
		super(quantity);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cert.ocp.test.Food#consumed()
	 */
	@Override
	public void consumed() {
		System.out.println(" Hey food "+ getQuantity());

	}

}
