import java.time.LocalDate;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Instructor extends Person
{
	private BigDecimal salary;
	private static final DecimalFormat FORMAT = new DecimalFormat("$###,###.00");
	
	public Instructor(String name, LocalDate dateOfBirth, String salary)
	{
		super(name, dateOfBirth);
		this.salary = new BigDecimal(salary);
	}
	
	public String toString()
	{
		return super.toString() + ", Salary: " + FORMAT.format(salary);
	}
}
