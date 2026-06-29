import java.util.*;
public class Code {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(9);
        st.push(1);


        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);

        for(Integer i : st){
            System.out.println(i);
        }

        // while(st.size() > 0){
        //     System.out.println(st.pop());
        // }

        System.out.println(st.search(7));
    }
}