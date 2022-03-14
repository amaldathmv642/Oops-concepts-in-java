package Patternprinting;

import java.util.Scanner;

public class rhombus 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a limit");
		int a=s.nextInt();
		for(int i=a;i>0;i--)
		{
			for(int j= a;j>=i;j--)
			{
			System.out.printf(" "+" ");	
			}
			for(int k = i-1;k>=0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
for(int i=1;i<a;i++)
{
	for(int j=i;j<a;j++)
	{
		System.out.print(" "+" ");
		
	}
	for(int k=0;k<=i;k++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	}

}
