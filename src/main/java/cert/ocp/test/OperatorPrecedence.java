package cert.ocp.test;

public class OperatorPrecedence {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		int z = ++x * y--;
		
		System.out.println("Z is "+z);

	}

}
