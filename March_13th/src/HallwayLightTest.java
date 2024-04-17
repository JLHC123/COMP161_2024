
public class HallwayLightTest 
{
	public static void main(String[] args) 
	{
		System.out.println("HallwayLight");
		HallwayLight light = new HallwayLight();
		System.out.println(light);
		System.out.println("first switch: " + light.getFirstSwitchState()); 
//		System.out.println("second switch: " + light.getSecondSwitchState()); 
//		System.out.println("lamp: " + light.getLampState());
		light.toggleFirstSwitch();
		System.out.println("first switch: " + light.getFirstSwitchState()); 
		light.toggleFirstSwitch();
		System.out.println("first switch: " + light.getFirstSwitchState()); 
	}
}