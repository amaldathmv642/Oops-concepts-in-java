package Polymorphism;

import java.util.Scanner;

public class shop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("           COLLECTIONS");
		System.out.println("   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Gents      |     Ladies   |      kids      |");
		System.out.println("___________|______________|________________|" );
		System.out.println("1.shirts   |   4. sarees  |      7.cottons |");
		System.out.println("2.jeans    |   5.churidaar|                |");
		System.out.println("3.tshirts  |   6. tops    |                |");
		System.out.println("____________________________________________");
	System.out.println("select a dress");
	int a=s.nextInt();
	center c=new center();
	c.show(a);
	
	
	c.show();
	
	
	}

}
class center
{

	public void show(int a){
		// TODO Auto-generated method stub
		switch(a)
		{
		case 1:
			System.out.println("shirt price :250");
			break;
		case 2:
			System.out.println("jeans price :300");
			break;
		case 3:
			System.out.println("Tshirt price :280");
			break;
		case 4:
			System.out.println("Saree price :500");
			break;
		case 5:
			System.out.println("Churidar price :350");
			break;
		case 6:
			System.out.println("Tops price :230");
			break;
		case 7:
			System.out.println("cottons price :400");
			break;
			
			 default: System.out.println("invalid selection"); 
			 break;
			 
		}
	}
	
	public void show()
	{
		Scanner p=new Scanner(System.in);
System.out.println("Name of the shop : GRAND TEXTILES");
System.out.println("Bill amount");
int b=p.nextInt();
System.out.println("Total amount : "+b);
System.out.println("THANK YOU");

}}



