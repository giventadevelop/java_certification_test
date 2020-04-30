/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public interface InterfaceOverideConflict {

}


interface Herbivore{
	
	public int eatPlants();
	
	public int loadPlants();
	
}

interface Omnivore{
	
	public void eatPlants();
	
	public int loadPlants();
}

interface extendsIntfc extends Herbivore, Omnivore{ 
	
	// below complaints since there is no overloading using just return type so the methods are considered same and duplicate..
	public int eatPlants();
	
	public int eatPlants(int  face);
}