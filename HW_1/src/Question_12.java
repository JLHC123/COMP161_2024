/* Prompt a user for an integer. 
 * Use a for loop to calculate that input to the power of numbers 1-5 (inclusive) and print. 
 * For example, if the user inputs 2, print 2, 4, 8, 16, 32.
 */
import java.util.Scanner;
public class Question_12 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a integer and the program will calculate to the power of 1 to 5 and print them.");
		int integer = in.nextInt();
		for (int i = 1; i <= 5; i ++)
		{
			System.out.println(Math.pow(integer, i));
		}
		in.close();
	}
}
