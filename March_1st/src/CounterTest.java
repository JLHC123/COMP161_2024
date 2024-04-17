public class CounterTest 
{
	public static void main(String[] args)
	{
		System.out.println("Counter");
		Counter tally = new Counter();
		System.out.println(tally);
		Counter tally2 = new Counter();
		int tally_value = tally.getValue();
		System.out.println("tally's value " + tally_value);
		tally.count();
		System.out.println("tally's value " + tally.getValue());
		System.out.println("tally2's value " + tally2.getValue());
	}
}
