package cert.ocp.test;

public class StringTests {

	public static void main(String[] args) {


		StringBuilder stb1=new StringBuilder("str1");
		
		String str1=stb1.toString();
		String str2=str1;
		
		System.out.println(str1==str2 );

	}

}
