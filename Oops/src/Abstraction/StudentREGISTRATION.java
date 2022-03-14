package Abstraction;

import java.util.Scanner;

public class StudentREGISTRATION {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Registration");
System.out.println("enter name");
String name=s.next();
System.out.println("enter email id");
String email=s.next();
System.out.println("enter age");
int age=s.nextInt();
System.out.println("enter adress");
String adress=s.next();
System.out.println("contact number");
int cnum=s.nextInt();
Registration r=new Registration();
r.display(name, email, age, adress, cnum);
r.update(name, email, age, adress, cnum);
	}

}
