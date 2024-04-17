import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.* // not preferred

public class PersonTest 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Shawn");
		p1.addNewTime(10.5);
		p1.addNewTime(11.5);
		p1.addNewTime(121.5);
		
		Person p2 = new Person("Dan");
		p2.addNewTime(134.0);

		System.out.println(p1 + "'s fastest time is " + p1.fastestTime());
		
		List<Person> runners = new ArrayList<>();
		runners.add(p1);
		runners.add(p2);
		
		System.out.println("before sorting: " + runners);		
		Collections.sort(runners);
		System.out.println("after sorting: " + runners);		
	}
}