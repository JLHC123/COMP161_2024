import java.util.Objects;

public class Student implements Comparable<Student>
{
	private int ID;
	private String name;
	
	public Student(int iD, String name) 
	{
		ID = iD;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return ID == other.ID;
	}

	@Override
	public int compareTo(Student other)
	{
//		return this.ID - other.ID;
		if (this.ID < other.ID)
		{
			return -1;
		}
		else if (this.ID > other.ID)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	
}