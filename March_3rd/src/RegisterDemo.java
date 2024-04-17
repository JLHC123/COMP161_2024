public class RegisterDemo 
{
	public static void main(String[] args)
	{
		CashRegister reg1 = new CashRegister();
		reg1.addItem(5);
		reg1.addItem(7);
		double amountDue = reg1.getTotal();
		System.out.println("Amount Due: " + amountDue);
	}
}
