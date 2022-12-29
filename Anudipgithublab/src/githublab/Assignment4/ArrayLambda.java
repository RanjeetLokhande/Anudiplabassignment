package Assignment4;
import java.util.ArrayList;
import java.util.List;
public class ArrayLambda {

	public static void main(String[] args) {
		
List<Integer> number = new ArrayList<Integer>();
		
		number.add(113);
		number.add(44);
		number.add(35);
		number.add(1);
		number.add(66);
		number.add(63);
		
		number.forEach((n)->
		{
			if(n%2==0) 
			{
				System.out.println("Number is Even :"+n);
			}
			else 
			{
				System.out.println("Number is Odd :"+n);
			}
		});
	}

}
