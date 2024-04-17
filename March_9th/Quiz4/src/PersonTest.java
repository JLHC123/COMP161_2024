// Jorge Z:\COMP 161\Delete
public class PersonTest 
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Dave");
		System.out.println(p1);
		String getpi = p1.getString();
		System.out.println(getpi);
		p1.setName("Daniel");
		System.out.println(p1.getString());
		
	}

	
}
