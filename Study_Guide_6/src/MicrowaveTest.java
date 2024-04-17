
public class MicrowaveTest 
{
	public static void main(String[] args)
	{
		Microwave microwave1 = new Microwave();
		int microwavetime1 = microwave1.getTime();
		System.out.println(microwave1);
		System.out.println(microwavetime1);
		microwave1.increaseTime30();
		microwavetime1 = microwave1.getTime();
		System.out.println(microwavetime1);
		microwave1.setLevelto1();
		microwave1.Start();
		microwave1.reset();
		microwave1.Start();
	}
}
