import java.util.Comparator;
public class Vehicle implements Comparable<Vehicle>
{
	private int year;
	private String make;
	private String model;
	
	public Vehicle(int year, String make, String model)
	{
		this.year = year;
		this.make = make;
		this.model = model;
	}
	
	public String toString()
	{
		return this.year + " " + this.make + " " + this.model;
	}

	@Override
	public int compareTo(Vehicle other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.year, other.year);
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public static final Comparator<Vehicle> MAKE_COMPARATOR = new Comparator<Vehicle>()
	{
		@Override
		public int compare(Vehicle v1, Vehicle v2)
		{
			return v1.getMake().compareTo(v2.getMake());
		}
	};
	
}
