package cert.ocp.test.passeasily;

public class Vehicle_QN_128 {
	int x;

	Vehicle_QN_128() {
		this(10); // line n1
	}

	Vehicle_QN_128(int x) {
		this.x = x;
	}

	public static void main(String[] args) {

	}

}

class Car_QN_128 extends Vehicle_QN_128 {
	int y;

	Car_QN_128() {
		super();
		//Constructor call must be the first statement in a constructor either super / this you cannot have both 
		//this(20); // line n2
	}

	Car_QN_128(int y) {
		this.y = y;
	}

	public String toString() {
		return super.x + " : " + this.y;
	}

}
