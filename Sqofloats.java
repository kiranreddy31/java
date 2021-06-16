import java.util.*;
import java.io.*;
class Sqofloats{
    public static float[] square(int n,int o,int p, int r)
    {
        
      
          float r1=n*n;
          float r2=o*o;
         float r3=p*p;
          float r4=r*r;
          return new float[] {r1,r2,r3,r4};      
    }
    public static void main (String[] args) {
        
       
        float[] arr=square(10,11,12,13); 
        System.out.println(Arrays.toString(arr));
    }
}