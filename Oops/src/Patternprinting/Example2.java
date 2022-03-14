package Patternprinting;

import java.util.Scanner;

public class Example2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	Scanner s=new Scanner(System.in);
	System.out.print("enter a limit");
	int a=s.nextInt();
	for(int i = 1;i<=a;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
	System.out.println();	
	}
		

	}

}
