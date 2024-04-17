/* Given an array of integers, return the index of the first occurrence of a negative number. 
Return -1 if the ArrayList doesn’t contain any negative numbers.
indexOfFirstNegativeNumber ( {1, 2, 3} ) → -1
indexOfFirstNegativeNumber ( {0, 6} ) → -1
indexOfFirstNegativeNumber ( {2, 2, -2} ) → 2
indexOfFirstNegativeNumber ( {-1, 0, 0} ) → 0
public static int indexOfFirstNegativeNumber ( ArrayList<Integer> nums ) {
} */

import java.util.ArrayList;

public class IndexOfFirstNegativeNumber 
{
	public static int indexOfFirstNegativeNumber(ArrayList<Integer> nums)
	{
		for (int i = 0; i < nums.size(); i++)
		{
			if (nums.get(i) < 0)
			{
				return i;
			}
		}
		
		return -1;
		
	}
}
