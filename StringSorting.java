import java.util.*;
import java.lang.String;
class StringSorting
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String s1[]=new String[n];
	for(int i=0;i<n;i++)
	{
	s1[i]=s.next();
	}
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(s1[i].compareTo(s1[j])>0)
			{
				String t=s1[i];
				s1[i]=s1[j];
				s1[j]=t;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
	System.out.println(s1[i]);
	}
	}
}
