/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the sentence : 2
 * 
 * Process
 * ----------
 * The word Home present in the sentence 2 times
 */

import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String target = sc.nextLine();

        // Remove punctuation
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");

        String[] words = sentence.split("\\s+");

        int count = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(target)) {
                count++;
            }
        }

        System.out.println("Number of that word present in the sentence : " + count);
    }
}
// str.replaceAll("[^a-zA-Z]",""), str.split("\\s+")