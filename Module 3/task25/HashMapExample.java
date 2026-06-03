import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> studentRecords = new HashMap<>();

        System.out.print("How many students do you want to add? ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= count; i++) {

            System.out.print("Enter Student ID: ");
            int studentId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String studentName = sc.nextLine();

            studentRecords.put(studentId, studentName);
        }

        System.out.print("\nEnter Student ID to search: ");
        int searchId = sc.nextInt();

        if (studentRecords.containsKey(searchId)) {
            System.out.println("Student Name: " + studentRecords.get(searchId));
        } else {
            System.out.println("Student ID not found.");
        }

        sc.close();
    }
}