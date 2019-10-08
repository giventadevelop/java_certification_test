package cert.ocp.test;

import java.util.Optional;

public class OptionalMethods {

	public static void main(String[] args) {
		Optional<String> opt = Optional.of("Baeldung");
	    //assertFalse(opt.get());
		System.out.println(" Optional get" +opt.get() );
	 
	    opt = Optional.ofNullable(null);
	    System.out.println(" Optional ofNullable" +opt.get() );

	}

}
