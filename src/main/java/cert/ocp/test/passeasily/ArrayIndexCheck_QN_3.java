package cert.ocp.test.passeasily;

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
				
	
	}

}
