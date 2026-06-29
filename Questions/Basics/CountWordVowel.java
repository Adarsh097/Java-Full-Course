/* Count the words in a sentence which are start with vowel. 
 * 
 * Input: Arijit is student of MCA
 * Output: 3
 * 
 * Input: Sara plays tennis
 * Output: No such words
*/

import java.util.*;

public class CountWordVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String line = sc.nextLine();

        String[] words = line.split(" ");

        int cnt = 0;
        for(String word : words){
            char ch = Character.toLowerCase(word.charAt(0));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')cnt++;
        }
        System.out.println("Number of words staring with the vowels: "+cnt);
    }
}