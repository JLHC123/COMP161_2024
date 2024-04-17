/* Prompt the user for 3 floats (a, b, and c) and print the Pythagorean theorem a^2+b^2=c^2 
 * if the sum of a^2 and b^2 actually equals c^2. 
 * Otherwise print what c should actually be or that those values are invalid for the Pythagorean theorem.
 */
import java.util.Scanner;
public class Question_7 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b, c to see if they fit in the Pythagorean theorem.");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
			// checks if Pythagorean Theorem works
		{
			System.out.println("Yes, " + a + "^2 + " + b + "^2 equals " + c + "^2"); 
		}
		else
		{
			System.out.println("No, " + a + "^2 + " + b + "^2 does not equal " + c + "^2");
		}
		in.close();
	}
}
