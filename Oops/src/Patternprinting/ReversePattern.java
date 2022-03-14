package Patternprinting;

import java.util.Scanner;

public class ReversePattern 
{

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int a=s.nextInt();
		for(int i = 1;i<=a;i++)
		{
		for(int j =a;j>i;j--)
		{
			System.out.printf(" ");
		}
			for(int k=0;k<i;k++)
			{
				System.out.printf("*");
			}
			System.out.println();
		}
			
		

	}

}
