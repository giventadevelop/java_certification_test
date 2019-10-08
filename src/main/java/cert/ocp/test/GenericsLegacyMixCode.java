package cert.ocp.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsLegacyMixCode {

	public static void main(String[] args) {
		 List list = new ArrayList();
		 list.add("one");
		 list.add("two");
		 list.add(7);
	// compile error commented below
		 /*for (String s: list)
		 System.out.print(s);*/

	}

}
