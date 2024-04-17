import java.util.Comparator;

public class Speedboat extends MotorVehicle
{
	private int boatLength;
	
	public Speedboat(int year, String make, String model, Motor motor, int numberOfMotor, int boatLength)
	{
		super(year, make, model, motor, numberOfMotor);
		this.boatLength = boatLength;
	}
	
	public String toString()
	{
		return super.toString() + " " + this.boatLength + "ft";
	}
	
	public static final Comparator<Speedboat> LENGTH_COMPARATOR = new Comparator<Speedboat>() 
	{
		public int compare(Speedboat s1, Speedboat s2)
		{
			return Integer.compare(s1.boatLength, s2.boatLength);
		}
	};
}
