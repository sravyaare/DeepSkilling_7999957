public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager =
                new EmployeeManager(10);

        manager.addEmployee(
                new Employee(
                        101,
                        "Sravya",
                        "Software Engineer",
                        60000));

        manager.addEmployee(
                new Employee(
                        102,
                        "Rahul",
                        "Tester",
                        45000));

        manager.addEmployee(
                new Employee(
                        103,
                        "Priya",
                        "Business Analyst",
                        55000));

        manager.traverseEmployees();

        System.out.println(
                "\nSearch Result");

        Employee employee =
                manager.searchEmployee(102);

        if (employee != null) {

            System.out.println(employee);
        }

        System.out.println();

        manager.deleteEmployee(102);

        manager.traverseEmployees();
    }
}