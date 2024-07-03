import java.util.*;
class Buff1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       	StringBuffer str1 = new StringBuffer("Java");	
	StringBuffer str2=new StringBuffer("Language");
	System.out.println(str1);
	System.out.println(str2);
	str1.append(str2);
	System.out.println(str1);
    }
}


