import java.util.*;
import java.lang.String;
class Palindrome
{
	public static void msin(String[] args)
	{
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	if(s1.equals(s2))
	 System.out.println("Palindrome");
	else
	 System.out.println("Not a Palindrome");
	}
}
