/*Given an ArrayList of doubles return an ArrayList that consists of all the values over 1,000 
in the original ArrayList.
allValuesOverAThousand ( {1234.1, 3.0} ) → {1234.1}
allValuesOverAThousand ( {-2000.1, 3.0} ) → {}
allValuesOverAThousand ( {212.5, 2222.6, 1500.0} ) → {2222.6, 1500.0}
public static ArrayList<Double> allValuesOverAThousand ( ArrayList<Double> nums ) {
} */

import java.util.ArrayList;

public class AllValuesOverAThousand_test 
{
	public static void main(String[] args)
	{
		ArrayList<Double> nums1 = new ArrayList<>();
		nums1.add(1234.1);
		nums1.add(3.0);
		ArrayList<Double> result1 = AllValuesOverAThousand.allValuesOverAThousand(nums1);
		System.out.println(result1);
		
		ArrayList<Double> nums2 = new ArrayList<>();
		nums2.add(-2000.1);
		nums2.add(3.0);
		ArrayList<Double> result2 = AllValuesOverAThousand.allValuesOverAThousand(nums2);
		System.out.println(result2);
		
		ArrayList<Double> nums3 = new ArrayList<>();
		nums3.add(212.5);
		nums3.add(2222.6);
		nums3.add(1500.0);
		ArrayList<Double> result3 = AllValuesOverAThousand.allValuesOverAThousand(nums3);
		System.out.println(result3);
	}

}
