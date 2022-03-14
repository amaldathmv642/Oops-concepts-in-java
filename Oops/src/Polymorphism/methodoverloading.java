package Polymorphism;

import java.util.Scanner;

public class methodoverloading 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n1=s.nextInt();
System.out.println("enter number");
int n2=s.nextInt();
System.out.println("enter number");
int n3=s.nextInt();
sum a=new sum();
a.add(n1);
a.add(n1,n2,n3);
a.add(n1,n2);
	}

}
class sum
{

	public void add(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
	System.out.println("sum(n1+n2+n3)="+(n1+n2+n3));	
	}

	public void add(int n1, int n2) {
		// TODO Auto-generated method stub
System.out.println("sum(n1+n2)="+(n1+n2));		
	}

	public void add(int n1) {
		// TODO Auto-generated method stub
		System.out.println("sum(n1)="+n1);
	}}