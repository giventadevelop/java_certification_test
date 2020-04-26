/**
 * 
 */
package cert.ocp.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author gain
 *
 */
public class PathNormalize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	//	Assuming the current directory is /seals/harp/food, what is the result of executing the following code?
				final Path path = Paths.get(".").normalize(); // h1
				
				final Path pathUnNormalised = Paths.get(".");
				
				final Path realPathWithSymbols = Paths.get(".\\..\\..");
				
				System.out.println("pathUnNormalised Path "+pathUnNormalised);
				
				System.out.println(" \".\").normalize() Path "+ path.toString());
				int count = 0;
				for(int i=0; i<path.getNameCount(); ++i) {
				count++;
				}
				System.out.println("count "+count);
				
				System.out.println(" absolute Path "+ path.toAbsolutePath());
				
				try {
					System.out.println(" Real Path "+ path.toRealPath(LinkOption.values()));
					System.out.println(" Real Path "+ realPathWithSymbols.toRealPath(LinkOption.values()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				final Path path6 = Paths.get("..\\.\\relativeTmp\\pathTest"); // h1
				final Path path2 = Paths.get("relativeTmp\\pathTest").normalize(); // h1	
				
System.out.println(" absolute Path "+ path2.toAbsolutePath());

System.out.println(" absolute Path without normalize "+ path6.toAbsolutePath());

				
				try {
					System.out.println(" Real Path "+ path2.toRealPath(LinkOption.values()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				final Path relPathExists = Paths.get(".\\relPathExists\\pathTest").normalize(); // h1	
				
				System.out.println(" relPathExists is  "+ relPathExists);
				
				System.out.println(" absolute Path relPathExists "+ relPathExists.toAbsolutePath());
								
								try {
									System.out.println(" Real Path relPathExists "+ relPathExists.toRealPath(LinkOption.values()));
									
									
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								
								final Path p1 = Paths.get("/usr/src");
								final Path p2 = Paths.get("/usr/../usr/src");
								// Since the above two won't be normailised they aren't equal and path considers the 
								  //String...  soprints false below
								System.out.println(" p1.equals(p2) "+ p1.equals(p2)) ; //

								System.out.println(" Paths.get(\"/usr/../usr/src\").normalize() "+ Paths.get("/usr/../usr/src").normalize()) ; // 
								 
								try {
									Files.isSameFile(p1, p2);
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} // true

								final Path p3 = Paths.get("/usr/src");
								final Path p4 = Paths.get("/usr/src");

								System.out.println(" p3.equals(p4) "+ p3.equals(p4)) ; p3.equals(p4); // 

	}

}
