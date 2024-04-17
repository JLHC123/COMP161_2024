import java.util.ArrayList;

public class VehicleTest 
{
	public static void main(String[] args)
	{
		Vehicle vehicle1 = new Vehicle(2024, "Atlas Cross Sport", "Volkswagen");
		System.out.println(vehicle1);
		Motor motor1 = new Motor("NEMA 42", "Brushed DC", 10);
		System.out.println(motor1);
		MotorVehicle motorvehicle1 = new MotorVehicle(2024, "Atlas Cross Sport", "Volkswagen", motor1, 5);
		System.out.println(motorvehicle1);
		
		Car car1 = new Car(2024, "Atlas Cross Sport", "Volkswagen", motor1);
		System.out.println(car1);
		Car car2 = new Car(2025, "Atlas Cross Sport", "Volkswagen", motor1);
		System.out.println(car2);
		
		Speedboat speedboat1 = new Speedboat(2024, "Atlas Cross Sportboat", "Volkswagen", motor1, 10, 15);
		System.out.println(speedboat1);
		Speedboat speedboat2 = new Speedboat(2025, "Atlas Cross Sportboat", "Volkswagen", motor1, 10, 15);
		System.out.println(speedboat2);
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		
		ArrayList<Speedboat> boats = new ArrayList<>();
		boats.add(speedboat1);
		boats.add(speedboat2);
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.addAll(cars);
		vehicles.addAll(boats);
		
		System.out.println(cars);
		System.out.println(boats);
		System.out.println(vehicles);
		
		
		
		
		
	}
}
