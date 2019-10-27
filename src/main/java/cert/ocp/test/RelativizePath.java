/**
 * 
 */
package cert.ocp.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author gain
 *
 */
public class RelativizePath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Path path3= Paths.get("C:\\code_backup\\Nimi");
		Path path4= Paths.get("C:\\code_backup\\aws");
		Path path5= path3.relativize(path4);
		
		System.out.println(path5);
		
		System.out.println(path3.resolve(path5));
		
		System.out.println(path3.resolve(path4));
		
		System.out.println(path5.normalize());

	}
	
	

}
