public class AliasDemo 
{
	public static void main(String[] args)
	{
		double balance1 = 1000;
		double balance2 = balance1;
		balance2 = balance2 - 100;
		System.out.println(balance1);
		BankAccount acct1 = new BankAccount(1000);
		BankAccount acct2 = acct1;
		acct2.withdraw(100);
		System.out.println(acct1.getBalance());
	}
}
