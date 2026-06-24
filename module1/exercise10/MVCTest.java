public class MVCTest {

    public static void main(String[] args) {

        Student student =
                new Student(
                        "Sravya",
                        101,
                        "A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(
                        student,
                        view);

        System.out.println("Initial Student Record");
        controller.updateView();

        System.out.println();

        controller.setStudentName("Sravya Reddy");
        controller.setStudentGrade("A+");

        System.out.println("Updated Student Record");
        controller.updateView();
    }
}