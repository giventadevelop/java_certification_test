/**
 * 
 */
package cert.ocp.test;

/**
 * @author gain
 *
 */
public enum EnumCurrencyAbstractMethod {

	US("DOLLAR") {
		@Override
		public String getEnumAbstractMethod() {
			// TODO Auto-generated method stub
			return "US_AbstractMethod";
		}
	}, RUSSIA("RUBLE") {
		@Override
		public String getEnumAbstractMethod() {
			// TODO Auto-generated method stub
			 return "RUSSIA_AbstractMethod";
		}
	}, INDIA("RUPEE") {
		@Override
		public String getEnumAbstractMethod() {
			// TODO Auto-generated method stub
			 return "INDIA_AbstractMethod";
		}
		
	} ;
	
	public String getCurrency() {
		// TODO Auto-generated method stub
		return this.currency;
	}
    
	private String currency;
 
    private EnumCurrencyAbstractMethod(String currency) {
        this.currency = currency;
    }
 
    public abstract String getEnumAbstractMethod() ;
 
    @Override
    public String toString() {
        return currency;
    }
    
    
    public static void main(String[] args) {
        for (EnumCurrencyAbstractMethod Currency : EnumCurrencyAbstractMethod.values()) {
            System.out.println(Currency.getCurrency() + " is the currecny of " + Currency.name());
        }
        
        EnumCurrencyAbstractMethod   usEnum=    EnumCurrencyAbstractMethod.US; 
        
        System.out.println(" usEnum.getCurrency() "+ usEnum.getCurrency());
        
        System.out.println(" usEnum.getEnumAbstractMethod() "+ usEnum.getEnumAbstractMethod());
        
    }
}
