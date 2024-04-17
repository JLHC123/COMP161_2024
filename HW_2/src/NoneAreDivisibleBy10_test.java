/* Given an ArrayList of integers, return true if NONE of the numbers in the ArrayList are 
divisible by 10.
noneAreDivisibleBy10 ( {1, 2, 3} ) → true
noneAreDivisibleBy10 ( {1, 15, -10} ) → false
noneAreDivisibleBy10 ( {0, 0} ) → false
noneAreDivisibleBy10 ( {1000, 3} ) → false
noneAreDivisibleBy10 ( {1001, 1002, 1003, 1004} ) → true
public static boolean noneAreDivisibleBy10 ( ArrayList<Integer> nums ) {
} */

import java.util.ArrayList;

public class NoneAreDivisibleBy10_test 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> nums1 = new ArrayList<>();
		nums1.add(1);
		nums1.add(2);
		nums1.add(3);
		System.out.println("noneAreDivisibleBy10(nums1): " + NoneAreDivisibleBy10.noneAreDivisibleBy10(nums1));
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(1);
		nums2.add(15);
		nums2.add(-10);
		System.out.println("noneAreDivisibleBy10(nums2): " + NoneAreDivisibleBy10.noneAreDivisibleBy10(nums2));
		
		ArrayList<Integer> nums3 = new ArrayList<>();
		nums3.add(0);
		nums3.add(0);
		System.out.println("noneAreDivisibleBy10(nums3): " + NoneAreDivisibleBy10.noneAreDivisibleBy10(nums3));
		
		ArrayList<Integer> nums4 = new ArrayList<>();
		nums4.add(1000);
		nums4.add(3);
		System.out.println("noneAreDivisibleBy10(nums4): " + NoneAreDivisibleBy10.noneAreDivisibleBy10(nums4));
		
		ArrayList<Integer> nums5 = new ArrayList<>();
		nums5.add(1001);
		nums5.add(1002);
		nums5.add(1003);
		nums5.add(1005);
		System.out.println("noneAreDivisibleBy10(nums5): " + NoneAreDivisibleBy10.noneAreDivisibleBy10(nums5));
	}
}
