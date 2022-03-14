package Patternprinting;

import java.util.Scanner;

public class Example1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a limit");
		int a=s.nextInt();
		for(int i = 1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
		
			}
			System.out.println();
		}

	}

}
