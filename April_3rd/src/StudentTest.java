import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentTest 
{

	public static void main(String[] args)
	{
		System.out.println("StudentTest");
		Student student1 = new Student(73, "Dan");
		Student student2 = new Student(43, "Shawn");
		
		Set<Student> set_of_students = new HashSet<>();
		List<Student> list_of_students = new ArrayList<Student>();
		
		list_of_students.add(student1);
		list_of_students.add(student2);
		
		System.out.println("list: " + list_of_students);
		
		Collections.sort(list_of_students);
		System.out.println("list: " + list_of_students);
		
		set_of_students.addAll(list_of_students);
		System.out.println("set: " + set_of_students);
		
		
	}
}