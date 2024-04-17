public class Quiz2 
{
	// all instance variable should be preceded by this.
	private String name;
	
	// once a constructor is created the default constructor 'disappears'
	
	public Quiz2(String nameParameter)
	{
		System.out.println("Constructor");
		this.name = nameParameter;
	}
	
	// do the above for tomorrow quiz
	
	public String toString()
	{
		return "Quiz2: name = " + this.name;
	}
}
