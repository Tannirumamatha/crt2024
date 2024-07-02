import java.lang.String;
import java.util.*;
class Test11

{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int alp=0;
        int up=0;
        int low=0;
        int dig=0;
        int sp=0;
        for (int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            if (Character.isLetter(ch))
            {
                alp++;
                if (Character.isUpperCase(ch))
                {
                    up++;
                }
                else if (Character.isLowerCase(ch))
                {
                    low++;
                }
            } 
            else if (Character.isDigit(ch))
            {
                dig++;
            }
            else
            {
                sp++;
            }
        }

        System.out.println("Alphabets:" + alp);
        System.out.println("Uppercase Letters: " + up);
        System.out.println("Lowercase Letters: "+low);
        System.out.println("Digits: " + dig);
        System.out.println("Special Symbols: " + sp);
    }
}




