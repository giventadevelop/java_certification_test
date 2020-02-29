package cert.ocp.test.passeasily;
public class FuelNotAvailException extends Exception { }
	class Vehicle2 {
	void ride() throws FuelNotAvailException { //line n1
	System.out.println("Happy Journey!");
	}
	}
	class SolarVehicle extends Vehicle2 {
	void ride () throws FuelNotAvailException { //line n2
	super.ride();
	}
	}