
public class Car 
{
	private double efficiency;
	private double gallons;
	private double tank;
	private double miles;
	
	public Car(double efficiency)
	{
		this.efficiency = efficiency;
	}
	
	public void addGas(double gallons)
	{
		this.gallons = gallons;
		this.tank = this.gallons + this.tank;
	}
	
	public void drive(double miles)
	{
		this.miles = miles;
		this.gallons = this.gallons - (this.miles / this.efficiency);
	}
	
	public double getGasLevel()
	{
		return this.gallons;
	}
}
