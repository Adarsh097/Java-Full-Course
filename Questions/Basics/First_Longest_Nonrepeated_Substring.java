import java.util.*;

public class First_Longest_Nonrepeated_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Set<Character> set = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                break;
            }

            set.add(ch);
            ans.append(ch);
        }

        System.out.println(ans);
    }
}

/*
StringBuilder sb = new StringBuilder("Hello");

sb.append("Java")
sb.insert(0,"Hello")
sb.delete(0,5)
sb.reverse()
sb.charAt(index)
sb.length()
sb.setCharAt(0,'J')
String str = sb.toString();

- Use String for normal text.
- Use StringBuilder when building/modifying strings repeatedly.
- Use StringBuffer only when thread safety is required

*/