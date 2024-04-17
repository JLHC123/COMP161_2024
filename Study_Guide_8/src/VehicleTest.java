import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class VehicleTest 
{
	public static void main(String[] args)
	{
		List<Speedboat> boats = new ArrayList<>();
		boats.add(new Speedboat(2020, "Boatswagen", "Extreme", new Motor("Big", "Super Best", 1000000), 2, 100));
		boats.add(new Speedboat(2000, "Boatswagen", "Fast", new Motor("Big", "Best", 1000), 1, 30));
		
		System.out.println("Unsorted: ");
		for (Speedboat b: boats)
		{
			System.out.println(b);
		}
		
		System.out.println();
		System.out.println("Sorted By Length: ");
		Collections.sort(boats, Speedboat.LENGTH_COMPARATOR);
		for (Speedboat b: boats) 
		{
			System.out.println(b);
		}
		
		List<MotorVehicle> vehicles = new ArrayList<>();
		vehicles.add(new MotorVehicle(2001, "Volkswagen", "Wagen", new Motor("Medium", "Great", 10000), 1));
		vehicles.add(new MotorVehicle(2001, "Ford", "Super", new Motor("Big", "Best", 100000), 1));
		vehicles.addAll(boats);
		
		System.out.println();
		System.out.println("Unsorted: ");
		for (MotorVehicle v: vehicles)
		{
			System.out.println(v);
		}
		
		System.out.println();
		System.out.println("Sorted By Year: ");
		Collections.sort(vehicles);
		for (MotorVehicle v: vehicles)
		{
			System.out.println(v);
		}
		
		System.out.println();
		System.out.println("Sorted By Make: ");
		Collections.sort(vehicles, Vehicle.MAKE_COMPARATOR);
		for (MotorVehicle v: vehicles)
		{
			System.out.println(v);
		}
		
		System.out.println();
		System.out.println("Sorted By Horsepower: ");
		Collections.sort(vehicles, MotorVehicle.HP_COMPARATOR);
		for (MotorVehicle v: vehicles)
		{
			System.out.println(v);
		}
	}
}
