import java.lang.String;
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
class Marks 
{
int  mat=76,phy=85,che=67;
void show()
{
Student s1=new Student();
s1.display();
System.out.println("admno="+s1.admno);
System.out.println("Name="+s1.name);
System.out.println("Mat="+mat);
System.out.println("Phy="+phy);
System.out.println("Che="+che);
}
}
class Test25
{
public static void main(String args[])
{
Marks m1=new Marks();
m1.show();
}
}


