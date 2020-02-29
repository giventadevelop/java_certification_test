package cert.ocp.test.passeasily;
public class Test {
public static void main(String[] args) {
try {
	methodl ();
}
catch (MyException ne) {
System. out.print ("A");
}
}
public static void methodl() { // line ni
try {
throw Math.random() > 0.5 ?new MyException() :new RuntimeException ();
}
catch (RuntimeException re) {
System. out.print ("B");
}
}
}