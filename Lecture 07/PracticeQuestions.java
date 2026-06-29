import java.util.*;

public class PracticeQuestions{
    public static void main(String[] args){


        // Check the number is positive or negative
        /* 
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
        */

        // Check the number is even or odd

        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // if(number % 2 == 0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }




        // VOTE ELIGIBILITY

        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();


        // if(age >= 18){
        //     System.out.println("Eligible to vote");
        // }else{
        //     System.out.println("Not eligible to vote");
        // }



        // FIND GREATER NUMBER

        // Scanner sc = new Scanner(System.in);

        // int num1 = sc.nextInt(), num2 = sc.nextInt();

        // if(num1 > num2){
        //     System.out.println(num1 + " is greater than " + num2);
        // }else if(num2 > num1){
        //     System.out.println(num2 + " is greater than " + num1);
        // }else{
        //     System.out.println("Both numbers are equal");
        // }



        // CALCULATOR

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter first number: ");
        // int num1 = sc.nextInt();

        // System.out.println("Enter second number: ");
        // int num2 = sc.nextInt();

        // System.out.println("Enter operator: ");
        // char operator = sc.next().charAt(0);

        // System.out.println("Result: ");
        // switch(operator){
        //     case '+':
        //         System.out.println(num1 + num2);
        //         break;
        //     case '-':
        //         System.out.println(num1 - num2);
        //         break;
        //     case '*':
        //         System.out.println(num1 * num2);
        //         break;
        //     case '/':
        //         if(num2 != 0){
        //             System.out.println(num1 / num2);
        //         }else{
        //             System.out.println("Cannot divide by zero");
        //         }
        //         break;
        //     default:
        //         System.out.println("Invalid operator");
        // }




        // CHECK LEAP YEAR

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if((year % 400 ==0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }


    }
}