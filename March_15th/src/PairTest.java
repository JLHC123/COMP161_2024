public class PairTest 
{
	public static void main(String[] args)
	{
		Pair pair1 = new Pair(10, 50);
		int maxpair1 = pair1.max();
		System.out.println(pair1);
		int minpair1 = pair1.min();
		System.out.println("Max: " + maxpair1);
		System.out.println("Min: " + minpair1);
	}
}
