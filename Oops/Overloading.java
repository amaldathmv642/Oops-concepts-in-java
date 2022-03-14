package Oops;

public class Overloading {

	
		// TODO Auto-generated method stub
  public static int plus(int x,int y)
  {
	  return x+y;
	  
  }
  static double plus(double x,double y)
  {
	  return x+y;
  }
  public static void main(String[] args) {
	  int mynum1=plus(4,5);
	  double mynum2=plus(4.3,5.3);
	  System.out.println(mynum1);
	  System.out.println(mynum2);
	}

}
