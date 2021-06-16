import java.io.*;
import  java.util.*;

public class Sargs
{
    static void cd(String ...values)
    {
        for(String s:values)
        {
            System.out.println(s);
        }
    }
	public static void main(String[] args)
	{
	   Sargs o=new Sargs();
	    o.cd("kiran","sai");
	    o.cd("reddy","kiran");
	
	}
}
