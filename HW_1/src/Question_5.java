/* Prompt a user for their age and print out whether or not they are old enough to vote
*/
import java.util.Scanner;
public class Question_5 
{
	public static void main(String[] args) 
	{
		System.out.println("What is your age?");
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		int votingAge = 18;
		if (age >= votingAge)
		{
			System.out.println("You are old enough to vote");
		}
		else
		{
			System.out.println("You are not old enough to vote");
		}
		in.close();
		
	}
}
