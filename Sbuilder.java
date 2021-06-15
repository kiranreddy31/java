import java.util.*;
import java.io.*;
public class Sbuilder{
     public static void main (String[] args) {
        
       StringBuilder s = new StringBuilder("Hello mutable string. ");
 
                 System.out.println(s);
                 s.append("Another string added");
                 System.out.println(s);
                 s.insert(1,"java");
                 System.out.println(s);
                 s.reverse();
                 System.out.println(s);
                 s.replace(1,3,"sai");
                 System.out.println(s);
    }
}