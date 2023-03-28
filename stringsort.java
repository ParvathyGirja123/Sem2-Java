import java.util.Arrays;  
public class stringsort 
{  
public static void main(String args[])   
{   
String[] message = {"hii","welcome","to","java","lab"};  
int size = message.length;  
 
for(int i = 0; i<size-1; i++)   
{  
for (int j = i+1; j<message.length; j++)   
{    
if(message[i].compareTo(message[j])>0)   
{    
String temp = message[i];  
message[i] = message[j];  
message[j] = temp;  
}  
}  
}    
System.out.println(Arrays.toString(message));  
}  
} 
