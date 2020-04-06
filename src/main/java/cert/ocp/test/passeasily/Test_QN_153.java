package cert.ocp.test.passeasily;

import cert.ocp.test.protectedpack.passeasily.Acc;

public class Test_QN_153 extends Acc {

	public static void main(String[] args) {
		Acc obj = new Test_QN_153();

		//obj.r   gives compile error since only Test_QN_152 can access it outside package
		//System.out.println( "s = " + obj.s + " r = " + obj.r);

		System.out.println("Only s is visible: => child.member with protected modifier");
		
		// QN- 80
				int ii = 0;
				int jj = 7;
				for (ii = 0; ii < jj - 1; ii = ii + 2) {
					System.out.print(ii + " ");
				}
	}
}

