import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String userText = sc.nextLine();

        try {

            FileWriter writer = new FileWriter("output.txt");
            writer.write(userText);
            writer.close();

            System.out.println("Data has been written to output.txt successfully.");

        } catch (IOException e) {

            System.out.println("Error while writing to the file.");
        }

        sc.close();
    }
}