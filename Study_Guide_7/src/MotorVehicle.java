
public class MotorVehicle extends Vehicle
{
	private int year;
	private String make;
	private String model;
	private Motor motor;
	private int numberOfMotor;
	
	public MotorVehicle(int year, String make, String model, Motor motor, int numberOfMotor)
	{
		super(year, make, model);
		this.motor = motor;
		this.numberOfMotor = numberOfMotor;
	}
	
	public int getHP()
	{
		return this.numberOfMotor * this.motor.getHorsepower();
	}
	
	public String toString()
	{
		return super.toString() +  " " + getHP() + "HP";
	}
	
}
