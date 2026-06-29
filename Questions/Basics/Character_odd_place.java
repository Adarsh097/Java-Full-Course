/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/


import java.util.*;

public class Character_odd_place{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String ans = "";

        for(int i=0;i<str.length();i++){
            if((i&1)==1){
                ans += String.valueOf(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}

// str.length(), String.valueOf(), str.charAt(index)