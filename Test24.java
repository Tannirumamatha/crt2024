import java.lang.String;
import java.util.*;
class Student
{
	int admno,mat,phy,che;
	String name;

	void get(int admno,String name,int mat,int phy,int che)
	{
		this.admno=admno;
		this.name=name;
		this.mat=mat;
		this.phy=phy;
		this.che=che;
	}
	void show()
	{
		System.out.println(admno+" "+name+" "+mat+" "+phy+" "+che);
	}
}
class Test24
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.get(111,"aaa",98,55,77);
		s1.show();
		Student s2=new Student();
		s2.get(222,"kkk",88,78,33);
		s2.show();
		
	}
}