public class CashRegister1 
{
	private int itemCount;
	private double totalPrice;
	
	public void addItem(double price)
	{
		totalPrice = totalPrice + price;
		itemCount++;
	}
	
	public double getCount()
	{
		return itemCount;
	}
	
	public double getTotal()
	{
		return totalPrice;
	}
}
