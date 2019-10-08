/**
 * 
 */
package cert.ocp.test;

/**
 * @author Gain
 *
 */
public class FoodFactory {

	/**
	 * 
	 */
	public FoodFactory() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Food getFood(String animalName) {
		
		switch (animalName) {
		case "zebra":
			return new Hey(100);

		case "cat":
			return new Fish(50);
		}
		
		 throw new UnsupportedOperationException("Unsupported animal "+ animalName);
		
	}

}
