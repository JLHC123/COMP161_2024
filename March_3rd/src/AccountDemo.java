public class AccountDemo 
{
	public static void main(String[] args)
	{
		BankAccount acct1 = new BankAccount();
		BankAccount acct2 = new BankAccount();
		acct1.withdraw(500);
		acct2.deposit(200);
		System.out.println("Account 1: " + acct1);
		System.out.println("Account 2: " + acct2);
	}
}
