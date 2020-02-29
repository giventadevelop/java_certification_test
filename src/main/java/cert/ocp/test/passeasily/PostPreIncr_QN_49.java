package cert.ocp.test.passeasily;

public class PostPreIncr_QN_49 {

	public static void main(String[] args) {


		int x = 1;
		int y = 0;
		if(x++ > ++y) {
		System.out.print("Hello ");
		} else {
		System.out.print("Welcome ");
		}
		System.out.print ("Log " + x + ":" + y);
		
		
		//
		
		
		String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C','D');
        ta = ta.concat(tb);
        System.out.println(ta);

	}

}

