/* Use a while loop to prompt the user for an integer and 
 * get the product of all the numbers input by the user. 
 * To end the while loop, allow the user to type “end”
 * 
 */
import java.util.Scanner;
public class Question_10 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integers to calculate product, enter 'stop' to stop program.");
		int product = 1;
		boolean stop = false;
		while (!stop)
		{
			if (in.hasNextInt()) 
			{
				int number = in.nextInt();
				product = product * number;
			}
			else
			{
				String input = in.next();
				if (input.equals("stop"))
				{
					stop = true;
				}
				else
				{
					System.out.println("Invalid input. Please enter a integer or type 'stop' to stop the program.");
				}
			}
		
		}
		System.out.println("Program has stopped.");
		System.out.println("The total product is " + product + ".");
		in.close();
	}

}