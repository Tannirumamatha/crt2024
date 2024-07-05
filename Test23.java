import java.lang.String;
import java.util.*;
class Test23
{
	int a=10,b=20;

	void show(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String args[])
	{
		Test23 t1=new Test23();
		t1.show(100,200);
	}
}