public class Main {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        dao.insertStudent(
                101,
                "Rahul",
                20);

        dao.updateStudent(
                101,
                "Rahul Kumar");
    }
}