import java.util.*;
class Constructor
{
	void show()
	{
		System.out.println("Show method");
	}
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.show();
	}
}
class Test
{
	void show()
	{
		System.out.println("Show method");
	}
	Test()
	{ }
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.show();
	}

}



