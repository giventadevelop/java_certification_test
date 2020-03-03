package cert.ocp.test.passeasily;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee_QN_157 {
	String dept, name;

	public Employee_QN_157(String d, String n) {
		dept = d;
		name = n;
	}

	public String toString() {
		return getDept() + " : " + getName();
	}

	public String getDept() {
		return dept;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		List<Employee_QN_157> emps = Arrays.asList (new Employee_QN_157 ("sales", "Ada"),
				new Employee_QN_157 ("sales", "Bob"),
				new Employee_QN_157 ("hr", "Bob"),
				new Employee_QN_157 ("hr", "Eva"));
				Stream<Employee_QN_157> s = emps.stream().sorted(Comparator.comparing ( (Employee_QN_157 e) -> e.getDept())
				.thenComparing((Employee_QN_157 e) -> e.getName()));
				List<Employee_QN_157> eSorted = s.collect (Collectors.toList());
				System. out .println(eSorted) ;
		
	}
}
