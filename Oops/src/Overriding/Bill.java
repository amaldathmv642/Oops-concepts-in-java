package Overriding;

import java.util.Scanner;

public class Bill 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
System.out.println("           Please Enter Telephone Bill Details");
System.out.println("           ***********************************");
System.out.println("Enter Telephone Bill Number:");
int a=s.nextInt();
System.out.println("Enter Customer Name:");
String b=s.next();
System.out.println("Enter the Number Of Calls made:");
int c=s.nextInt();
System.out.println("Enter The Cost per Call:");
double d=s.nextDouble();
System.out.println("           Please Enter Current Bill Details");
System.out.println("           *********************************");
System.out.println("Enter the Current Bill Number:");
int p=s.nextInt();
System.out.println("Enter The Customer Name:");
String q=s.next();
System.out.println("Enter The Number Of Units Consumed:");
int r=s.nextInt();
System.out.println("Enter The Cost Per Unit");
double t=s.nextDouble();
telephonebill tb=new telephonebill();
currentbill cb=new currentbill();
tb.bill( a, b, c, d);
cb.bill(p, q, r, t);
	}

}
class telephonebill extends Bill
{
	public void bill(int a,String b,int c,double d)
	{
		System.out.println("        Telephone Bill Details");
		System.out.println("        -----------------------");
		 
		
		System.out.println("Bill Number:"+a);
		System.out.println("Customer Name:"+b);
		double cost=c*d;
		System.out.println("Telephone Bill Cost:"+cost);
		System.out.println();
	}
}
class currentbill extends Bill
{
	public void bill(int p,String q,int r,double t)
	{
		System.out.println("        Current Bill Details");
		System.out.println("        ---------------------");
		System.out.println("Bill Number:"+p);
		System.out.println("Customer Name:"+q);
		double cost=r*t;
		System.out.println("Current Bill Cost:"+cost);
	}
}


