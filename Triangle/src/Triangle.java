public class Triangle 
{
	private double base;
	private double height;
	
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public double area()
	{
		return this.base * this.height * 0.5;
	}
}
