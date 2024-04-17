/* Use a for loop to iterate through numbers 1-100, print out every number that is divisible by 11
 */
public class Question_11 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 100; i ++)
		{
			if (i % 11 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
