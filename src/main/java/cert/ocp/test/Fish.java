/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public class Fish extends Food {

	/**
	 * @param quantity
	 */
	public Fish(int quantity) {
		super(quantity);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cert.ocp.test.Food#consumed()
	 */
	@Override
	public void consumed() {
		System.out.println(" Fish food "+ getQuantity());

	}

}
