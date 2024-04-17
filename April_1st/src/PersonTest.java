import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class PersonTest 
{
	public static void main(String[] args)
	{
		Person person1 = new Person("John", 1234);
		Person person2 = new Person("Jake", 2334);
		Person person3 = new Person("Jake", 2334);
		
		List<Person> list = new ArrayList<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		System.out.println(list);
		

		Set<Person> set = new HashSet<Person>();
		set.add(person1);
		set.add(person2);
		set.add(person3);		
		System.out.println(set);
		System.out.println("person2 == person3: " + (person2 == person3)); 
		
	}
}
