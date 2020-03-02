/**
 * 
 */
package cert.ocp.test.passeasily;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author gain
 *
 */
public class ArrayValues_QN_33 {

	public static int stVar = 100;
	public int var = 200;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {

		int numbers[];
		numbers = new int[2];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers = new int[4];
		numbers[2] = 30;
		numbers[3] = 40;
		for (int x : numbers) {
			System.out.println(" " + x);

		}

		ArrayValues_QN_33 tl = new ArrayValues_QN_33();
		tl.var = 300;
		System.out.println(tl);
		ArrayValues_QN_33 t2 = new ArrayValues_QN_33();
		t2.stVar = 300;
		System.out.println(t2);

		List<Integer> list1 = Arrays.asList(10, 20);
		List<Integer> list2 = Arrays.asList(15, 30);

		Stream.of(list1, list2).flatMap(l -> l.stream()).forEach(s -> System.out.print(s + " "));

		String[] arr = { "Hi", "How", "Are", "You" };
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		// The below compilation fails since the variable s in sysout is not in
		// scope in if statement
		/*
		 * if (arrList.removeIf((String s) -> {return s.length() <= 2;})) {
		 * System.out.println(s + "removed"); }
		 */

		ChangeCount check1 = new ChangeCount();
		ChangeCount check2 = new ChangeCount();
		check1.changeCount();
		check2.changeCount();
		// changeCount()
		System.out.println(" ");

		System.out.println(" changeCount Part ");
		System.out.println(check1.count + " : " + check2.count);

		// QN 122
		BookReg b1 = new BookReg();
		// The method read(String) from the type Book is not visible
		// b1.read("Java Programing");
		BookReg b2 = new EBook();
		//// The method read(String) from the type Book is not visible
		// b2.read("http://ebook.com/ebook");
		
		
		// QN 126
				@SuppressWarnings("rawtypes")
				List colors = new ArrayList();
				colors.add("green");
				colors.add("red");
				colors.add("blue");
				colors.add("yellow");
				colors.remove(2);
				colors.add(3,"cyan");
				System.out.print(colors);

		// QN 124
		try (ImageScanner ir = new ImageScanner(); ImagePrinter iw = new ImagePrinter()) {
			ir.scanImage();
			iw.printImage();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		
		// QN 133
		
		System.out.println(" QN 133 " );
		List<String> str = Arrays.asList ("my", "pen", "is", "your", "pen");
		Predicate<String> test = s -> {
		int i = 0;
		boolean result = s.contains ("pen");
		System.out.print(i++ + ":");
		return result;
		};
		str.stream()
		.filter(test)
		.findFirst()
		.ifPresent(System.out ::print);
		
		// QN 131
		System.out.println("  " );
		System.out.println(" QN 131 " );
		
		Student_QN_131[] students = new Student_QN_131[3];
		students[1] = new Student_QN_131 ("Richard");
		students[2] = new Student_QN_131 ("Donald");
		for (Student_QN_131 s : students) {
		System.out.println(" " + s.name);
		}
		
		
		ExceptionDecl_QN_125 xobj = new ExceptionDecl_QN_125 ();
		xobj.printFileContent ();
		
	}

	public String toString() {
		return var + ":" + stVar;
	}

}

class ChangeCount {
	static int count = 0;
	int i = 0;

	public void changeCount() {
		while (i < 5) {
			i++;
			count++;
		}

	}

}

class BookReg {
	private String read(String bname) {
		return "Read" + bname;
	}
}

// EBook.java:
class EBook extends BookReg {
	public String read(String url) {
		return "View" + url;
	}
}

// QN 124

class ImageScanner implements AutoCloseable {
	public void close() throws Exception {
		System.out.print("Scanner closed.");
	}

	public void scanImage() throws Exception {
		System.out.print("Scan.");
		throw new Exception("Unable to scan.");
	}
}

class ImagePrinter implements AutoCloseable {
	public void close() throws Exception {
		System.out.print("Printer closed.");
	}

	public void printImage() {
		System.out.print("Print.");
	}
}

class ExceptionDecl_QN_125 {

public void printFileContent () throws IOException {
/* code goes here */

throw new IOException ();

}
}

class Student_QN_131 {
String name;
public Student_QN_131 (String name) {
this.name = name;
}

}
