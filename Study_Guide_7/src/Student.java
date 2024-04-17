import java.time.LocalDate;

public class Student extends Person
{
	private int id;
	private String major;
	private LocalDate expectedGraduationDate;
	
	public Student(String name, LocalDate dateOfBirth, int id, String major, LocalDate expectedGraduationDate)
	{
		super(name, dateOfBirth);
		this.id = id;
		this.major = major;
		this.expectedGraduationDate = expectedGraduationDate;
	}
	
	public String toString()
	{
		return super.toString() + ", Student ID: " + this.id + ", Major: " + this.major + ", Expected Graduation Date: " + this.expectedGraduationDate;
	}
}
