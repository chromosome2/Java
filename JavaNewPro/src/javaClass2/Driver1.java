package javaClass2;

public class Driver1 {

	public static void main(String[] args) {
		Driver chulsu=new Driver();
		Bus bus=new Bus();
		Taxi taxi=new Taxi();
		chulsu.drive(bus);
		chulsu.drive(taxi);
		Vehicle vehicle=new Bus();
		chulsu.drive(vehicle);

	}

}
