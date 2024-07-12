import java.util.*;
class ExpHand5
{
public static void main(String args[])
{
try
{
System.out.println(10/2);
int a[]={34,65,12};
System.out.println(a[3]);
}
catch(ArithmeticException e)
{
System.out.println(10/2);
}
catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println("Array out of range");
}
System.out.println("End of program");
}
}