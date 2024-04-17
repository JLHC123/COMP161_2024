import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StudentTest 
{
	public static void main(String[] args)
	{
		Student student1 = new Student("John", 1234);
		Student student2 = new Student("Jake", 1235);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student2);
		studentList.add(student1);
		
		System.out.println("Before sorting: " + studentList);
		Collections.sort(studentList);
		System.out.println("After sorting: " + studentList);
	}
}
