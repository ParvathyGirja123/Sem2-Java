package Arithmatic;
interface Operations
{
	public int add(int x,int y);
	public int sub(int x,int y);
	public int mul(int x,int y);
	public double div(int x,int y);
	public int mod(int x,int y);
}
public class Mathematics implements Operations
{
public int add(int x,int y)
{
return x+y;
}
public int sub(int x,int y)
{
return x-y;
}
public int mul(int x,int y)
{
return x*y;
}
public double div(int x,int y)
{
return (double)x/y;
}
public int mod(int x,int y)
{
return x%y;
}
}

