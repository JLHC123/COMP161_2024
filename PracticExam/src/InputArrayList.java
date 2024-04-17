import java.util.ArrayList;

public class InputArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		
		System.out.println(myList);
		System.out.println(InputArrayList.sum(myList));
	}
	
	public static int sum(ArrayList<Integer> list)
	{
		int sum = 0;
		for (int x: list)
		{
			sum += x;
		}
		return sum;
	}
}
