import java .lang.*;
import java .util.*;
public class Main5rand
{
    public void ranD()
    {
        int min=1,max=50;
        
        System.out.println("Random value of type int between "+min+" to "+max+ ":");  
        int b = (int)(Math.random()*(max-min+1)+min);  
       System.out.println(b);  
    }
    public static void main (String[] args)
    {
    Main5rand o=new Main5rand();
    o.ranD();
    
}
}