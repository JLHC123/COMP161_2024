public class Rectangle 
{
	int sideone;
	int sidetwo;
	
	Rectangle(int side1, int side2)
	{
		this.sideone = side1;
		this.sidetwo = side2;
	}
	
	Rectangle()
	{
		
	}
	
	public String toString()
	{
		return "Side 1: " + this.sideone + " Side 2: " + this.sidetwo;
	}
	
	int area()
	{
		return this.sideone * this.sidetwo;
	}
}
