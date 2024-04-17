/* Given an ArrayList of Integers, ArrayList<Integer>, of length 1 or more, return the largest
element in the ArrayList.
maxElement ( {1, 2, 3} ) → 3
maxElement ( {-1, 0, 2} ) → 2
maxElement ( {9, 2, 5} ) →9
public static int maxElement ( ArrayList<Integer> nums ) {
} */

import java.util.ArrayList;

public class MaxElement 
{
	public static int maxElement(ArrayList<Integer> nums)
	// make sure int maxElement also exists in MaxElement_test
	{
		int max = nums.get(0);
		for (int num:nums)
		{
			if (num > max)
			{
				max = num;
				
			}
		}
		return max;
	}
}
