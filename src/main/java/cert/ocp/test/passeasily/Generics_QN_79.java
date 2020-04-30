package cert.ocp.test.passeasily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Generics_QN_79<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

	public static void main(int[] args) {
		System.out.println("int main " + args[0]);
	}
	
	 static void doStuff() throws ArithmeticException, NumberFormatException, Exception
	{
	 if (Math.random() >1) throw new Exception ("Try again");
	 }

	public static void main(Object[] args) {
		System.out.println("Object main " + args[0]);
		
		 try {
			 doStuff();
			
				 //  below  causes  he exception NumberFormatException is already caught by the alternative Exception
		// }catch (ArithmeticException | NumberFormatException | Exception e) {
		 }catch (ArithmeticException | NumberFormatException  e) {
			 System.out.println (e.getMessage()); }
			 catch (Exception e) {
			 System.out.println (e.getMessage()); }
			
		
	}

	public static void main(String args[]) {
		//QN 88
		System.out.println("String main " + args[0]);
		
		Generics_QN_79<String> type = new Generics_QN_79<>();
		Generics_QN_79 type1 = new Generics_QN_79(); // line nl
		type.set("Java");
		type1.set(100); // line n=
		System.out.print(type.get() + " " + type1.get());

		// QN- 80
		int ii = 0;
		int jj = 7;
		for (ii = 0; ii < jj - 1; ii = ii + 2) {
			System.out.print(ii + " ");
		}

		// QN 87
		List<Student> stds = Arrays.asList(new Student("Jessy", "Java ME", "Chicago"),
				new Student("Helen", "Java EE", "Houston"), new Student("Mark", "Java ME", "Chicago"));
		// stds.stream().collect(Collectors.groupingBy(Student::getCourse)).forEach(src,
		// res) -> System.out.println(scr));

	}
}

	 class Student {
		String course, name, city;
	
		public Student(String name, String course, String city) {
			this.course = course;
			this.name = name;
			this.city = city;
		}
	
		public String toString() {
			return course + ":" + name + ":" + city;
		}
	}

	 
	 
	abstract class A3 {
		 private static int i;
		 public void doStuff(){}
		 public A3(){}

		 }

		 final class Al {

		 public Al() {}
		 }

	 class A2 {
		 private static int A2;
		 
		 private A2(){
			 
			 A2=10;
		 }
		 
		 {
			 A2=10; 
		 }
		 
		 static{
			 A2=10;
		 }

		class a4 {
			
		 protected static final int i;
		 private void doStuff () {}

		 }

		final abstract class A5 {
		 protected static int i;
		 void doStuff() {}
		 abstract void doIt();

		 }
		
		
		class A6 {
			 protected  final int staticfinalVar;
			 
			 protected  final int instancefinalVar;
			 
			 public A6() {
				 staticfinalVar=0;
				// TODO Auto-generated constructor stub
			}
			 
			 public A6(int k) {
				 staticfinalVar=0;
				 
				 // static is class so can be referenced here
				int localVar= methodFinalVar;
					// TODO Auto-generated constructor stub
				}
			 
			 public A6(int k,  String str) {
					// TODO Auto-generated constructor stub
				}
			 
			 
			 private void doStuff () {
				 
				 static final int methodFinalVar=12;
				 
				 instancefinalVar=14;
				 
			 }
			 

			 }
		
	 }
		
		 class A7 {
			 protected final int A7;
			// initialize blank final variable  in the instance initialiser 
			 {
				 A7=0; 
			 }
			 
			 void doStuff() {}
			 public A7() {
				// TODO Auto-generated constructor stub
			}

			 }