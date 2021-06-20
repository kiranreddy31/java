import java.awt.SystemColor;
import java.lang.*;
public class Wolf extends Canine
{
 public  void makeNoise()
 {
	 System.out.println("wolf Making Noise");
 }
 public void eat()
 {
	System.out.println("Wolf is eating"); 
 }
 public void sleep()
 {
	 System.out.println("Sleepingof wolf");
 }
 public void roam() {
	 System.out.println("wolf is roam which is in Canine"); 	 
 }
 public static void main(String args[])
 {
    Canine obj2=new Wolf();
   
    	obj2.roam();
       }
	 
 

}
