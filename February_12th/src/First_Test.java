// import java.util.Scanner;
import java.util.Arrays;
public class First_Test 
{
	public static void main(String[] args) // not an instance method
	{
		// Scanner in = new Scanner(System.in);
		System.out.println("hi");
		double result = myAdd(4.2, 0.4);
		// class/static non-instance methods don't need a object. before them
		// e.g. unlike the next method of System objects in.next()
		System.out.println(result);
		System.out.println(Math.PI);
		
		int[] nums = {1, 2, 3};
		System.out.println("nums: " + Arrays.toString(nums));
		System.out.println("nums[0]: " + nums[0]);

	}
	
	private static double myAdd(double n1, double n2)
	{
		// private: only callable within this class
		return n1 + n2;
	}
}
