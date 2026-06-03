import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();

        System.out.print("How many student names do you want to add? ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= count; i++) {

            System.out.print("Enter student name " + i + ": ");
            String name = sc.nextLine();

            studentNames.add(name);
        }

        System.out.println("\nStudent Names:");

        for (String name : studentNames) {
            System.out.println(name);
        }

        sc.close();
    }
}