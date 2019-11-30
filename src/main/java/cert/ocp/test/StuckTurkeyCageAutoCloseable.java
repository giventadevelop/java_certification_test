package cert.ocp.test;
public class StuckTurkeyCageAutoCloseable implements AutoCloseable {
public void close() /*throws Exception*/ {
//throw new Exception("Cage door does not close");
}
public static void main(String[] args) {
try (StuckTurkeyCageAutoCloseable t = new StuckTurkeyCageAutoCloseable()) {
System.out.println("put turkeys in");
}
}
 }