/* Prompt the user for 3 integers. Use if/else statements to determine if the largest number 
 * of the 3 inputs is divisible by only 3, only 5, both 3 and 5, or neither. Print this. 
 * For example, if the number is 15, the output should be divisible by 3 and 5.
 */
import java.util.Scanner;
public class Question_8 
{
	public static void main(String[] args)
	{
		System.out.println("Enter three numbers, the largest of which will be checked if it's divisible by 3 and/or 5 or neither.");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		in.close();
		
		int largest;
		
		if (num1 > num2 && num1 > num3)
		{
			largest = num1;
		}
		else if (num2 > num3)
		{
			largest = num2;
		}
		else
		{
			largest = num3;
		}
		System.out.println(largest + " is the largest.");
		if (largest % 3 == 0 && largest % 5 == 0)
		{
			System.out.println(largest + " is divisible by 3 and 5.");
		}
		else if (largest % 3 == 0)
		{
			System.out.println(largest + " is divisible by 3.");
		}
		else if (largest % 5 == 0)
		{
			System.out.println(largest + " is divisible by 5.");
		}
		else
		{
			System.out.println(largest + " is neither divisible by 3 nor by 5.");
		}
	}

}
