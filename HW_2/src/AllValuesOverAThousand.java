/* Given an ArrayList of doubles return an ArrayList that consists of all the values over 1,000 
in the original ArrayList.
allValuesOverAThousand ( {1234.1, 3.0} ) → {1234.1}
allValuesOverAThousand ( {-2000.1, 3.0} ) → {}
allValuesOverAThousand ( {212.5, 2222.6, 1500.0} ) → {2222.6, 1500.0}
public static ArrayList<Double> allValuesOverAThousand ( ArrayList<Double> nums ) {
} */

import java.util.ArrayList;

public class AllValuesOverAThousand 
{
	public static ArrayList<Double> allValuesOverAThousand(ArrayList<Double> nums)
	{
		// Use Double instead of Integer if fractional values are being used
		ArrayList<Double> result = new ArrayList<>();
		// Make a new List both here and in the test
		
		for (int i = 0; i < nums.size(); i++)
		{
			if (nums.get(i) > 1000)
			{
				result.add(nums.get(i));
			}
		}
		
		return result;
	}
}
