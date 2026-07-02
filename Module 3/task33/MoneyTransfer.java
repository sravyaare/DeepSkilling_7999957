import java.sql.Connection;
import java.sql.PreparedStatement;

public class MoneyTransfer {

    public static void transferMoney(int fromAcc,
                                     int toAcc,
                                     double amount) {

        try {

            Connection con =
                    DatabaseConnection.getConnection();

            con.setAutoCommit(false);

            String debitQuery =
                    "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";

            String creditQuery =
                    "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

            PreparedStatement debit =
                    con.prepareStatement(debitQuery);

            debit.setDouble(1, amount);
            debit.setInt(2, fromAcc);

            int debitResult = debit.executeUpdate();

            PreparedStatement credit =
                    con.prepareStatement(creditQuery);

            credit.setDouble(1, amount);
            credit.setInt(2, toAcc);

            int creditResult = credit.executeUpdate();

            if (debitResult > 0 && creditResult > 0) {

                con.commit();

                System.out.println(
                        "Transaction Successful. Amount Transferred.");
            }
            else {

                con.rollback();

                System.out.println(
                        "Transaction Failed.");
            }

            con.close();

        }
        catch(Exception e) {

            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        transferMoney(101,102,1000);
    }
}