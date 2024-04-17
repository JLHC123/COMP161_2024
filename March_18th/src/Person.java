import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person>
{
	private String name;
	private List<Double> times;
	
	public Person(String name) 
	{
		this.name = name;
		this.times = new ArrayList<>();
	}

	public void addNewTime(double newTime) 
	{
		times.add(newTime);
	}

	public double fastestTime() 
	{
//		double minTime = this.times.get(0);   // it will crash if the list is empty
		double minTime = Double.MAX_VALUE;
		for (Double time : this.times) {
			minTime = Math.min(minTime, time);
		}
		
		return minTime;
	}
	

	@Override
	public String toString() 
	{
		return this.name;
	}

	@Override
	public int compareTo(Person other) {
		if (this.fastestTime() < other.fastestTime()) {
			return -1;  // return negative if this < other
		}
		else if (this.fastestTime() == other.fastestTime()) {
			return 0;  // return 0 if this == other
		}
		else {
			return 1;  // return positive number if this > other
		}
	}
	
//	@Override
//	public int compareTo(Person other) {
//		return this.name.compareTo(other.name);
//	}
	
}
