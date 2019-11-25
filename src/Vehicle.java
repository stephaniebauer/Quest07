public abstract class Vehicle {
	
	//attributes
	private String brand;
	private int kilometers;
	
	//constructors
	public Vehicle(String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = kilometers;
	}
	
	//gettters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getKilometers() {
		return kilometers;
	}
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	//abstract method
	public abstract String doStuff();
	
	
	

}
