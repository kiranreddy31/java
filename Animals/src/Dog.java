import java.lang.*;
public class Dog extends Canine
{
	public void makeNoise()
	 {
		 System.out.println("Dog Making Noise");
	 }
	public  void eat()
	 {
		System.out.println("Dog is eating"); 
	 }
	 public void roam() {
		 System.out.println("Dog is roam which is in Canine"); 	 
	 }
	 public void sleep()
	 {
		 System.out.println("Sleepingof dog");
	 }
	 public static void main(String args[])
	 {
	    Canine obj=new Dog();
	   
	    	obj.roam();
	       }

}
