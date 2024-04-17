
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
}
