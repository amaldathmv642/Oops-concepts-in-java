package SingleInheritance;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b obj=new b();
obj.display();
obj.datatype();
	}}
class a
{
	public static void datatype()
	{
		System.out.println("int");
	}
}
class b extends a
{
	int p;
	public static void display()
	{
System.out.println("welcome");

	}
}

