/* Assign 4 integers to variables x, y, h, k. 
 * Assign values to all variables and compute the radius of a circle. 
 * Print out circle_radius using an f string. 
 * circle_radius = sqrt((x-h)^2+(y-k)^2)
 */
public class Question_4 
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 5;
		int h = 4;
		int k = 20;
		double circle_radius = Math.sqrt(Math.pow((x - h), 2) + Math.pow((y - k), 2));
		System.out.printf("%20.5f", circle_radius);
	}
}
