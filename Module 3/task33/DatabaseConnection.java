import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() throws Exception {

        String url = "jdbc:mysql://localhost:3306/BankDB";
        String user = "root";
        String password = "sravya123";

        return DriverManager.getConnection(url, user, password);
    }
}