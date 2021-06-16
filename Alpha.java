import java .lang.*;
import java .util.*;
public class Alpha
{
    public void alphabet()
    {
        char[] a=new char[26];
       char c;
       int j=0;

    for(c = 'A'; c <= 'Z'; ++c){
       a[j]=c;
       j++;
    }
    for(int i=0 ;i<26;i++)
    {
      System.out.print(a[i] + "");
    }
}
    public static void main (String[] args)
    {
    Alpha o=new Alpha();
    o.alphabet();
    
}
}