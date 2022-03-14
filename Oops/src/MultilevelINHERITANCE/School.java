package MultilevelINHERITANCE;

import java.util.Scanner;

public class School
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter name ");
String name=s.next();
System.out.println("enter roll no ");
int no=s.nextInt();
System.out.println("enter age ");
int age=s.nextInt();
Student obj=new Student();
System.out.println("enter principal name");
String princ=s.next();
System.out.println("enter teacher name");
String teach=s.next();
obj.print( princ);
obj.task( teach);
obj.details( name,no,age);
	}

}
