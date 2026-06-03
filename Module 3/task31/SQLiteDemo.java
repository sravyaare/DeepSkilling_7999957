import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLiteDemo {

    public static void main(String[] args) {

        String url = "jdbc:sqlite:students.db";

        try {

            Connection connection = DriverManager.getConnection(url);

            Statement statement = connection.createStatement();

            statement.execute(
                "CREATE TABLE IF NOT EXISTS students (" +
                "id INTEGER PRIMARY KEY," +
                "name TEXT," +
                "age INTEGER)"
            );

            statement.execute(
                "INSERT OR IGNORE INTO students VALUES (101,'Sravya',20)"
            );

            statement.execute(
                "INSERT OR IGNORE INTO students VALUES (102,'Anjali',21)"
            );

            statement.execute(
                "INSERT OR IGNORE INTO students VALUES (103,'Rahul',22)"
            );

            ResultSet rs =
                statement.executeQuery("SELECT * FROM students");

            System.out.println("Student Records");

            while (rs.next()) {

                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age")
                );
            }

            rs.close();
            statement.close();
            connection.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}