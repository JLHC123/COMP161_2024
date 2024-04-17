
public class PersonTest 
{
	public static void main(String[] args)
	{
		Person person1 = new Person("Henry");
		Person person2 = new Person("Alice");
		Person person3 = new Person("Albert");
		Person person4 = new Person("Hallow");
		
		person1.befriend(person2);
		person1.befriend(person3);
		System.out.println(person1.getFriendNames());
		System.out.println(person1.getName() + "'s " + "Friend Count: " + person1.getFriendCount());
		
		person1.unfriend(person3);
		person1.getFriendNames();
		person1.unfriend(person3);
		System.out.println(person1.getFriendNames());
		System.out.println(person1.getName() + "'s " + "Friend Count: " + person1.getFriendCount());
		
		person1.befriend(person4);
		System.out.println(person1.getFriendNames());
		System.out.println(person1.getName() + "'s " + "Friend Count: " + person1.getFriendCount());
	}
}
