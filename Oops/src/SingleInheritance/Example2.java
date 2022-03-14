package SingleInheritance;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
System.out.println("enter your name");
String name=s.next();
System.out.println("enter age");
int age=s.nextInt();
System.out.println("choose department");
String dep=s.next();
registration obj=new registration();

obj.reg(name, age, dep);
obj.mark();
	}

}
class student
{
	public static void mark()

	{
		
		int m1= 10;
		System.out.println("maths: "+m1);
		int m2= 20;
		System.out.println("chemistry: "+m2);
		int m3= 25;
		System.out.println("physics: "+m3);
		
	
	int total=m1+m2+m3;
	System.out.println("total mark is "+total);
	
	}
}
class registration extends student
{
	public static void reg(String name,int age,String dep)
	{
		System.out.println("student details");
		System.out.println("-----------------");
		System.out.println("department is "+name);
		System.out.println("age is "+age);
		System.out.println("department is "+dep);
	}
}



