import java.util.*;
public class matrix{
public static void main(String args[]){
int row,col,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:");
row=sc.nextInt();
System.out.println("Enter the number of column:");
col=sc.nextInt();
int a[][]=new int[row][col];
int b[][]=new int[row][col];
int res[][]=new int[row][col];
System.out.println("Enter the numbers of matrix1:");
for(i=0;i<row;i++){
for(j=0;j<col;j++){
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter the numbers of matrix2:");
for(i=0;i<row;i++){
for(j=0;j<col;j++){
b[i][j]=sc.nextInt();
}
}
System.out.println("Sum of matrixes:");
for(i=0;i<row;i++){
for(j=0;j<col;j++){
res[i][j]=a[i][j]+b[i][j];
}
}
for(i=0;i<row;i++){
for(j=0;j<col;j++){
System.out.print(res[i][j]+"\t");
}
System.out.println();
}
}
}
