
public class BatteryTest 
{
	public static void main(String[] args)
	{
		Battery battery1 = new Battery(3000);
		double remainingBattery1 = battery1.getRemainingCapacity();
		System.out.println(remainingBattery1);
		battery1.drain(1000);
		remainingBattery1 = battery1.getRemainingCapacity();
		System.out.println(remainingBattery1);
		battery1.charge();
		remainingBattery1 = battery1.getRemainingCapacity();
		System.out.println(remainingBattery1);
		
	}
}
