
public class Person implements Comparable<Person>
{
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return this.name;
	}

	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		return this.name.compareTo(other.name);
	}
	
	
}
