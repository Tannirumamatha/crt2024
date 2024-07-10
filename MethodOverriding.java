import java.util.*;
class Father
{
    void surName()
    {
	System.out.println("k");
    }
    void designation()
    {
	System.out.println("Clerk");
    }
}
class Child extends Father
{
	void getName()
	{
		System.out.println("Satish ");
	}
	void designation()
    	{
		System.out.println("Java programmer ");
    	}

}
class MethodOverriding
{
    public static void main(String[] args)
    {
    	Child c1=new Child();
	c1.getName();
	c1.surName();
	c1.designation();	   
    }
}
