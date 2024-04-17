import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PersonTest 
{
	public static void main(String[] args)
	{
		List<Person> people = new ArrayList<>();
		people.add(new Person("John"));
		people.add(new Person("Adam"));
		people.add(new Person("Zack"));
		
		System.out.println("Unsorted: ");
		for (Person p: people)
		{
			System.out.println(p);
		}
		
		Collections.sort(people);
		System.out.println();
		System.out.println("Sorted By Name: ");
		for (Person p: people)
		{
			System.out.println(p);
		}
	}
}
