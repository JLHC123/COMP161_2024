
public class Vehicle 
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
}
