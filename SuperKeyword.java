import java.lang.String;
class Parent
{
int a=100;
int b=200;
}
class Child extends Parent
{
int a=44,b=66;
void show(int a,int b)
{
System.out.println(a+b);
System.out.println(this.a+this.b);
System.out.println(super.a+super.b);
}
}
class SuperKeyword
{
public static void main(String[] args)
{
Child c1=new Child();
c1.show(70,80);
}
}


