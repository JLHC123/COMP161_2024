import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PersonTest 
{
	public static void main(String[] args) 
	{
		LocalDate dateOfBirth1 = LocalDate.of(2003, 11, 25);  
		Person person1 = new Person("Dan", dateOfBirth1);
	
		LocalDate dateOfBirth2 = LocalDate.of(1990, 01, 11);  
		Person person2 = new Person("Shawn", dateOfBirth2);
		
		LocalDate dateOfBirth3 = LocalDate.of(2005, 3, 12);
		LocalDate expectedGraduationDate1 = LocalDate.of(2024, 6, 4);
		Student student1 = new Student("John", dateOfBirth3, expectedGraduationDate1, "Math");
		
		LocalDate dateOfBirth4 = LocalDate.of(2001, 6, 7);
		LocalDate expectedGraduationDate2 = LocalDate.of(2024, 6, 5);
		Student student2 = new Student("Jake", dateOfBirth4, expectedGraduationDate2, "Computer Science");
		
		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		
		System.out.println("Unsorted Students: ");
		for (Student s: students)
		{
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Sorted By Name: ");
		Collections.sort(students);
		for (Student s: students)
		{
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Sorted By Date Then Name:");
		Collections.sort(students, Student.DATE_NAME_COMPARATOR);
		for (Student s: students)
		{
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Sorted By Major Then Name:");
		Collections.sort(students, Student.MAJOR_NAME_COMPARATOR);
		for (Student s: students)
		{
			System.out.println(s);
		}

		List<Person> people = new ArrayList<>();
		people.add(person2);
		people.add(person1);
		people.addAll(students);
		
		System.out.println();
		System.out.println("Unsorted People: "); 
		for (Person p: people)
		{
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Sorted By Name: ");
		Collections.sort(people);
		for (Person p: people)
		{
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Sorted By Date Of Birth: ");
		Collections.sort(people, Person.DOB_COMPARATOR);
		for (Person p: people)
		{
			System.out.println(p);
		}
	}
}