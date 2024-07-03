import java.lang.String;
import java.util.*;
class Trim
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       	String str="   Java    lang     ";	
	System.out.println(str.length());
	String str1=str.trim();
	System.out.println(str1.length());
	System.out.println(str1);
    }
}


