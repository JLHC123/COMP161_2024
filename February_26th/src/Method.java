import java.util.ArrayList;

public class Method 
{
	public static int sumArrayList(ArrayList<Integer> nums)
	{
		int sum = 0;
		for (int num:nums)
		{
			sum = sum + num;
		}
		
		return sum;
	}
}
