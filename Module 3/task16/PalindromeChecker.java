import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        String cleanedText = inputText.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedText = new StringBuilder(cleanedText).reverse().toString();

        if (cleanedText.equals(reversedText)) {
            System.out.println("The entered string is a Palindrome.");
        } else {
            System.out.println("The entered string is not a Palindrome.");
        }

        sc.close();
    }
}