/**
 * 
 */
package cert.ocp.test;

/**
 * @author Gain
 *
 */
public abstract class Food {
	
	private int quantity;
	
	public Food(int quantity) {
		this.quantity=quantity;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	public abstract void consumed();
	
}
