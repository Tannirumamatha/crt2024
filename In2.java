import java.lang.String;
class GrandFather
{
String name;
int p1;
void getGrandFather(String name,int p1)
{
this.name=name;
this.p1=p1;
}
void showGrandFather()
{
System.out.println("GrandFather name="+name);
System.out.println("GrandFather property="+p1);
}
}
class Father extends GrandFather
{
String fname;
int p2;
void getFather(String fname,int p2)
{
this.fname=fname;
this.p2=p2;
}
void showFather()
{
System.out.println("Father name="+fname);
System.out.println("Father property="+p2);
System.out.println("Father total="+(p1+p2));
}
}
class Daughter extends Father
{
String dname;
int p3;
void getDaughter(String dname,int p3)
{
this.dname=dname;
this.p3=p3;
}
void showDaughter()
{
System.out.println("Daughter name="+dname);
System.out.println("Daughter property="+p3);
System.out.println("Daughter total="+(p1+p2+p3));
}
}

class In2
{
public static void main(String args[])
{
Daughter d1=new Daughter();
d1.getFather("rrr",200000);
d1.showFather();
d1.getDaughter("ccc",300000);
d1.showDaughter();
}
}


