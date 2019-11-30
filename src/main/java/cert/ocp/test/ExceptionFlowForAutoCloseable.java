package cert.ocp.test;

public class ExceptionFlowForAutoCloseable implements AutoCloseable {
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}

	public static void main(String[] args) {
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
		}
		
		
		/*  adding the below finally won't work...
		 finally {
			// TODO Auto-generated catch block
			
		}*/
	
	
	}
}