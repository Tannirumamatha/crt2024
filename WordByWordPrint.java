import java.lang.String;
import java.util.*;
class Join
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String res[]={"C","CPP","Java","Python"};
	String str1=String.join(" ",res);
	System.out.println(str1);
	String str2=String.join("-",res);
	System.out.println(str2);
	String str3=String.join("language ",res);
	System.out.println(str3);
	String str4=String.join("",res);
	System.out.println(str4);
	{
            System.out.println(str4);
        }
    }
}


