public class Rectangle
{
	double length=12.45;
	double breadth=13;
	void setdata()
	{
	System.out.println("Length= "+length);
	System.out.println("Breadth= "+breadth);
	}
	void setarea()
	{
	double area;
	area=length*breadth;
	System.out.println("Area= "+area);
	}
	public static void main(String args[])
	{
	Rectangle a=new Rectangle();
	a.setdata();
	a.setarea();	
	}
}	