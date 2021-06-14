import java.io.*;
import java.util.*;
import java.lang.*;

public class Main2 extends Oper
{
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		int k,j;
		k=i.nextInt();
		j=i.nextInt();
		Oper s=new Main2();
		s.add(k,j);
		s.sub(k,j);
		s.mult(k,j);
		s.div(k,j);
	}
}
class Oper
{
    
	void add(int a, int b)
	{
		System.out.println("addition: "+(a+b));
	}
	void sub(int a ,int b)
	{
	  System.out.println("subtract: "+(a-b));
	}
	void mult(int a,int b)
	{
       	System.out.println("multiplication: "+(a*b));
	}
	void div(int a,int b)
	{
		System.out.println("division: "+(b/a));
	
	}
}