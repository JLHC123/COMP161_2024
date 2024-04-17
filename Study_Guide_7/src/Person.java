import java.time.LocalDate;

public class Person 
{
	private String name;
	private LocalDate dateOfBirth;
	
	public Person(String name, LocalDate dateOfBirth)
	{
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String toString()
	{
		return this.name + ", DOB:" + this.dateOfBirth;
	}
}
