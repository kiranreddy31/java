import java.util.Scanner;
import java.lang.*;
class Main3 {
  public static void main(String[] args) {
    boolean a,b,c,d,e;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first boolean value: ");
    a = input.nextBoolean();

    System.out.print("Enter second boolean value: ");
    b = input.nextBoolean();
    c=!a;
    System.out.println(c);
    d=a|b;
    System.out.println(d);
    e=(!a & b) | (a & !b);
    System.out.println(e);
    

    

    input.close();
  }

}
