/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public enum EnumCountry {

	US("DOLLAR"){
		
		public String defaulTMethod() {
			// TODO Auto-generated method stub
			return "US_AbstractMethod";
		}
	}, RUSSIA("RUBLE"), INDIA("RUPEE");
	
	// default for both India and Russia here 
	public String defaulTMethod() {
	        return this.currency;
	    }
	 
	
	
    private String currency;
 
    private EnumCountry(String currency) {
        this.currency = currency;
    }
 
    public String getCurrency() {
        return currency;
    }
    
    
   
    @Override
    public String toString() {
        return currency;
    }
    
    
    public static void main(String[] args) {
        for (EnumCountry country : EnumCountry.values()) {
            System.out.println(country.getCurrency() + " is the currecny of " + country.name());
        }
        
        System.out.println( "currecny of India default method call " + EnumCountry.INDIA.defaulTMethod());
    }

}
