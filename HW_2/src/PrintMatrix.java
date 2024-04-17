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

public class PrintMatrix 
{
	public static void printMatrix(ArrayList<ArrayList<Integer>> nums)
	{
		for (ArrayList<Integer> row : nums)
		{
			for (int num : row)
			{
				System.out.print(num + " "); // use .print so that it can stay within the same line
			}
			System.out.println(); // println makes a new line
		}
	}
}
