package Oops;

import java.util.Scanner;

public class Adding {
	public static void Mymethod() {
	System.out.println("i just executed");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter first number");
  int  a=s.nextInt();
  System.out.println("enter second number");
  int b=s.nextInt();
  int result=add(a,b);
  System.out.println(result);
	}
 public static int add(int x,int y)
 {
 return x+y;
}}
