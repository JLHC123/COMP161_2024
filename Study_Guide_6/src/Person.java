
public class Person 
{
	private String name;
	private String friendNames;
	private int friendCount;
	
	public Person(String name)
	{
		this.name = name;
		this.friendNames = "";
		this.friendCount = 0;
	}
	
	public void befriend(Person p)
	{
		if (!friendNames.contains(p.getName()))
		{
			friendNames += p.getName() + " ";
		}
		
		friendCount ++;
	}
	
	public void unfriend(Person p)
	{
		friendNames = friendNames.replace(p.getName() + " ", "");
		friendCount --;
	}
	
	public String getFriendNames()
	{
		return friendNames;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getFriendCount()
	{
		return friendCount;
	}
}
