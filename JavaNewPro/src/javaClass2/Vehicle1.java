package javaClass2;

public class Vehicle1 {

	public static void main(String[] args) {
		Vehicle vehicle;
		vehicle=new Bus();
		vehicle.run();
		
		Bus bus=(Bus)vehicle;
		bus.run();
		bus.checkFare();
		
		vehicle=new Taxi();
		vehicle.run();
	}

}
