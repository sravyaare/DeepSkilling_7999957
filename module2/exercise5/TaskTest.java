public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList taskList =
                new TaskLinkedList();

        taskList.addTask(
                new Task(
                        101,
                        "Design Database",
                        "Completed"));

        taskList.addTask(
                new Task(
                        102,
                        "Develop API",
                        "In Progress"));

        taskList.addTask(
                new Task(
                        103,
                        "Testing",
                        "Pending"));

        taskList.displayTasks();

        System.out.println(
                "\nSearch Result");

        Task task =
                taskList.searchTask(102);

        if (task != null) {

            System.out.println(task);
        }

        System.out.println();

        taskList.deleteTask(102);

        taskList.displayTasks();
    }
}