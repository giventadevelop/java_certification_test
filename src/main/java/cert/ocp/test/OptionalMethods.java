package cert.ocp.test;

import java.util.Optional;

public class OptionalMethods {

	public static void main(String[] args) {
		Optional<String> opt = Optional.of("Baeldung");
	    //assertFalse(opt.get());
		System.out.println(" Optional get " +opt.get() );
	 
		// this will immediately throw java.lang.NullPointerException
		String nullValue = null;
		//opt = Optional.of(nullValue);
	    
	    nullValue = "hasValue";
	    
	    opt = Optional.ofNullable(nullValue);
	    System.out.println(" Optional Value is  " +opt.orElse("noValue") );
	    
	    // the below throw  java.util.NoSuchElementException: No value present
	    nullValue = null;
	    opt = Optional.ofNullable(nullValue);
	    System.out.println(" Optional ofNullable" +opt.get() );

	}

}
