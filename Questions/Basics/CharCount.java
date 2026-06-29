/* Find occurance of a character in a string
    Input
    --------------
 *  Priyanka
 *  a
 
 *  Output
    ----------------
 *  2
 */
import java.util.*;

public class CharCount{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the str: ");
      String str = sc.nextLine();

      System.out.println("Enter the Character: ");
      char ch = sc.next().charAt(0);

      int cnt = 0;
      for(int i=0;i<str.length();i++){
         if(str.charAt(i)==ch){
            cnt++;
         }
      }
      System.out.println("Count of the Char: "+cnt);
   }
}