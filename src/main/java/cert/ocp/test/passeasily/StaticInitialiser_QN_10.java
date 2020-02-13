package cert.ocp.test.passeasily;

public class StaticInitialiser_QN_10 {
	
	static int count;
	StaticInitialiser_QN_10(int x, int y){
	
		++count;
	}
	
	static{
		count=0;
	}
	
	public static void main(String[] args) {

		StaticInitialiser_QN_10  stl1= new StaticInitialiser_QN_10(1, 2);
		StaticInitialiser_QN_10  stl2= new StaticInitialiser_QN_10(1, 2);
		StaticInitialiser_QN_10  stl3= new StaticInitialiser_QN_10(1, 2);
		
		stl1=null;
		
		stl2=stl3;
		
		System.out.println(  stl3.count);
		
		System.out.println( StaticInitialiser_QN_10.count);
		
	}

}
