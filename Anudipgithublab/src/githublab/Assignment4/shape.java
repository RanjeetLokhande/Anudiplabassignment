package Assignment4;
class Circle extends shape
{
	public void getArea()
	{
		int r=2;
		double pi=3.14;
		double area = pi*r*r;   // area of  circle
		System.out.println("The Area of circle is " + area);  
	}
}

class Triangle extends Circle
{
	public void getArea()
	{
		int l = 2;
		int h = 2;
		double area = (l*h)/2; // area of Triangle
		System.out.println("The Area of Triangle is " + area);  
	}
}

public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Circle c = new Circle(); //Creating object
          c.getArea();   
          Triangle t = new Triangle(); //Creating object
          t.getArea();    
	}

}