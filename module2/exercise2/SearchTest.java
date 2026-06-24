public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(
                        101,
                        "Laptop",
                        "Electronics"),

                new Product(
                        102,
                        "Keyboard",
                        "Accessories"),

                new Product(
                        103,
                        "Headphones",
                        "Electronics"),

                new Product(
                        104,
                        "Smart Watch",
                        "Wearables"),

                new Product(
                        105,
                        "Printer",
                        "Office")
        };

        System.out.println(
                "Linear Search Result");

        Product linearResult =
                SearchOperations.linearSearch(
                        products,
                        104);

        if (linearResult != null) {
            System.out.println(linearResult);
        }

        System.out.println();

        System.out.println(
                "Binary Search Result");

        Product binaryResult =
                SearchOperations.binarySearch(
                        products,
                        104);

        if (binaryResult != null) {
            System.out.println(binaryResult);
        }
    }
}