package Patternprinting;

import java.util.Scanner;

public class DiamondPattern 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a limit");
		int a=s.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j = a;j>i;j--)
			{
				System.out.printf(" ");
			}
			for(int k=0;k<(i*2)-1;k++)
			{
				
			System.out.print("*");
			}
		
	
			System.out.println();
		}
for(int i = a-1;i>0;i--)
{
	for(int j = a-1;j>=i;j--)
	{
	System.out.printf(" ");	
	}
	for(int k=2*i-1;k>0;k--)
	{
		System.out.print("*");
	}
	System.out.println();
}
	}

}

