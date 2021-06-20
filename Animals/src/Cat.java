import java.lang.*;
public class Cat extends Feline
{
	void makeNoise()
	 {
		 System.out.println("Cat Making Noise");
	 }
	 void eat()
	 {
		System.out.println("Cat is eating"); 
	
	 }
	 public void roam() {
		 System.out.println("Cat is roam which is in Feline"); 	 
	 }
	 
	 public static void main(String args[])
	 {
	    Feline obj=new Cat();
	   
	    	obj.roam();
	       }
	
}
