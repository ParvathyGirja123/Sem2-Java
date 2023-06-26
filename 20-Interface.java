import java.util.*;
interface Student
{
	void read1(String sname,float s,String admsn);
} 
interface Sports
{
	void read2(float p);
} 
class Result implements Student, Sports
{
	public String name,admsn;
	public float total;
	public float point;
	public void read1(String sname,float s,String regno)
	{
		name=sname;
		total=s;
		admsn=regno;
	}
	public void read2(float pt)
	{
	 	point=pt;
	}
	public void display()
	{
		System.out.println("\nDETAILS OBTAINED :\n");
		System.out.println("Register number: "+admsn);
		System.out.println("Name: " +name);
		System.out.println("CGPA Obtained: "+total);
		System.out.println("Score in sports: "+point);
	}

} 
class interfaces
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		float pt,total;
		System.out.print("Admission number: ");
		String admsn=sc.nextLine();
		System.out.print("Name: ");
		String name=sc.nextLine();
		System.out.print("CGPA obtained: ");
		total=s.nextFloat();
		System.out.print("Score in sports: ");
		pt=s.nextFloat();

		Result o =new Result();
		o.read1(name,total,admsn);
		o.read2(pt);
		o.display();
	}
}
