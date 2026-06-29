/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */



import java.util.*;

public class Consecutive2vowels{
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        int ans = 0;
        for(String word : words){
            for(int i=0;i<word.length()-1;i++){
                if(isVowel(word.charAt(i)) && isVowel(word.charAt(i+1))){
                    ans++;
                    break;
                }
            }
        }
        System.out.print(ans);
    }
}

// String[] words =  str.split(" "), str.length(), str.charAt(index)