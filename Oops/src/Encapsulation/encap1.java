package Encapsulation;

import java.util.Scanner;

public class encap1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Student st=new Student();
System.out.println("enter the name");
st.setName(s.next());
System.out.println("enter the id");
st.setId(s.nextInt());
System.out.println("enter department");
st.setDep(s.next());
System.out.println("name:"+st.getName());
System.out.println("id:"+st.getId());
System.out.println("dep:"+st.getDep());
	}

}
