package Polymorphism;

import java.util.Scanner;

public class OverloadingSHOPPING 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
    shopp c=new shopp();
    int a=0;int b=0;int total=0;
	c.dispaly(a);
    c.display(b,total);
	}

}
class shopp
{
	Scanner s=new Scanner(System.in);
	 int p=500;
	private int a;
	public void dispaly(int a)
	{
		System.out.println("           COLLECTIONS");
		System.out.println("   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Gents      |     Ladies   |      kids");
		System.out.println("______        ____________     ___________" );
		System.out.println("1.shirts       4. sarees            7.cottons");
		System.out.println("2.jeans        5.churidaar      ");
		System.out.println("3.tshirts      6. tops           ");
	
		a=s.nextInt();
}
	public void display(int b,int total) 
	{
		// TODO Auto-generated method stub
switch(a)
		{
		case 1:System.out.println("Shirt price:"+p);
		System.out.println("select number of shirts");
		b=s.nextInt();
	int	total1=p*b;
		break;
		case 2:System.out.println("Jeans price:400");
		break;
		case 3:System.out.println("Tshirt price:350");
		break;
		case 4:System.out.println("Saree price:550");
		break;
		case 5:System.out.println("churidar:300");
		break;
		case 6:System.out.println("Top price:250");
		break;
		case 7:System.out.println("cottons price:200");
		break;
		default:System.out.println("selection invalid");
		break;	
		}
	
	
		
	
}}




