import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public void insertStudent(int id,String name,int age) {

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "INSERT INTO students VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3,age);

            int rows = ps.executeUpdate();

            System.out.println(rows +
                    " record inserted");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public void updateStudent(int id,String name) {

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "UPDATE students SET name=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1,name);
            ps.setInt(2,id);

            int rows = ps.executeUpdate();

            System.out.println(rows +
                    " record updated");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}