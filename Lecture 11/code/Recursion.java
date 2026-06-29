import java.util.*;
public class Recursion{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int factorial = getFactorial(num);

        System.out.println(factorial);

    }

    static int getFactorial(int num){
        if(num==0)return 1;


        return num * getFactorial(num-1);
    }
}