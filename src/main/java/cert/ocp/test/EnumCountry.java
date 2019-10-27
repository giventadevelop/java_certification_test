/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public enum EnumCountry {

	US("DOLLAR"), RUSSIA("RUBLE"), INDIA("RUPEE");
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
    }

}
