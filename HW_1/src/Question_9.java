/* Prompt a user for an input, while the input is not “stop”, continue prompting the user for an input
 */
import java.util.Scanner;
public class Question_9 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This program will return your inputs. Type 'stop' to stop the program.");
		String input = in.nextLine();
		while (!input.equals("stop")) 
		// only "stop" will work, other variations will not work.
		{
			System.out.println(input);
			input = in.nextLine();
		}
		System.out.println("The program has stopped.");
		in.close();
	}

}
