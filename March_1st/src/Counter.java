public class Counter 
{
	private int value; // instance variable = difference objects can have different values

	public int getValue() 
	{
		return this.value;
	}
	
	public void count()
	{
		this.value = this.value + 1;
	}
}
