package cert.ocp.test.passeasily;

public class CanvasInterface_QN_52 {

	public static void main(String[] args) {


		int x = 1;
		int y = 0;
		if(x++ > ++y) {
		System.out.print("Hello ");
		} else {
		System.out.print("Welcome ");
		}
		System.out.print ("Log " + x + ":" + y);
		
		
		//
		
		
		String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C','D');
        ta = ta.concat(tb);
        System.out.println(ta);
        
        
        int i = 10;
        int j = 20;
        int k=j += i/ 5;
        System.out.print(i +": "+j +" : "+ k);
        
        

	}

}


class Canvas implements Drawable {
public void draw () { }
}
 abstract class Board extends Canvas { }
 class Paper extends Canvas {
protected void draw (int color) { }
}
 class Frame extends Canvas implements Drawable {
public void resize () { }
}
 interface Drawable {
public abstract void draw ();
}

