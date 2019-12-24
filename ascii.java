import java.io.*;
import java.util.*;
public class ascii {
public static void main(String []args) {
Scanner sc=new Scanner(System.in);
int n,i,sum=0;

n=sc.nextInt();
int[] a=new int[n];

for(i=0;i<n;i++) {
a[i]=sc.nextInt();
}
for(i=0;i<n;i++) {
System.out.println((char)a[i]);
}
}
}