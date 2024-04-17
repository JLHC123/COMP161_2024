public class Counter
{
	private int value;
	
	public void count()
	{
		this.value = this.value + 1;
	}
	
	public void undo()
	{
		if (this.value > 0)
		{
			this.value = this.value - 1;
		}
		
		else
		{
			System.out.println("Can't undo further.");
		}
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public void setLimit(int maximum)
	{
		if (value > maximum)
		{
			System.out.println("Limit Exceeded.");
		}
	}

}