
public class Hangar {

	public static void main(String[] args) {
	
		// Creating instances of Car
		Car kia = new Car("Kia", 20000);
		Car opel = new Car("Opel", 100);
		Car audi = new Car("Audi", 50);
		
		// Creating instance of Car
		Boat msRhine = new Boat("MS Rhine", 40000);
		Boat msMoby = new Boat ("MS Moby Dick", 100000);
		
		System.out.println(kia.doStuff());
		System.out.println(opel.doStuff());
		System.out.println(audi.doStuff());
		System.out.println(msRhine.doStuff());
		System.out.println(msMoby.doStuff());
	}

}
