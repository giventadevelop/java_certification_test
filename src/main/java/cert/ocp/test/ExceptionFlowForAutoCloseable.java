package cert.ocp.test;

public class ExceptionFlowForAutoCloseable implements AutoCloseable {
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}

	public static void main(String[] args) throws Exception  {
		/*try (ExceptionFlowForAutoCloseable t = new ExceptionFlowForAutoCloseable()) {
			System.out.println("put turkeys in");
		}*/
	
		try (ExceptionFlowForAutoCloseable t = new ExceptionFlowForAutoCloseable()) {
			System.out.println("put turkeys in");
		} 
		/*  you need to have this below catch or throws clause to handle the exception since finally
		doesn't deal with exception its just a final step..
*/		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			/*if you try to add the below gives compile error 'Unhandled exception type Exception'
			 * adding the below finally won't help and also you add a throws clause to the method statement to remove the error
			 * but throwinga  aruntimeexception won't cause any error and you don't need an additional try catch to enclose or need a throews
			 * declaration for the method statement.*/ 
			//throw new Exception("Cage door does not close");
			throw new RuntimeException("Cage door does not close");
		} finally {
			// TODO Auto-generated catch block
			/* if it is a checked exception thrown it should be declared in  a throws clause or try catch even if 
			its is inside a finally clause and never hurts and can avoid the above if its a RuntimeException*/
			throw new Exception("exception in finally");
		}
		
		
		/*  adding the below finally won't work...*/
		
	
	
	}
}