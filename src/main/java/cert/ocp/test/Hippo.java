package cert.ocp.test;

public class Hippo extends HeavyAnimal {

	public static void main(String[] args) {
		
		HeavyAnimal hippo=new Hippo();
		
		boolean isHippo=hippo instanceof Mother;
		
		System.out.println(" hippo instanceof Mother "+ isHippo);
		
		HeavyAnimal motherHippo=new MotherHippo();
		
		boolean ismotherHippo=motherHippo instanceof Mother;
		
		System.out.println(" motherHippo instanceof Mother "+ ismotherHippo);
		
		// The below gives compile error and the above ones not since interface check happens not until run time.
		//boolean isHippoElephant=motherHippo instanceof Elephant;
		
	}

}
