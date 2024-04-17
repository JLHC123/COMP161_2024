import java.util.ArrayList;
import java.util.List;

public class NumsListTest 
{
	public static void main(String[] args)
	{
		System.out.println("NumsListTest");
		List<Double> nums = new ArrayList<>();
		nums.add(34.0);
		nums.add(12.3);
		System.out.println(nums);
		
		NumsList nums_list = new NumsList(nums);
		System.out.println(nums_list);
		System.out.println(nums_list.max());
// 		System.out.println(nums_list.min());
	}
}
