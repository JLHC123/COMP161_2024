/* Given an array of integers, return the index of the first occurrence of a negative number. 
Return -1 if the ArrayList doesn’t contain any negative numbers.
indexOfFirstNegativeNumber ( {1, 2, 3} ) → -1
indexOfFirstNegativeNumber ( {0, 6} ) → -1
indexOfFirstNegativeNumber ( {2, 2, -2} ) → 2
indexOfFirstNegativeNumber ( {-1, 0, 0} ) → 0
public static int indexOfFirstNegativeNumber ( ArrayList<Integer> nums ) {
} */
import java.util.ArrayList;

public class IndexOfFirstNegativeNumber_test 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> nums1 = new ArrayList<>();
		nums1.add(1);
		nums1.add(2);
		nums1.add(3);
		System.out.println("indexOfFirstNegativeNumber(nums1): " + IndexOfFirstNegativeNumber.indexOfFirstNegativeNumber(nums1));
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(0);
		nums2.add(6);
		System.out.println("indexOfFirstNegativeNumber(nums2): " + IndexOfFirstNegativeNumber.indexOfFirstNegativeNumber(nums2));
		
		ArrayList<Integer> nums3 = new ArrayList<>();
		nums3.add(2);
		nums3.add(2);
		nums3.add(-2);
		System.out.println("indexOfFirstNegativeNumber(nums3): " + IndexOfFirstNegativeNumber.indexOfFirstNegativeNumber(nums3));
		
		ArrayList<Integer> nums4 = new ArrayList<>();
		nums4.add(-1);
		nums4.add(0);
		nums4.add(0);
		System.out.println("indexOfFirstNegativeNumber(nums4): " + IndexOfFirstNegativeNumber.indexOfFirstNegativeNumber(nums4));
	}
}
