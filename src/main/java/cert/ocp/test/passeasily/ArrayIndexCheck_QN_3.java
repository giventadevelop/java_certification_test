package cert.ocp.test.passeasily;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;

public class ArrayIndexCheck_QN_3 {
	
	public static void main(String[] args) {

		char[][] grid = new char[3] [3];
		grid[1][1] = 'x';
		grid[0][0] = '0';
		grid[2][1] = 'x';
		grid[0][1] = '0';
		grid[2][2] = 'x';
		grid[1][2] = '0';
		
		// insert this below and you get three X s in a row sequentially
		grid[2][0] = 'x';
		
		for (int i = 0; i < grid.length; i++) {
		    for (int j = 0; j < grid[i].length; j++) {
		        System.out.print(grid[i][j] + " ");
		    }
		    System.out.println();
		}
		
		Map<Integer, String> books = new TreeMap<>();
		books.put (1007, "A");

		books.put (1002, "C");

		books.put (1001, "B");

		books.put (1003, "B");

		System.out.println (books);
		
			
		int array[] = {10, 20, 30, 40, 50};
		int x = array.length;
		
		
		while (x > 0) {

			System.out.print (" "+array[--x]);
			}

		List<String> colors = Arrays.asList("red", "green", "yellow");

		Predicate<String> test = n -> {
		System.out.println("Searching…");
		return n.contains("red");
		};
		colors.stream()	.filter(c -> c.length() > 3)
		.allMatch(test);
		
		//qn 114
		Path path1 = Paths.get("/app/./sys/");
		Path res1 = path1.resolve("log");
		Path path2 = Paths.get("/server/exe/");
		Path res2 = path2.resolve("/readme/");
		System.out.println(res1);
		System.out.println(res2);
		
		/*
		   while (x > 0) {
			x--;
			System.out.print (" "+array[x]);
		   }
		
		 
		 do {
			x--;
			System.out.print (" "+array[x]);
			} while (x >= 0);


		while (x >= 0) {
			
			System.out.print (" "+array[x]);
			
			x--;
		   }

		 do {
				System.out.print (" "+array[x]);
				x--;
		 } while (x >= 0);


		 while (x > 0) {

			System.out.print (array[--x]);
			}
*/		
		
	
	}

}
