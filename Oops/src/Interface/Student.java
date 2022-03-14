package Interface;

import java.util.Scanner;

public class Student 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
	System.out.println("Enter total mark");
	int total=s.nextInt();
	Student1 st=new Student1();
	System.out.println("enter name");
	String name=s.next();
	System.out.println("enter id");
	int id=s.nextInt();
	st.detail(name,id);
	st.total(total);
		
	}

}
interface rank
{
	public void detail(String name,int id);
}
interface total
{
	public void total(int total);
}
class Student1 implements rank,total
{
	public void detail(String name,int id)
	{
		System.out.println("Name "+name);
		System.out.println("Student id:"+id);
	}
	public void total(int total)
	{
		System.out.println("total "+total);
	}
}






