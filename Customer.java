import java.io.*;
import java.util.*;
public class Customer
{ 
     static int k=10;
     final String x="sai";
    void display(int n)
    {
        int sum ;
        sum=k+n;
        System.out.println(sum);
    }
    void display(String s)
    {
        String y=s;
        System.out.println(y.concat(x));
    }
    
    public static void main (String[] args) 
    {
     Customer o1=new Customer();
     Customer O2=new Customer();
     o1.display(10);
     o2.display("kiran");
    }
}