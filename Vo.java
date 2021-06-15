import java.util.Scanner;
public class Vo {
   public static void main(String args[]){
      int count = 0;
      System.out.println("Enter a sentence :");
      Scanner sc = new Scanner(System.in);
      String s= sc.nextLine();

      for (int i=0 ; i<s.length(); i++){
         char ch = s.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
            count ++;
         }
      }
      System.out.println(count);
   }
}