import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter 1st number: ");
            double a = sc.nextDouble();

            System.out.print("Enter 2nd number: ");
            double b = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result;

            switch (op) {
                case '+':
                    result = a + b;
                    System.out.println("Result = " + result);
                    break;

                case '-':
                    result = a - b;
                    System.out.println("Result = " + result);
                    break;

                case '*':
                    result = a * b;
                    System.out.println("Result = " + result);
                    break;

                case '/':
                    if (b == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = a / b;
                        System.out.println("Result = " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid operator! Please use +, -, *, or /.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }

        sc.close();
    }
}