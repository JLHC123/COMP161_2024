public class CashRegister 
{
	private double[] prices = new double [100];
	private int count;
	
	public void addItem(double price)
	{
		prices[count] = price;
		count++;
	}
	
	public double getCount()
	{
		return count;
	}
	
	public double getTotal()
	{
		double total = 0;
		for (int i = 0; i < count; i++)
		{
			total = total + prices[i];
		}
		return total;
	}
}
