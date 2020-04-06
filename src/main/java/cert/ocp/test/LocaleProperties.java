/**
 * 
 */
package cert.ocp.test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author gain
 *
 */
public class LocaleProperties {

	/**
	 * 
	 */
	public LocaleProperties() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale fr = new Locale("fr");
		  Locale.setDefault(new Locale("en", "US"));
		 ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);
		
		// Locale.setDefault(new Locale("en", "US"));
		
	//	Locale.setDefault(Locale.FRANCE);
		
		System.out.println("Default Locale is " + Locale.getDefault());
		
		System.out.println("Locale.FRENCH is " + Locale.FRENCH);
		
		System.out.println("Locale.FRANCE is " + Locale.FRANCE);
		
	//	ResourceBundle b = ResourceBundle.getBundle("Dolphins");
		//ResourceBundle b = ResourceBundle.getBundle("Dolphins", Locale.FRANCE);
		//ResourceBundle b = ResourceBundle.getBundle("Dolphins", Locale.FRENCH);
		System.out.println(b.getString("name") ); 
		System.out.println( b.getString("age"));

	}

}
