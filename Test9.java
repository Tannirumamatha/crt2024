import java.util.*;
class Test9
{
public static void main(String[] args);
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
int r=s.nextInt();
for(int r=0;r<=n;r++) 
{
a[i]=a[i+1];
}
a[i]=1;
}
for(int i=0;i<n;i++) 
{
System.out.println(a[i]+" ");
}
}
}

