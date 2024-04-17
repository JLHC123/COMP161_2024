/*Given an ArrayList of integers, return true if NONE of the numbers in the ArrayList are 
divisible by 10.
noneAreDivisibleBy10 ( {1, 2, 3} ) → true
noneAreDivisibleBy10 ( {1, 15, -10} ) → false
noneAreDivisibleBy10 ( {0, 0} ) → false
noneAreDivisibleBy10 ( {1000, 3} ) → false
noneAreDivisibleBy10 ( {1001, 1002, 1003, 1004} ) → true
public static boolean noneAreDivisibleBy10 ( ArrayList<Integer> nums ) {
} */

import java.util.ArrayList;

public class NoneAreDivisibleBy10 
{
	public static boolean noneAreDivisibleBy10(ArrayList<Integer> nums)
	{
		for (int i = 0; i < nums.size(); i++) 
		{
			if (nums.get(i) % 10 == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}
