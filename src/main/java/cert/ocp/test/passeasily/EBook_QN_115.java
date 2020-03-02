	package cert.ocp.test.passeasily;
	
	interface Downloadable {
		public void download();
	}
	
	interface Readable extends Downloadable { // line ni
		public void readBook();
	}
	
	abstract class Book implements Readable { // line n2
		public void readBook() {
			System.out.println("Read Book");
		}
	}
	
	public class EBook_QN_115 extends Book { // line n3
		public void readBook() {
			System.out.println("Read E-Book");
		}
	}