/**
 * 
 */
package cert.ocp.test.passeasily;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author gain
 *
 */
public class EnumCompile_QN_31 {
	
	enum USCurrency {
		PENNY (1),
		NICKLE(5),
		DIME (10),
		QUARTER(25);
		private int value;
		public USCurrency(int value) {
		this.value = value;
		}
		public int getValue() {return value;}
		}

		public static void main (String[] args) {
		USCurrency usCoin = new  USCurrency.DIME;
		System.out.println (usCoin.getValue());
		
		}

}
