/**
 * 
 */
package cert.ocp.test;

import java.io.File;

/**
 * @author gain
 *
 */
public class FileOldIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * The code compiles, so D and E are incorrect. There is a bug in the
		 * method in that file.delete() should be executed at the end of the
		 * method for both files and directories alike. As written, the method
		 * will delete all files within a directory but none of the directories
		 * themselves. Therefore, A and B are incorrect and C is correct. F is
		 * correct, because most methods in the File class that interact with
		 * the file system are capable of throwing an exception at runtime, such
		 * as when the directory does not exist.
		 */
		deleteTree(new File("C:\\code_backup\\java_ocp_test"));
	}

	public static void deleteTree(File file) {
		if (!file.isFile()) {
			System.out.println("directory name is  :" + file.getName());
			for (File entry : file.listFiles())
				deleteTree(entry);

		} else {
			System.out.println("deleting :" + file.getName());
			file.delete();
		}

	}

}
