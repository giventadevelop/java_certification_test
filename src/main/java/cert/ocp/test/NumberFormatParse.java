/**
 * 
 */
package cert.ocp.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author gain
 *
 */
public class NumberFormatParse {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {

		String salePrice = "$123.45";
		Locale locale = Locale.US;
		Number number = NumberFormat.getCurrencyInstance(locale).parse(salePrice);
		System.out.println(number);
		
		Double dbl= (Double) number;
		System.out.println(dbl);
	}

}
