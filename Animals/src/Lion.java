import java.lang.*;
public class Lion extends Feline
{
	void makeNoise()
	 {
		 System.out.println("Lion Making Noise");
	 }
	 void eat()
	 {
		System.out.println("Lion is eating"); 
	 }
	 public void roam() {
		 System.out.println("Lion is roam which is in Feline"); 	 
	 }
	 public static void main(String args[])
	 {
	    Feline obj=new Lion();
	   
	    	obj.roam();
	       }

}
