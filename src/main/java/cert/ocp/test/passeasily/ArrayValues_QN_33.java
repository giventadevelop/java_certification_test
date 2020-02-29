/**
 * 
 */
package cert.ocp.test.passeasily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author gain
 *
 */
public class ArrayValues_QN_33 {

	public static int stVar = 100;
	public int var = 200;
	
		public static void main (String[] args) {
			
		    int numbers [ ];
			numbers = new int [2];
			numbers [0] = 10;
			numbers [1] = 20;
			numbers = new int [4];
			numbers [2] = 30;
			numbers [3] = 40;
			for (int x : numbers) {
			System.out.println (" "  + x) ;
			
			}
			
			
			ArrayValues_QN_33 tl = new ArrayValues_QN_33();
			tl.var = 300;
			System. out.println(tl);
			ArrayValues_QN_33 t2 = new ArrayValues_QN_33();
			t2.stVar = 300;
			System.out.println(t2);
			
			List<Integer> list1=Arrays.asList(10,20);
			List<Integer> list2=Arrays.asList(15,30);
			
			Stream.of(list1,list2).flatMap(l->l.stream()).forEach(s->System.out.print(s+" "));
			
			
			String[] arr = {"Hi", "How", "Are", "You"};
			List<String> arrList = new ArrayList<>(Arrays.asList (arr));
			// The below compilation fails since the variable s in sysout is not in scope in if statement
			/*if (arrList.removeIf((String s) -> {return s.length() <= 2;})) {
			System.out.println(s + "removed");
			}*/
			
			ChangeCount check1 = new ChangeCount();
			ChangeCount check2 = new ChangeCount();
			check1.changeCount();
			check2.changeCount();
			// changeCount()
			System.out.println(" ");
			
			System.out.println(" changeCount Part "); 
			System.out.println(check1.count +" : "+ check2.count);
		}
		
		public String toString() {
			return var + ":" + stVar;
			}
		
}


	class ChangeCount {
		static int count = 0;
		int i = 0;
		
		public void changeCount() {
		while (i < 5) {
		i++;
		count++;
	}
	
	}
	
	}
	
	
	

		