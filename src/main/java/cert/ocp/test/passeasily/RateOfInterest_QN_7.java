package cert.ocp.test.passeasily;

import java.util.Locale;

public class RateOfInterest_QN_7 {
	
	public static void main (String[] args) {
		
		Locale loc4 = Locale.UK;
		Locale loc5 = new Locale ("ru", "RU");
		
		System.out.println ( 3 +" " +5);
		
	int rateOfInterest = 0;
	String accountType = "LOAN";
	switch (accountType) {
	case "RD":
	rateOfInterest = 5;
	break;
	case "FD":
	rateOfInterest = 10;
	break;
	default:
	assert false: "No interest for this account"; //line n1
	}
	System.out.println ("Rate of interest:" + rateOfInterest);
	}
	}

