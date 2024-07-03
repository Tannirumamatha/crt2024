import java.util.*;
class Split1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       	String str="Java is simple language";	
	String res[]=str.split(" ");
	System.out.println(Arrays.toString(res));
	String res1[]=str.split("simple");
	System.out.println(Arrays.toString(res1));
    }
}


