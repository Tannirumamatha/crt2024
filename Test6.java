import java.util.*;
class Test6
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	int mid;
	if(n%2==0)
		mid=n/2;
	else
		mid=n/2+1;
	for(int i=0;i<mid-1;i++)
	{
		for(int j=i+1;j<mid;j++)
		{
			if(a[i]>a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
	System.out.print(a[i]+" ");
	}
}
}
