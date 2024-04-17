import java.time.LocalDate;
import java.util.ArrayList;

public class PersonTest 
{
	public static void main(String[] args)
	{
		LocalDate person1DateOfBirth = LocalDate.of(2004, 5, 26);
		Person person1 = new Person("John", person1DateOfBirth);
		
		LocalDate student1DateOfBirth = LocalDate.of(2005, 10, 19);
		LocalDate student1ExpectedGraduationDate = LocalDate.of(2027, 6, 1);
		Student student1 = new Student("Jude", student1DateOfBirth, 1234, "Math", student1ExpectedGraduationDate);
		
		LocalDate instructor1DateOfBirth = LocalDate.of(1997, 1, 1);
		Instructor instructor1 = new Instructor("Jake", instructor1DateOfBirth, "75000");
		
		ArrayList<Person> listOfPeople = new ArrayList<>();
		listOfPeople.add(person1);
		listOfPeople.add(student1);
		listOfPeople.add(instructor1);
		
		for (Person p: listOfPeople)
		{
			System.out.println(p);
		}
	}
}
