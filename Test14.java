import java.util.*;
class Test14
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int j=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]!=0)
			a[j++]=a[i];
	}
	while(j<n)
	{
		a[j++]=0;
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}

    }
}


