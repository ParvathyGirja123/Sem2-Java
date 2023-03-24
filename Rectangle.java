public class Rectangle
{
	double length;
	double breadth;
	void setdata()
	{
	length=12.45;
	breadth=13;
	System.out.println("Length= "+length);
	System.out.println("Breadth= "+breadth);
	}
	void getarea()
	{
	double area;
	area=length*breadth;
	return area;
	}
	public static void main(String args[])
	{
	Rectangle a=new Rectangle();
	a.setdata();
	a.getarea();
	System.out.println("Area= "+a.getarea());
	}
}	
