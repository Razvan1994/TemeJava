package tema2;

public class Car {

	public static String brand;
	public static String type;
	public static String engine;
	
	public Car (String brand, String engine) {
		this.brand = brand;
		this.engine = engine;
		this.type = "Suv";
	}
	public static String carDetails () {
		return "All " +brand + " cars are "+ engine + " and are of type " + type;
	}
}
