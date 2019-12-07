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

		/* Locale fr = new Locale("fr");
		 Locale.setDefault(new Locale("en", "US"));
		 ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);*/
		
		// Locale.setDefault(new Locale("en", "US"));
		 ResourceBundle b = ResourceBundle.getBundle("Dolphins");
		System.out.println(b.getString("name") ); 
		System.out.println( b.getString("age"));

	}

}
