package cert.ocp.test.passeasily;

public class PrimMethods_QN_140 {
	int al;

	public static void doProduct(int a) {
		a = a * a;
	}

	public static void doString(StringBuilder s) {
		s.append(" " + s);
	}

	public static void main(String[] args) {
		PrimMethods_QN_140 item = new PrimMethods_QN_140();
		item.al = 11;
		StringBuilder sb = new StringBuilder("Hello");
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.al);
		System.out.println(i + " " + sb + " " + item.al);
	}
}