
public class Microwave 
{
	private int time;
	private int level;
	
	public Microwave()
	{
		
	}
	
	public void increaseTime30()
	{
		this.time = this.time + 30;
	}
	
	public void setLevelto1()
	{
		this.level = 1;
	}
	
	public void setLevelto2()
	{
		this.level = 2;
	}
	
	public void reset()
	{
		this.time = 0;
		this.level = 0;
	}
	
	public int getTime()
	{
		return this.time;
	}
	
	public void Start()
	{
		System.out.println("Cooking for " + this.time + " seconds at level " + this.level);
		
		int remainingTime = this.time;
		while (remainingTime >= 0)
		{
			System.out.println(remainingTime);
			remainingTime = remainingTime - 1;
		}
	}
}
