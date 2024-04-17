public class RegisterDemo1 
{
	public static void main(String[] args)
	{
		CashRegister1 reg1 = new CashRegister1();
		reg1.addItem(6);
		reg1.addItem(8);
		double amountDue = reg1.getTotal();
		System.out.println("Amount Due: " + amountDue);
	}
}
