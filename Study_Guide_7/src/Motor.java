
public class Motor 
{
	private String size;
	private String type;
	private int horsepower;
	
	public Motor(String size, String type, int horsepower)
	{
		this.size = size;
		this.type = type;
		this.horsepower = horsepower;
	}
	
	public String toString()
	{
		return this.size + " " + this.type + " " + this.horsepower;
	}
	
	public int getHorsepower()
	{
		return this.horsepower;
	}
}
