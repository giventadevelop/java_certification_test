package cert.ocp.test.passeasily;

public class CarCheck_QN_2 {
	
	public static void main(String[] args) {

	int [] arr={1,2,3,4};
	
	int i=0;
	
	do{
		System.out.print(arr[i]+ "");
		i++;
	}while(i<arr.length-1);
	
	}

}

public class Vehicle {
String type = "4W";
int maxSpeed = 100;
Vehicle (String type, int maxSpeed) {
this.type = type;
this.maxSpeed = maxSpeed;
}
}
class Car extends Vehicle {
String trans;
Car (String trans) { //line nil
this.trans = trans;
}
Car (String type, int maxSpeed, String trans) {
this (trans);
super (type, maxSpeed);
 //fline n2
}
}
