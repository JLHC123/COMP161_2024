/* Prompt a user for the year they were born, 
 * calculate their age in a variable called age and print out the users age
 */
import java.util.Scanner; // Import Scanner
public class Question_2 
{
	public static void main(String[] args) // Getting the hang of this
	{
		Scanner in = new Scanner(System.in);
		int currentYear = 2024;
		System.out.println("What year were you born in?");
		int birthYear = in.nextInt(); // Make sure to always make variables
		// We assume user will input a valid year
		int age = (currentYear - birthYear);
		System.out.println("You are " + age + " years old.");
		in.close(); // close the Scanner
		
	}

}
