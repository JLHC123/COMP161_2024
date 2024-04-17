import java.time.LocalDate;
import java.util.Comparator;

public class Person implements Comparable<Person>
{
	private String name;
	private LocalDate dateOfBirth;
	
	public Person(String name, LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
		this.name = name;
	}
	
	@Override
	public int compareTo(Person other) 
	{
		return this.name.compareTo(other.name);
	}
	
	public String toString()
	{
		return this.name + ", Date Of Birth: " + this.dateOfBirth;
	}
	
	public LocalDate getDateOfBirth()
	{
		return this.dateOfBirth;
	}
	
	public static final Comparator<Person> DOB_COMPARATOR = new Comparator<Person>()
	{
		public int compare(Person p1, Person p2)
		{
			return p1.getDateOfBirth().compareTo(p2.getDateOfBirth());
		}
	};

	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		return 0;
	}
			
}
