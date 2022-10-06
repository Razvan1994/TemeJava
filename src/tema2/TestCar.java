package tema2;

public class TestCar {

	public static void main(String[] args) {
		
		Car car1 = new Car ("ford","v6");
		System.out.println(car1.carDetails());
		
		Car car2 = new Car ("bmw","v8");
		car2.type = "sedan";
		System.out.println(car2.carDetails());
		System.out.println(car1.carDetails());
	

	}

}
