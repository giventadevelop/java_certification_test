package cert.ocp.test;

public enum EnumGetValue{

	 YES("y"), NO("N");
	
	 private String value;

	 EnumGetValue(String value){
	  this.value = value;
	 }
	

	 public String getValue(){
	  return value;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(EnumGetValue.YES.getValue());
		
		System.out.println(EnumGetValue.YES); 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//the default below prints the name of the enum constant..
		//System.out.println(EnumGetValue.YES);  which is YES
		//return super.toString();
		// or orveride as below to print y
		return this.value;
	}

}
