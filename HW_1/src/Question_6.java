/* Compute the amount a user must pay in taxes. Given an income, 
 * calculate how much a user owes in taxes assuming all income is taxed in the same bracket.
0 - 9,999 -> 0%
10,000 - 24,999 -> 12.5%
25,000 - 52,499 -> 21.25%
52,200 -> 99,000 -> 33%
99,001+ -> 42.55%
*/
import java.util.Scanner;
public class Question_6 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your income to calculate your tax");
		int income = in.nextInt();
		double tax;
		if (income <= 9999)
		{
			tax = 0.0;
		}
		else if (income <= 24999)
		{
			tax = 0.125;
		}
		else if (income <= 52499)
		{
			tax = 0.2125;
		}
		else if (income <= 99000)
		{
			tax = 0.33;
		}
		else
		{
			tax = 0.4255;
		}
		
		double owe = (income * tax);
		System.out.printf("You owe $%.2f in taxes", owe); // rounds to second decimal place
		in.close();
	}
}