package cert.ocp.test.passeasily;
public class Vehicle {
String type = "4W";
int maxSpeed = 100;

Vehicle(){
	
}
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
