import java.io.*;
import java.util.*;
class sum_average
{
  public static void main(String args[])
{
 Scanner sc=new  Scanner(System.in);
 int n, sum = 0;
     float average;
        Scanner s = new Scanner(System.in);
     
        n = s.nextInt();
        int a[] = new int[n];
       
        for(int i = 0; i < n ; i++)
        {
 a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
}
}
