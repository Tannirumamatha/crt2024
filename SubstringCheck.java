import java.lang.String;
import java.util.*;
class SubstringCheck
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.contains(str2))
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    }
}


