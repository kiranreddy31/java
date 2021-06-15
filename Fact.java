import java.util.*;
import java.io.*;
public class Fact
{
     public static void main (String[] args)
     {
	
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        Fact O=new Fact();
        O.factorical(n);
 
    }
    void  factorical(int k)
    {
        int n=k,fact=1;;
	       for(int i=1;i<=n;i++)
	  	  {
 
	    	   fact=fact*i;
 	 	  }
 
 	        System.out.println("factoral="+fact);
    }
}