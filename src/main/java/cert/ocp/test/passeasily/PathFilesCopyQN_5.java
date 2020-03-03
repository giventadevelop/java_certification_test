/**
 * 
 */
package cert.ocp.test.passeasily;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author gain
 *
 */
public class PathFilesCopyQN_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// QN 141
		
		System.out.println ("  QN 141" );
		
		Path pl = Paths.get("/Pics/MyPic.jpeg");
		System.out.println (pl.getNameCount() +"3" + pl.getName(1) + "3" + pl.getFileName());
		
		System.out.println ("  QN 5" );
		File sourceFile = new File( "C:\\code_backup\\java_ocp_test\\path_copy_dest\\path_copy_src\\path_copy_test_file.txt" );
		Path sourcePath = sourceFile.toPath();

		File destFile = new File( "C:\\code_backup\\java_ocp_test\\path_copy_dest" );
		Path destPath = destFile.toPath();

		try {
			Files.copy( sourcePath, destPath );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//    The above will throw since the last element getFileName is considered an existing File wheteher its directory or
		//file and its considered existent and since no replace attribute this will throw wexception
		//java.nio.file.FileAlreadyExistsException: C:\code_backup\java_ocp_test\path_copy_dest

	}

}
