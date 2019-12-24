import java.io.*;
import java.util.*;
public class Sorting {
public static void main(String []args) {
Scanner sc=new Scanner(System.in);
int n,i,temp,j,sum=0;

n=sc.nextInt();
int[] a=new int[n];



 for (i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        for ( i = 0; i < n; i++) 
        {
            for (j = 0; j < n-1; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];

                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
for(i=0;i<n-1;i++)
{
System.out.println(a[i]);
}
System.out.println(a[n-1]);


}
}