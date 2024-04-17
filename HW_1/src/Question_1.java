/* Prompt the user for their age and name.
 * Make a print statement using concatenation to say that person's name and age.
 */
import java.util.Scanner; // Imports Scanner
public class Question_1 
{
	public static void main(String[] args)
	{
		// Make a Scanner
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine(); // Use String and in.nextLine for Strings
		System.out.println("How old are you?");
		int age = in.nextInt(); // Use int and nextInt for integers
		// Also use double and in.nextDouble for fractions
		System.out.println("Your name is " + name + ". You are " + age + " years old.");
		in.close(); // closes Scanner
	}

}
