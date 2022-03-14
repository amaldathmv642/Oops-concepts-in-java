package Interface;

public class Cube implements Shape 
{

	int x=10;
	
	public void Area()
	{
		System.out.println(6*x*x);
	}
	public void volume()
	{
	System.out.println(x*x*x);
	}
}
