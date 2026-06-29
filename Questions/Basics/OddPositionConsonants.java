import java.util.*;

public class OddPositionConsonants {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // odd position in 1-based indexing
            if ((i + 1) % 2 != 0 &&
                Character.isLetter(ch) &&
                !isVowel(ch)) {
                System.out.print(ch);
            }
        }
    }
}

