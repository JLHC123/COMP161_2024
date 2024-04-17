public class Student implements Comparable<Student>
{
	private String name;
	private int id;
	
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return this.name + ", " + this.id;
	}

	@Override
	public int compareTo(Student otherStudent) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, otherStudent.id);
	}
	
	
}
