import java.util.ArrayList;
import java.util.List;

public class FractionTest 
{
	public static void main(String[] args)
	{
		Fraction fraction1 = new Fraction(2, 4);
		String toFraction1 = fraction1.toString();
		System.out.println(toFraction1);
		Fraction fraction2 = new Fraction(1, 4);
		String toFraction2 = fraction2.toString();
		System.out.println(toFraction2);
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(5);
		System.out.println(myList);
		
		List<Fraction> list_of_fraction = new ArrayList<Fraction>();
		list_of_fraction.add(fraction1);
		list_of_fraction.add(fraction2);
		list_of_fraction.add(new Fraction(4,5));
		System.out.println(list_of_fraction);
		
		
	}
}
