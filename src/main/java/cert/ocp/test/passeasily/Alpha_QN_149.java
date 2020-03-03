package cert.ocp.test.passeasily;

public class Alpha_QN_149 {
	int ns;
	static int s;

	Alpha_QN_149(int ns) {
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}

	void doPrint() {
		System.out.println("ns = " + ns + "s = " + s);
	}

	public static void main(String[] args) {
		Alpha_QN_149 ref1 = new Alpha_QN_149(50);
		Alpha_QN_149 ref2 = new Alpha_QN_149(125);
		Alpha_QN_149 ref3 = new Alpha_QN_149(100);
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
	}
}