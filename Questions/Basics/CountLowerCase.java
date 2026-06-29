import java.util.*;

public class CountLowerCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str  = sc.nextLine();

        int cnt = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                cnt++;
            }
        }
        System.out.println("Number of lower case characters is: "+cnt);
    }
}