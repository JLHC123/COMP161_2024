/* print the values of a 2d ArrayList so that the elements in the first row are printed on the first 
line, the elements in the second row are printed on the second line, and so on. (For full credit, 
don’t print the ArrayLists directly – instead use a second embedded for loop.)
printMatrix ( {{1, 2}, {2, 3}} )
// should print
1 2
3 4
printMatrix ( {{2, 8}, {4, 10}, {6, 12}} ) 
// should print
2 8
4 10
6 12
public static void printMatrix ( ArrayList< ArrayList<Integer> > nums ) {
} */

import java.util.ArrayList;
import java.util.List;

public class PrintMatrix_test 
{
	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> nums1 = new ArrayList<>();
		nums1.add(new ArrayList<>(List.of(1, 2)));
		nums1.add(new ArrayList<>(List.of(3, 4)));
		
		System.out.println("Matrix 1: ");
		PrintMatrix.printMatrix(nums1);
		
		ArrayList<ArrayList<Integer>> nums2 = new ArrayList<>();
		nums2.add(new ArrayList<>(List.of(2, 8)));
		nums2.add(new ArrayList<>(List.of(4, 10)));
		nums2.add(new ArrayList<>(List.of(6, 12)));
		
		System.out.println("Matrix 1: ");
		PrintMatrix.printMatrix(nums2);
	}
}
