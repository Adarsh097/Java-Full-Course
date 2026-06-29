// aabbbcc = a2b3c2
// abbccc = a1b2c3

import java.util.*;

public class CharRepeat {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char ch = str.charAt(0);
        int cnt = 1;
        String ans = "";

        for(int i=1 ;i<str.length();i++){
            if(str.charAt(i)==ch){
                cnt++;
            }else{
                ans += String.valueOf(ch) + cnt;
                ch = str.charAt(i);
                cnt = 1;
            }
        }
        ans += String.valueOf(ch) + cnt;
        System.out.println(ans);
    }
}

// str.length(), String.valueOf(), str.charAt(index)