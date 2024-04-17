/* Compute the volume of a right circular cone with the following variables: 
 * r for radius and h for height. V = pi*(r^2)*(h/3) 
 */
public class Question_3 
{
	public static void main(String[] args)
	{
		int r = 10; // Assigning numbers to r and h
		int h = 5;
		var Volume = Math.PI * (Math.pow(r, 2)) * h / 3; // Formula for Cone.
		System.out.println(Volume); // Printing the Volume
		
	}

}
