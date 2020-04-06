/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public class MethodOveride {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Animal animal = new Animal();
		animal.hide();
		animal.override();
		System.out.println("hiddenVariable " + animal.hiddenVariable);
		System.out.println("statichiddenVariable " + animal.hiddenVariable);
		
		System.out.println("----");
		
		Cat cat = new Cat();
		cat.hide();
		cat.override();
		System.out.println("hiddenVariable " + cat.hiddenVariable);
		System.out.println("statichiddenVariable " + cat.hiddenVariable);
		System.out.println("----");
		
		Animal animCat = new Cat();
		animCat.hide();
		animCat.override();
		System.out.println("hiddenVariable " + animCat.hiddenVariable);
		System.out.println("statichiddenVariable " + animCat.hiddenVariable);
        
		
		
	}

}


class Animal {
	
	public String hiddenVariable= "Animal_hiddenVariable";
	
	static public String  statichiddenVariable= "Static Animal_hiddenVariable";
	
    public static void hide() {
        System.out.println("The hide method in Animal Super class.");
    }
    public void override() {
        System.out.println("The override method in Animal Super class.");
    }
}

 class Cat extends Animal {
	 
	 public String hiddenVariable= "Cat_hiddenVariable";
	 
	 static public String  statichiddenVariable= "Static Cat_hiddenVariable";
	 
    public static void hide() {
        System.out.println("The static hide method in Cat Subclass .");
    }
    public void override() {
        System.out.println("The override method in Cat Subclass .");
    }

    
}