package Oops;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,fact=1;
int number=6;
fact=fact(number);
System.out.println("factorial of "+number+" is " +fact);

	}
public static int fact(int k)
{
	if(k==0)
	{
		return 1;
	}
		
	else
	{
		return k*fact(k-1);
	}
	
 
	}
}

