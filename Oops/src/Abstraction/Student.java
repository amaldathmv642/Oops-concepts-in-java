package Abstraction;

import java.util.Scanner;

public abstract class Student
{
	Scanner s=new Scanner(System.in);
abstract void display(String name,String email,int age,String adress,int cnum);
public  void update(String name,String email,int age,String adress,int cnum)
{
	System.out.println("Thank you for registration");
	int id=1;
	System.out.println("your registration id is"+id);
	System.out.println("Do you want to update your email");
	String str=s.next();
	if(str.equals("y")==true)
	{
	
	System.out.println("enter new email");
	String email1=s.next();
	System.out.println("new email created is: "+email1);
	System.out.println("Student Details");
	System.out.println("name"+name);
	System.out.println("email"+email1);
	System.out.println("age"+age);
	System.out.println("adress"+adress);
	System.out.println("contact number"+cnum);
	
	}
	else
	{
		return;
	}
	
	
	
}}
