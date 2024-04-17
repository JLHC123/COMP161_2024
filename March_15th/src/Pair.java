public class Pair 
{
	private int a;
	private int b;
	
	public Pair(int a1, int b1)
	{
		this.a = a1;
		this.b = b1;
	}
	
	public int max()
	{
		if (this.a > this.b)
		{
			return this.a;
		}
		
		else
		{
			return this.b;
		}
	}
	
	public int min()
	{
		if (this.a < this.b) 
		{
			return this.a;
		}
		
		else
		{
			return this.b;
		}
	}
}
