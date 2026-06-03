public class MethodOverloadingDemo {

    // Method with two integers
    static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method with two doubles
    static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method with three integers
    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {

        System.out.println("Sum of two integers: " + add(15, 25));
        System.out.println("Sum of two doubles: " + add(10.5, 4.75));
        System.out.println("Sum of three integers: " + add(5, 10, 15));

    }
}