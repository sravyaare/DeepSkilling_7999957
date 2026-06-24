public class SortingTest {

    public static void main(String[] args) {

        Order[] bubbleOrders = {

                new Order(
                        101,
                        "Sravya",
                        8500),

                new Order(
                        102,
                        "Rahul",
                        4200),

                new Order(
                        103,
                        "Priya",
                        12000),

                new Order(
                        104,
                        "Kiran",
                        6500)
        };

        System.out.println(
                "Orders Before Bubble Sort");

        SortOperations.displayOrders(
                bubbleOrders);

        SortOperations.bubbleSort(
                bubbleOrders);

        System.out.println(
                "\nOrders After Bubble Sort");

        SortOperations.displayOrders(
                bubbleOrders);

        Order[] quickOrders = {

                new Order(
                        201,
                        "Anu",
                        9500),

                new Order(
                        202,
                        "Ravi",
                        3500),

                new Order(
                        203,
                        "Teja",
                        15000),

                new Order(
                        204,
                        "Neha",
                        7000)
        };

        System.out.println(
                "\nOrders Before Quick Sort");

        SortOperations.displayOrders(
                quickOrders);

        SortOperations.quickSort(
                quickOrders,
                0,
                quickOrders.length - 1);

        System.out.println(
                "\nOrders After Quick Sort");

        SortOperations.displayOrders(
                quickOrders);
    }
}