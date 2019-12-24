import java.io.*;
import java.util.*;
class Num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0;

int a[]=new int[]{3,4,56,67,66};

int smallest=a[0];
int largest=a[0];

for(int i=1;i<a.length;i++){

if(a[i]<smallest)
{
smallest=a[i];
 }
if(a[i]>largest)
{ 
largest=a[i]; 
}
}
System.out.println(smallest+" "+largest); 
}
}