/* Given an ArrayList of Integers, ArrayList<Integer>, of length 1 or more, return the largest
element in the ArrayList.
maxElement ( {1, 2, 3} ) → 3
maxElement ( {-1, 0, 2} ) → 2
maxElement ( {9, 2, 5} ) →9
public static int maxElement ( ArrayList<Integer> nums ) {
} */

import java.util.ArrayList;

public class MaxElement_test 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> nums1 = new ArrayList<>();
		nums1.add(1);
		nums1.add(2);
		nums1.add(3);
		System.out.println("maxElement(nums1): " + MaxElement.maxElement(nums1));
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(-1);
		nums2.add(0);
		nums2.add(2);
		System.out.println("maxElement(nums2): " + MaxElement.maxElement(nums2));
		
		ArrayList<Integer> nums3 = new ArrayList<>();
		nums3.add(9);
		nums3.add(2);
		nums3.add(5);
		System.out.println("maxElement(nums3): " + MaxElement.maxElement(nums3));
	}
}
