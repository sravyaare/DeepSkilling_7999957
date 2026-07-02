import java.util.Scanner;

public class TryCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = sc.nextInt();

        try {

            int result = firstNumber / secondNumber;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");

        }

        sc.close();
    }
}