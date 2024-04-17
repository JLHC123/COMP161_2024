
public class Battery 
{
	private double capacity;
	private double remainingAmount;
	
	public Battery(double capacity)
	{
		this.capacity = capacity;
		this.remainingAmount = this.capacity;
	}
	
	public void drain(double amount)
	{
		this.remainingAmount = this.remainingAmount - amount;
	}
	
	public void charge() 
	{
		this.remainingAmount = this.capacity;
	}
	
	public double getRemainingCapacity()
	{
		return this.remainingAmount;
	}
}
