import java.lang.String;
import java.util.*;
class Sample
{
	void m1()
	{
		System.out.println("Instance method");
	}
}

class Test21
{
	public static void main(String args[])
	{
		Sample s1=new Sample();
		s1.m1();
		
	}
}