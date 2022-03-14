package Oops;

public class RECURSION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int result=sum(10);
     System.out.println(result);//printing result
     
   	}
public static int sum(int k)
{
	if(k>0)
	{
		return k+sum(k-1);//k+sum(9) k+sum(8)..
	}
	else
		{
		return 0;
		}
}
}
