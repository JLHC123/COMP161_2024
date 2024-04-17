
public class Person 
{
	private String name;
	private int id_number;
	
	public Person(String name, int id)
	{
		this.name = name;
		this.id_number = id;
	}
	
	public String toString()
	{
		return this.name + " id" + "#: " + this.id_number;
	}
	
	public boolean equals(Object other)
	{
		Person otherPerson = (Person) other;
		if (otherPerson.id_number == this.id_number) 
		{
			return true;
		}
		
		else
		{
			return false;
		}
		
	}
}
