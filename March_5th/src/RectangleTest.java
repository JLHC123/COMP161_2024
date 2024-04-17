import java.util.ArrayList;
import java.util.List;

public class RectangleTest 
{
	public static void main(String[] args)
	{
		Rectangle rect1 = new Rectangle(5, 10);
		String torect1 = rect1.toString();
		System.out.println(torect1);
		int area = rect1.area();
		System.out.println(rect1);
		System.out.println(area);
		
		List<Rectangle> list_of_rectangle = new ArrayList<Rectangle>();
		list_of_rectangle.add(rect1);
		list_of_rectangle.add(new Rectangle(4, 6));
		System.out.println(list_of_rectangle);
	}
}
