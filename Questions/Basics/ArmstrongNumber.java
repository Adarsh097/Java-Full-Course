import java.util.*;

public class ArmstrongNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String  num = sc.nextLine();

        int sum = 0;

        int len = num.length();

        for(int i=0;i<len;i++){
            // sum += Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),len);
            sum += (int)Math.pow(num.charAt(i)-'0',len);
        }

        if(sum == Integer.parseInt(num)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
    

}