// Jorge Z:\COMP 161\Delete
public class Person 
{
	private String name;

	public Person(String name)
	{
		this.name = name;
	}
	
	public String getString()
	{
		return this.name;
	}
	
	public void setName(String newname)
	{
		this.name = newname;
	}
	
	public String toString()
	{
		return "Name: " + this.name;
	}
}
