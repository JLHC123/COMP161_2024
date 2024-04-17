import java.util.Comparator;
import java.time.LocalDate;

public class Student extends Person
{
	private String name;
	private LocalDate dateOfBirth;
	private LocalDate expectedGraduationDate;
	private String major;
	
	public Student(String name, LocalDate dateOfBirth, LocalDate expectedGraduationDate, String major)
	{
		super(name, dateOfBirth);
		this.expectedGraduationDate = expectedGraduationDate;
		this.major = major;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public LocalDate getExpectedGraduationDate()
	{
		return this.expectedGraduationDate;
	}
	
	public String getMajor()
	{
		return this.major;
	}

	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		return this.name.compareTo(other.name);
	}
	
	public String toString()
	{
		return super.toString() + ", Expected Graduation Date: " + this.expectedGraduationDate + ", Major: " + this.major;
	}
	
	public static final Comparator<Student> DATE_NAME_COMPARATOR = new Comparator<Student>() 
	{
		public int compare(Student s1, Student s2)
		{
			int dateComparison = s1.getExpectedGraduationDate().compareTo(s2.getExpectedGraduationDate());
			if (dateComparison != 0)
			{
				return dateComparison;
			}
			
			else
			{
				return s1.getName().compareTo(s2.getName());
			}
		}
	};
	
	public static final Comparator<Student> MAJOR_NAME_COMPARATOR = new Comparator<Student>() 
	{
		public int compare(Student s1, Student s2)
		{
			int majorComparison = s1.getMajor().compareTo(s2.getMajor());
			if (majorComparison != 0) 
			{
				return majorComparison;
			}
			
			else
			{
				return s1.getName().compareTo(s2.getName());
			}
		}
	};
	
}
