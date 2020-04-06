package cert.ocp.test.passeasily;

public class Test_QN_116 {
	public static final int MIN = 1;

	public static void main(String[] args) {
		int x = args.length;
		if (checkLimit(x)) { // line nl
			System.out.println("Java SE");
		} else {
			System.out.println("Java EE");
		}
		
		//int [] array;
		// The above gives -  he local variable array may not have been initialized
		int [] array=new int[2];
		
		array[0]=10;

		array[1] =20;

		System.out.print (array[0] + ": "+ array[1]);
		
		System.out.println("");
		
		// 119
		 float varl = (12_345.01 >= 123_45.00) ? 12_456 : 124_56.02f;
		 float var2 = varl + 1024;
		 System.out.println ("var2 "+ var2) ;
		 
		 //120
		 System.out.println ("QN: 120 ") ;
		 String[] arr = {"A", "B", "C", "D"};
		 for (int i = 0; i < arr.length; i++) {
		 System.out.print(arr[i] + " ");
		 if (arr[i].equals("C")) {
		 continue;
		 }
		 System.out.println("Work done");
		 break;
		 }
		
	}

	public static boolean checkLimit(int x) {
		return (x >= MIN) ? true : false;
	}
}