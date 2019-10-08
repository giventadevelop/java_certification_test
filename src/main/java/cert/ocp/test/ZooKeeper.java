/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public class ZooKeeper {

	/**
	 * 
	 */
	public ZooKeeper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("cat");
		food.consumed();
	}

}
