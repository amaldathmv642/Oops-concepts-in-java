package Oops;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=10;
System.out.println(a+""+b);
fibonacci(count-2);
	}

static int a=0,b=1,c=0;
static void fibonacci(int count)
{
if(count>0)
{
	c=a+b;
	a=b;
	b=c;
	System.out.println(""+c);
	fibonacci(count-1);
}
}}