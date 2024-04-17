
public class CounterTest
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		Counter tally = new Counter();
		tally.undo();
		tally.count();
		tally.count();
		System.out.println("Tally count: " + tally.getValue());
		tally.undo();
		System.out.println("Tally count: " + tally.getValue());
	}
}