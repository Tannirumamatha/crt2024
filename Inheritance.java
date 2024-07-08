import java.util.Scanner;
class Student
{
int admno=111;
String name="sss";
void display()
{
System.out.println("---------------");
System.out.println("Student Report");
System.out.println("---------------");
}
}
class Marks extends Student
{
int  mat=76,phy=85,che=67;
void show()
{
System.out.println("admno="+admno);
System.out.println("Name="+name);
System.out.println("Mat="+mat);
System.out.println("Phy="+phy);
System.out.println("Che="+che);
}
}
class Inheritance
{
public static void main(String args[])
{
Student s1=new Student();
s1.display();
Marks m1=new Marks();
m1.display();
m1.show();
}
}


