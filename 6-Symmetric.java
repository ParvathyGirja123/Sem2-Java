import java.util.Scanner;

class symmetric
{
public static void main(String args[])
{
int i,j,r,c,f=0;
Scanner n=new Scanner(System.in);
System.out.println("enter the number of rows:");
r=n.nextInt();
System.out.println("enter the number of columns");
c=n.nextInt();
if(r!=c)
{
System.out.println("not symmetric");
}
else
{
int a[][]=new int[r][c];
System.out.println("enter the elemnts of matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=n.nextInt();
}
}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]!=a[j][i])
{
f=1;
break;
}
}
}
if(f==1)
{
System.out.println("not symmetric");
}
else
{
System.out.println("symmetric");
}
}
}
}
