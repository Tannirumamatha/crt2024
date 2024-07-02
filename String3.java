import java.util.*;
class String3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.next();
{
        int alphabetCount = 0;
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int specialSymbolCount = 0;

        for (int i = 0; i < inputString.length(); i++)
 {
            char currentChar = inputString.charAt(i);
            if (Character.isLetter(currentChar))
 {
                alphabetCount++;
                if (Character.isUpperCase(currentChar)) {
                    upperCaseCount++;
                } else if (Character.isLowerCase(currentChar)) {
                    lowerCaseCount++;
                }
            } else if (Character.isDigit(currentChar)) {
                digitCount++;
            } else {
                specialSymbolCount++;
            }
        }

        System.out.println("Number of Alphabets: " + alphabetCount);
        System.out.println("Number of Uppercase Letters: " + upperCaseCount);
        System.out.println("Number of Lowercase Letters: " + lowerCaseCount);
        System.out.println("Number of Digits: " + digitCount);
        System.out.println("Number of Special Symbols: " + specialSymbolCount);
    }
}
}



