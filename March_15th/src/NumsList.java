import java.util.List;

public class NumsList 
{
	List<Double> nums;
	
	public NumsList(List<Double> nums)
	{
		this.nums = nums;
	}
	
	public double max()
	{
		double max = Double.MIN_VALUE;
		for (double n: nums)
		{
			if (n > max)
			{
				max = n;
			}
		}
		
		return max;
	}
	
	public double min()
	{
		double min = Double.MIN_VALUE;
		for (double n: nums)
		{
			if (n < min)
			{
				min = n;
			}
		}
		
		return min;
	}
}
