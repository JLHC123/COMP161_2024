import java.util.HashSet;

public class SetStuff 
{
	public static void main(String[] args)
	{
		HashSet<Integer> myhash = new HashSet<>();
		
		myhash.add(5);
		myhash.add(3);
		myhash.add(1);
		
		System.out.println(myhash.toString());
		
		myhash.remove(5);
		
		System.out.println(myhash.toString());
	}
}
