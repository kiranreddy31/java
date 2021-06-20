import java.lang.*;
public class Tiger extends Feline implements Animals
{
	public void makeNoise()
	 {
		 System.out.println("Tiger Making Noise");
	 }
	public void eat()
	 {
		System.out.println("Tiger is eating"); 
	 }
	 public void roam() {
		 System.out.println("tiger is roam which is in Feline"); 	 
	 }
	 public static void main(String args[])
	 {
	    Feline obj1=new Tiger();
	   
	    	obj1.roam();
	       }

}
