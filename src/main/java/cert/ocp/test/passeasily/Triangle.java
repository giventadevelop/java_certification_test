package cert.ocp.test.passeasily;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Triangle {
	static double area;
	int b = 2, h = 3;

	public static void main(String[] args) {
		double p, b, h; // line nl
		if (area == 0) {
			b = 3;
			h = 4;
			p = 0.5;
		}
	
		//commented to remove compile error
		//area = p * b * h; // line n2
		System.out.println("Area is " + area);
		
		
		//  Qn - 69 Equal
		
		String strl = "Java";
		String [] str2 = { "J", "a", "v", "a"};
		String str3 = "";
		for (String str : str2) {
		str3 = str3+str;
		}
		boolean bl = (strl == str3);
		boolean b2 = (strl.equals (str3));
		System.out.print (bl+", "+b2);
		
		// Qn 70 compile error Unary replace all...
		List<Integer> codes = Arrays.asList (10, 20);
		UnaryOperator<Double> uo = s -> s +10.0;
		codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));

	}
}