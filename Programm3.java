import java.io.*;
import java.util.*;
class Programm3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,sum=0;
int n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int key=sc.nextInt();

for(i=0;i<n;i++)
{
if(a[i]==key)
{
break;
}
if(i==n)
{
System.out.println("-1");
}
else
{
System.out.println("i");
}
}
}
}