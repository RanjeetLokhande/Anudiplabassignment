package Assignment4;
import java.util.ArrayList;
import java.util.List;


	interface Addition
{
	public int Adder(int x, int y);
}
public class FunctionalInterface {

	public static void main(String[] args) {
		
		List<String> name=new ArrayList<String>(); 
		name.add("Ranjeet");
		
		name.forEach((m)->  
		{
			System.out.println(m.toUpperCase());  // use UpperCase method
			
		});
		
		Addition a=(n,m)->  
		{
			return n+m;
		};
		
		System.out.println(a.Adder(3, 9));
	}

}
