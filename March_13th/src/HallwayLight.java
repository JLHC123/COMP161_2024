public class HallwayLight 
{
	private int first_switch = 0; // 0 for down, 1 for up
	private int second_switch = 0; // 0 for down, 1 for up
	private int lamp = 0; // 0 for off, 1 for on (lamp is off when switches match)
	
	public int getFirstSwitchState() 
	{
		return this.first_switch;
	}
	public int getSecondSwitchState()
	{
		return this.second_switch;
	}
	public int getLampState() 
	{
		return this.lamp;
	}
	public void toggleFirstSwitch()
	{
		if (this.first_switch == 1)
		{
			this.first_switch = 0;			
		}
		else 
		{
			this.first_switch = 1;
		}
	}
//	public void toggleSecondSwitch()
}