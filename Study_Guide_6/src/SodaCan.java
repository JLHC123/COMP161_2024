
public class SodaCan 
{
	private double height;
	private double radius;
	
	public SodaCan(double height, double radius)
	{
		this.height = height;
		this.radius = radius;
	}
	
	public double getSurfaceArea()
	{
		return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
	}
	
	public double getVolume()
	{
		return height * Math.PI * Math.pow(radius, 2);
	}
}
